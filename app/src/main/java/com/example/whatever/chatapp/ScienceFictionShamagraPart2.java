package com.example.whatever.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ScienceFictionShamagraPart2 extends AppCompatActivity {

    PDFView bangla2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_fiction_shamagra_part2);

        bangla2 = (PDFView)findViewById(R.id.bangla2);

        bangla2.fromAsset("Science-Fiction-Shamagra-Part-2-By-Muhammed-Zafar-Iqbal.pdf").load();
    }
}
