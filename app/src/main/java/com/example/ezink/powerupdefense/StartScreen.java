package com.example.ezink.powerupdefense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class StartScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        Button button = findViewById(R.id.startButton);
        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        startActivity(new Intent(StartScreen.this,Game.class));
    }
}
