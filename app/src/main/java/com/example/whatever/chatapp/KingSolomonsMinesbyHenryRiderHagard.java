package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KingSolomonsMinesbyHenryRiderHagard extends AppCompatActivity {

    PDFView translated1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_king_solomons_minesby_henry_rider_hagard);

        translated1 = (PDFView)findViewById(R.id.translated1);

        translated1.fromAsset("King Solomon's Mines by Henry Rider Hagard.pdf").load();


    }
}
