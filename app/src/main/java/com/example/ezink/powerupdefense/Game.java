package com.example.ezink.powerupdefense;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.GridView;

public class Game extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        int waveNum=1;
        int totalEnergy=100;
        MapHandler map = new MapHandler();
        ImageButton nuclear = findViewById(R.id.nuclearButton);
        ImageButton solar = findViewById(R.id.solarButton);
        ImageButton wind = findViewById(R.id.windButton);
        GridView gridview = findViewById(R.id.grid);
        gridview.setAdapter(new GameAdapter(Game.this));




        nuclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        solar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        wind.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

    }


}
