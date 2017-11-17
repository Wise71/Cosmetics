package com.sarapul.wise71.cosmetics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.sarapul.wise71.cosmetics.models.E1WPW01;

import java.util.List;

public class ProductExpandableAdapter extends ExpandableRecyclerAdapter<ProductExpandableAdapter.ProductParentViewHolder, ProductExpandableAdapter.ProductChildViewHolder> {

    private LayoutInflater mInflater;
    private List<E1WPW01> mProducts;

    ProductExpandableAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ProductParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_product_parent, viewGroup, false);
        return new ProductParentViewHolder(view);
    }

    @Override
    public ProductChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.list_item_product_child, viewGroup, false);
        return new ProductChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(ProductParentViewHolder productParentViewHolder, int position, Object parentObject) {
        productParentViewHolder.bindProductParent(mProducts.get(position));
    }

    @Override
    public void onBindChildViewHolder(ProductChildViewHolder productChildViewHolder, int position, Object childObject) {
        ProductChild productChild = (ProductChild) childObject;
        productChildViewHolder.bindProductChild(mProducts.get(position));
    }

    class ProductParentViewHolder extends ParentViewHolder {

        TextView mProductTitleTextView;
        TextView mProductIdTextView;
        ImageButton mParentDropDownArrow;

        ProductParentViewHolder(View itemView) {
            super(itemView);

            mProductTitleTextView = itemView.findViewById(R.id.productNameTextView);
            mProductIdTextView = itemView.findViewById(R.id.productIdTextView);
            mParentDropDownArrow = itemView.findViewById(R.id.parentListItemExpandArrow);
        }

        private void bindProductParent(E1WPW01 e1WPW01) {
            mProductTitleTextView.setText(e1WPW01.getE1WPW02().getBEZEICH());
            mProductIdTextView.setText(e1WPW01.getWARENGR());
        }
    }

    class ProductChildViewHolder extends ChildViewHolder {

        TextView mProductFilialeText;
        TextView mProductAendkennzText;
        TextView mProductActivdatumText;
        TextView mProductAenddatumText;
        TextView mProductHierarchieText;
        TextView mProductVerknuepfgText;

        ProductChildViewHolder(View itemView) {
            super(itemView);

            mProductFilialeText = itemView.findViewById(R.id.filialeTextView);
            mProductAendkennzText = itemView.findViewById(R.id.aendkennzTextView);
            mProductActivdatumText = itemView.findViewById(R.id.activdatumTextView);
            mProductAenddatumText = itemView.findViewById(R.id.aenddatumTextView);
            mProductHierarchieText = itemView.findViewById(R.id.hierarchieTextView);
            mProductVerknuepfgText = itemView.findViewById(R.id.verknuepfgTextView);
        }

        private void bindProductChild(E1WPW01 e1WPW01) {
            mProductFilialeText.setText("FILIALE: " + e1WPW01.getFILIALE());
            mProductAendkennzText.setText("AENDKENNZ: " + e1WPW01.getAENDKENNZ());
            mProductActivdatumText.setText("AKTIVDATUM: " + e1WPW01.getAKTIVDATUM());
            mProductAenddatumText.setText("AENDDATUM: " + e1WPW01.getAENDDATUM());
            mProductHierarchieText.setText("HIERARCHIE: " + e1WPW01.getE1WPW02().getHIERARCHIE());
            mProductVerknuepfgText.setText("VERKNUEPFG: " + e1WPW01.getE1WPW02().getVERKNUEPFG());
        }
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }


    void setProducts(List<E1WPW01> newProducts) {
        mProducts = newProducts;
    }
}
