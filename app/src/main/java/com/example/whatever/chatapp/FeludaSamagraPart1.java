package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FeludaSamagraPart1 extends AppCompatActivity {

    PDFView indian1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feluda_samagra_part1);

        indian1 = (PDFView)findViewById(R.id.indian1);

        indian1.fromAsset("Feluda Samagra-Part-1.pdf").load();
    }
}
