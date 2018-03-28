package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WorkplaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workplace);
    }

    public void toCoworkers(View view) {
        Intent intent = new Intent(this, CoworkersActivity.class);
        startActivity(intent);
    }

    public void toCustomers(View view) {
        Intent intent = new Intent(this, CustomersActivity.class);
        startActivity(intent);
    }

    public void toBoss(View view) {
        Intent intent = new Intent(this, BossActivity.class);
        startActivity(intent);
    }

    //Nav Bar Methods
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
