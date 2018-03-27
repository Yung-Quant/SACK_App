package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class S3O1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3_o1);
    }

    public void toScenarios(View view) {
        Intent intent = new Intent(this, ScenariosActivity.class);
        startActivity(intent);
    }
}
