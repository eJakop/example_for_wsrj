package com.example.example_for_wsrj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class id extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);
    }

    public void onClickLog(View v){
        Intent intent_activty = new Intent(".news_activity_wsr");
        startActivity(intent_activty);
    }

    public void onClickReg(View v){
        Intent intent_activty = new Intent(   ".regis_activity_wsr");
        startActivity(intent_activty);
    }
}
