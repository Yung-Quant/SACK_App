package com.example.groupb.sack_app;

import android.content.Intent;
import android.net.Uri;
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

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void toMuse(View view) {
        goToUrl("https://www.themuse.com/advice/how-to-handle-sexual-harassment-from-a-client");
    }

    public void toGreatist(View view) {
        goToUrl("https://greatist.com/live/what-to-do-sexual-harassment");
    }

    public void toGlobal(View view) {
        goToUrl("https://globalnews.ca/news/3798481/workplace-sexual-harassment/");
    }

    public void toBalance(View view) {
        goToUrl("https://www.thebalance.com/sexually-assaulted-at-work-3515731");
    }

    public void toSA(View view) {
        goToUrl("https://www.sexassault.ca/work.htm");
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
