package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ScienceFictionShamagraPart3 extends AppCompatActivity {

    PDFView bangla3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_fiction_shamagra_part3);

        bangla3 = (PDFView)findViewById(R.id.bangla3);

        bangla3.fromAsset("Science-Fiction-Shamagra-Part-3-By-Muhammed-Zafar-Iqbal.pdf").load();
    }
}
