package com.example.groupb.sack_app;

import android.content.Intent;
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
}
