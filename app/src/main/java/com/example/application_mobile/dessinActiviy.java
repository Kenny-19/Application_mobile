package com.example.application_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class dessinActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessin_activiy);
    }
    DrawingView drawingView = findViewById(R.id.drawingView);
}