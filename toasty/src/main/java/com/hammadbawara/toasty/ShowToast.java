package com.hammadbawara.toasty;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public ShowToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
