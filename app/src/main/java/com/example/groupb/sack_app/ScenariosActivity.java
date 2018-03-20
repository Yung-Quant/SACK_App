package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ScenariosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenarios);
    }

    public void toScenario1(View view) {
        Intent intent = new Intent(this, Scenario1MainActivity.class);
        startActivity(intent);
    }

    public void toScenario2(View view) {
        Intent intent = new Intent(this, scenario2Main.class);
        startActivity(intent);
    }

    public void toScenario3(View view) {
        Intent intent = new Intent(this, scenario3Main.class);
        startActivity(intent);
    }

    public void toScenario4(View view) {
        Intent intent = new Intent(this, scenario4Main.class);
        startActivity(intent);
    }
}
