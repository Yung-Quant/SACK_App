package com.example.groupb.sack_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RelationshipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relationship);
    }

    public void toCurrentRelationship(View view) {
        Intent intent = new Intent(this, CurrentRelationshipActivity.class);
        startActivity(intent);
    }

    public void toExRelationship(View view) {
        Intent intent = new Intent(this, ExRelationshipActivity.class);
        startActivity(intent);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void toUNH (View view) {
        goToUrl("https://www.unh.edu/sharpp/relationship-abuse");
    }

    public void toMetro (View view) {
        goToUrl("http://metro.co.uk/2017/09/14/what-to-do-if-youre-being-stalked-or-harassed-by-your-ex-6928683/");
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
