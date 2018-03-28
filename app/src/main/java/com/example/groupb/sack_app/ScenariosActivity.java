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
        Intent intent = new Intent(this, Scenario1Activity.class);
        startActivity(intent);
    }

    public void toScenario2(View view) {
        Intent intent = new Intent(this, Scenario2Activity.class);
        startActivity(intent);
    }

    public void toScenario3(View view) {
        Intent intent = new Intent(this, Scenario3Activity.class);
        startActivity(intent);
    }

    public void toScenario4(View view) {
        Intent intent = new Intent(this, Scenario4Activity.class);
        startActivity(intent);
    }

    //Nav Buttons
    public void toResources(View view) {
        Intent intent = new Intent( this, ResourcesActivity.class);
        startActivity(intent);
    }
    public void toHome(View view) {
        Intent intent = new Intent( this, HomeScreenActivity.class);
        startActivity(intent);
    }
    public void toContact(View view) {
        Intent intent = new Intent( this, ContactActivity.class);
        startActivity(intent);
    }
}
