package com.erickwgc.spacegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOverScreen extends AppCompatActivity {
    TextView tv_points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over_screen);
        tv_points = findViewById(R.id.tv_points);
        int points = getIntent().getExtras().getInt("points");
        tv_points.setText(points+"");
    }
    public void restart(View v){
        Intent intent = new Intent(GameOverScreen.this,StartGameScreen.class);
        startActivity(intent);
        finish();
    }
    public void exit(View v){
        finish();
    }
}