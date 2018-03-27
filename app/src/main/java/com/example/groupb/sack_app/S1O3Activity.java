package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class S1O3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1_o3);
    }

    public void toS1O1(View view) {
        Intent intent = new Intent(this, S1O1Activity.class);
        startActivity(intent);
    }
}
