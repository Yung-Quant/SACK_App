package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class S1O2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1_o2);
    }

    public void toScenarios(View view) {
        Intent intent = new Intent(this, ScenariosActivity.class);
        startActivity(intent);
    }

    public void toConsent(View view) {
        Intent intent = new Intent(this, ConsentActivity.class);
        startActivity(intent);
    }

    public void toScenario1(View view) {
        Intent intent = new Intent(this, Scenario1Activity.class);
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
