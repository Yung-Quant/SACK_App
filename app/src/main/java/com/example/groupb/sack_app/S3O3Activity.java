package com.example.groupb.sack_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class S3O3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3_o3);
    }

    public void toScenarios(View view) {
        Intent intent = new Intent(this, ScenariosActivity.class);
        startActivity(intent);
    }

    public void toScenario3(View view) {
        Intent intent = new Intent( this, Scenario3Activity.class);
        startActivity(intent);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void toTDSB (View view) {
        goToUrl("http://www.tdsb.on.ca/Portals/0/HighSchool/docs/Know%20Your%20Rights%20and%20Responsibilities.pdf");
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
