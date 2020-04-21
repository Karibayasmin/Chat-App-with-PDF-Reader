package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Feludapart2 extends AppCompatActivity {

    PDFView indian2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feludapart2);

        indian2 = (PDFView)findViewById(R.id.indian2);

        indian2.fromAsset("felu da part- 2.pdf").load();
    }
}
