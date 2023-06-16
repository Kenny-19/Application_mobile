package com.example.application_mobile;

import static java.sql.DriverManager.println;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNextActivity(View view) {
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }

}
