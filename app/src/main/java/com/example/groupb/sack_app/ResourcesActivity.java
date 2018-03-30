package com.example.groupb.sack_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void toRainn (View view) {
        goToUrl("https://www.rainn.org/");
    }

    public void toSACK (View view) {
        goToUrl("http://sackingston.com/");
    }

    public void toQWC (View view) {
        goToUrl("http://www.queensu.ca/studentwellness/home");
    }

    public void toQueens (View view) {
        goToUrl("http://www.queensu.ca/studentaffairs/sites/webpublish.queensu.ca.vpsawww/files/files/SA%20steps%20to%20take%20March%202016.pdf");
    }

    public void toKHP (View view) {
        goToUrl("https://kidshelpphone.ca/");
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
