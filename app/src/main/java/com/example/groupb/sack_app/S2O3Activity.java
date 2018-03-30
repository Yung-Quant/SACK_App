package com.example.groupb.sack_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class S2O3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2_o3);
    }

    public void toScenario2(View view) {
        Intent intent = new Intent(this, Scenario2Activity.class);
        startActivity(intent);
    }

    public void toScenarios(View view) {
        Intent intent = new Intent( this, ScenariosActivity.class);
        startActivity(intent);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void toBalance (View view) {
        goToUrl("https://www.thebalance.com/sexually-assaulted-at-work-3515731");
    }

    public void toSexassault (View view) {
        goToUrl("https://www.sexassault.ca/work.htm");
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
