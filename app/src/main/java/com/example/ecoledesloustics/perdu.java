package com.example.ecoledesloustics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class perdu extends AppCompatActivity {
    private UserModel userModel;
    private MathsCategoryModel mathCatModel;
    private int erreurs;
    private boolean timeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perdu);
        if (getIntent().getExtras() != null){
            userModel= getIntent().getParcelableExtra("user");
            mathCatModel = getIntent().getParcelableExtra(math_cat);
            errors = getIntent().getIntExtra("errors", 0);
            timeOut = getIntent().getBooleanExtra("timeOut", true);
        }
        TextView
    }

}