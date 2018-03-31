package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dq);
    }

    public void toFamily(View view) {
        Intent intent = new Intent( this, FamilyActivity.class);
        startActivity(intent);
    }

    public void toWorkplace(View view) {
        Intent intent = new Intent( this, WorkplaceActivity.class);
        startActivity(intent);
    }

    public void toStranger(View view) {
        Intent intent = new Intent( this, StrangerActivity.class);
        startActivity(intent);
    }

    public void toRelationship(View view) {
        Intent intent = new Intent( this, RelationshipActivity.class);
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
