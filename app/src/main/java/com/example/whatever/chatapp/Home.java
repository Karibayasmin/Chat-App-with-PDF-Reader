package com.example.whatever.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView bangla1, bangla2, bangla3, indian1, indian2, indian3, translated1, translated2, translated3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bangla1 = (TextView)findViewById(R.id.bangla1);
        bangla2 = (TextView)findViewById(R.id.bangla2);
        bangla3 = (TextView)findViewById(R.id.bangla3);
        indian1 = (TextView)findViewById(R.id.indian1);
        indian2 = (TextView)findViewById(R.id.indian2);
        indian3 = (TextView)findViewById(R.id.indian3);
        translated1 = (TextView)findViewById(R.id.translated1);
        translated2 = (TextView)findViewById(R.id.translated2);
        translated3 = (TextView)findViewById(R.id.translated3);

        bangla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, ScienceFictionShamagraPart1.class);
                startActivity(i);
            }
        });

        bangla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, ScienceFictionShamagraPart2.class);
                startActivity(i);
            }
        });

        bangla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, ScienceFictionShamagraPart3.class);
                startActivity(i);
            }
        });

        indian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, FeludaSamagraPart1.class);
                startActivity(i);
            }
        });

        indian2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Feludapart2.class);
                startActivity(i);
            }
        });

        indian3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, FeludaPart3.class);
                startActivity(i);
            }
        });

        translated1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, KingSolomonsMinesbyHenryRiderHagard.class);
                startActivity(i);
            }
        });

        translated2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, AllanandtheHolyFlowerbyHenryRiderHaggard.class);
                startActivity(i);
            }
        });

        translated3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, ChildOfStormbyHenryRiderHagard.class);
                startActivity(i);
            }
        });
    }
}
