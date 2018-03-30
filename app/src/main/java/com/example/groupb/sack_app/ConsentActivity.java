package com.example.groupb.sack_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ConsentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consent);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void toTeaVideo (View view) {
        goToUrl("https://www.youtube.com/watch?v=oQbei5JGiT8");
    }

    public void toSassk (View view) {
        goToUrl("http://sassk.ca/learn-more/#consent");
    }

    public void toGC (View view) {
        goToUrl("http://laws-lois.justice.gc.ca/eng/acts/C-46/page-34.html#docCont");
    }

    public void toLeaf (View view) {
        goToUrl("http://www.leaf.ca/the-law-of-consent-in-sexual-assault/");
    }

    public void toRainnConsent (View view) {
        goToUrl("https://www.rainn.org/articles/what-is-consent");
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

