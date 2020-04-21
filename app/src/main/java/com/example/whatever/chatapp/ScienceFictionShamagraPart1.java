package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ScienceFictionShamagraPart1 extends AppCompatActivity {

    PDFView bangla1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_fiction_shamagra_part1);

        bangla1 = (PDFView)findViewById(R.id.bangla1);

        bangla1.fromAsset("Science-Fiction-Shamagra-Part-1-By-Muhammed-Zafar-Iqbal.pdf").load();
    }
}
