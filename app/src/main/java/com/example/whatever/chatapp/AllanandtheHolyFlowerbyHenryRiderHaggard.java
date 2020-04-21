package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AllanandtheHolyFlowerbyHenryRiderHaggard extends AppCompatActivity {

   PDFView translated2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allanandthe_holy_flowerby_henry_rider_haggard);

        translated2 = (PDFView)findViewById(R.id.translated2);

        translated2.fromAsset("Allan and the Holy Flower by Henry Rider Haggard.pdf").load();
    }
}
