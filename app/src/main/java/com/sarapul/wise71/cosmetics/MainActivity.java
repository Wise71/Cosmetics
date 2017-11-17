package com.sarapul.wise71.cosmetics;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.sarapul.wise71.cosmetics.models.E1WPW01;
import com.sarapul.wise71.cosmetics.models.Group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    private String API_BASE_URL = "https://schatbackend.herokuapp.com/";
    private RecyclerView recyclerView;
    private ProductExpandableAdapter mProductExpandableAdapter;
    private Button mSortNameButton, mSortIdButton;
    private List<E1WPW01> products;
    private Response<Group> mResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this, LinearLayoutManager.VERTICAL, false));
        mSortNameButton = findViewById(R.id.sortNameButton);
        mSortIdButton = findViewById(R.id.sortIdButton);
        mSortNameButton.setOnClickListener(this);
        mSortIdButton.setOnClickListener(this);

        ViewDialog alert = new ViewDialog();
        alert.showDialog(this, this::getProducts);
    }

    public void getProducts(String url){
        final ProgressDialog loading = ProgressDialog.show(this,"Получение данных","Пожалуйста подождите...",false,false);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        ProductAPI api = retrofit.create(ProductAPI.class);

        Call<Group> call = api.getProducts(url);
        call.enqueue(new Callback<Group>() {
            @Override
            public void onResponse(@NonNull Call<Group> call,
                                   @NonNull Response<Group> response) {
                mResponse = response;
                updateUI();
                loading.dismiss();
            }

            @Override
            public void onFailure(@NonNull Call<Group> call, @NonNull Throwable t) {
                loading.dismiss();
                Log.d(TAG, "onResponseError: " + t.getLocalizedMessage());

            }
        });
    }

    private ArrayList<ParentObject> getParentItemList(Response<Group> response) {
        products = response.body().getIDOC().getE1WPW01();
        Collections.sort(products, nameComparator);
        ArrayList<ParentObject> parentObjects = new ArrayList<>();
        for (E1WPW01 product : products) {
            ArrayList<Object> childList = new ArrayList<>();
            childList.add(new ProductChild(
                    product.getFILIALE(), product.getAENDKENNZ(),
                    product.getAKTIVDATUM(), product.getAENDDATUM(),
                    product.getE1WPW02().getHIERARCHIE(), product.getE1WPW02().getVERKNUEPFG()));
            product.setChildObjectList(childList);
            parentObjects.add(product);
        }
        return parentObjects;
    }
    public static Comparator<E1WPW01> nameComparator = (o1, o2)
            -> o1.getE1WPW02().getBEZEICH().compareTo(o2.getE1WPW02().getBEZEICH());

    public static Comparator<E1WPW01> idComparator = (o1, o2) ->
            (Integer.parseInt(o1.getWARENGR()) - Integer.parseInt(o2.getWARENGR()));

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sortNameButton :
                Collections.sort(products, nameComparator);
                updateUI();
                break;
            case R.id.sortIdButton :
                Collections.sort(products, idComparator);
                updateUI();
                break;
        }
    }
    public void updateUI() {

        if (mProductExpandableAdapter == null) {
            mProductExpandableAdapter = new ProductExpandableAdapter(getApplicationContext(), getParentItemList(mResponse));
            mProductExpandableAdapter.setCustomParentAnimationViewId(R.id.parentListItemExpandArrow);
            mProductExpandableAdapter.setParentClickableViewAnimationDefaultDuration();
            mProductExpandableAdapter.setParentAndIconExpandOnClick(true);
            mProductExpandableAdapter.setProducts(products);
            recyclerView.setAdapter(mProductExpandableAdapter);
        } else {
            mProductExpandableAdapter.setProducts(products);
            mProductExpandableAdapter.notifyDataSetChanged();
        }
    }

}
