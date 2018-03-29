package com.example.groupb.sack_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class S1O3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1_o3);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void toRainn (View view) {
        goToUrl("https://www.rainn.org/articles/steps-you-can-take-prevent-sexual-assault");
    }

    public void toHopeline (View view) {
        goToUrl("https://www.thehopeline.com/sexual-assault-15-tips-to-protect-yourself");
    }

    public void toConsent(View view) {
        Intent intent = new Intent( this, ConsentActivity.class);
        startActivity(intent);
    }

    public void toScenarios(View view) {
        Intent intent = new Intent( this, ScenariosActivity.class);
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
