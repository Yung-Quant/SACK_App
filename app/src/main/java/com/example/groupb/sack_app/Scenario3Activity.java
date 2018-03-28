package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Scenario3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario3);
    }

    public void toS3O1(View view) {
        Intent intent = new Intent(this, S3O1Activity.class);
        startActivity(intent);
    }

    public void toS3O2(View view) {
        Intent intent = new Intent(this, S3O2Activity.class);
        startActivity(intent);
    }

    public void toS3O3(View view) {
        Intent intent = new Intent(this, S3O3Activity.class);
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
