package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FeludaPart3 extends AppCompatActivity {

    PDFView indian3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feluda_part3);

        indian3 = (PDFView)findViewById(R.id.indian3);

        indian3.fromAsset("Felu da Part-3.pdf").load();
    }
}
