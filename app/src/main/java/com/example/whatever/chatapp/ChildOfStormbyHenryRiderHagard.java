package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ChildOfStormbyHenryRiderHagard extends AppCompatActivity {

   PDFView translated3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_of_stormby_henry_rider_hagard);

        translated3 = (PDFView)findViewById(R.id.translated3);

        translated3.fromAsset("Child Of Storm by Henry Rider Hagard.pdf").load();
    }
}
