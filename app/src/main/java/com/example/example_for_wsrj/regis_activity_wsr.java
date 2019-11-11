package com.example.example_for_wsrj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class regis_activity_wsr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_wsr);
    }
    public void onClickReg(View v) {
        Intent intent = new Intent(".regis_activity_wsr");
        startActivity(intent);
    }
}
