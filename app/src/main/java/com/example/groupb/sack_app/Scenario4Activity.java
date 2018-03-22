package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Scenario4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario4);
    }

    public void toS4O1(View view) {
        Intent intent = new Intent(this, S4O1Activity.class);
        startActivity(intent);
    }

    public void toS4O2(View view) {
        Intent intent = new Intent(this, S4O2Activity.class);
        startActivity(intent);
    }

    public void toS4O3(View view) {
        Intent intent = new Intent(this, S4O3Activity.class);
        startActivity(intent);
    }
}
