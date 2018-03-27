package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class S3O3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3_o3);
    }

    public void toS3O1(View view) {
        Intent intent = new Intent(this, S3O1Activity.class);
        startActivity(intent);
    }
}
