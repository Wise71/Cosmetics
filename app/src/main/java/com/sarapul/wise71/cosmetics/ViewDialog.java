package com.sarapul.wise71.cosmetics;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

class ViewDialog {

    void showDialog(Activity activity, DialogListener dialogListener){
        final Dialog dialog = new Dialog(activity);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);

        EditText valueKey = dialog.findViewById(R.id.editText);

        Button dialogButton =  dialog.findViewById(R.id.btn_dialog);
        dialogButton.setOnClickListener(v -> {
            dialogListener.onDialogListener(valueKey.getText().toString());
            dialog.dismiss();
        });

        dialog.show();

    }
}
