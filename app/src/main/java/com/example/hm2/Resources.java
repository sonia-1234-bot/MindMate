package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Resources extends AppCompatActivity {

    ImageButton infoImageButtonHome;
    ImageButton musicImageButton;
    ImageButton videoImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        // Find views
        infoImageButtonHome = findViewById(R.id.imageButtonHome);
        musicImageButton = findViewById(R.id.imageButton2);
        videoImageButton = findViewById(R.id.imageButton3);
    }

    // Method to handle click on Home button
    public void goToHomeActivity(View view) {
        Intent intent = new Intent(Resources.this, PruebaMainActivity.class);
        startActivity(intent);
    }

    // Method to handle click on Music button
    public void goToMusicActivity(View view) {
        Intent intent = new Intent(Resources.this, MusicActivity.class);
        startActivity(intent);
    }

    // Method to handle click on Video button
    public void goToVideoActivity(View view) {
        Intent intent = new Intent(Resources.this, VideoActivity.class);
        startActivity(intent);
    }
}
