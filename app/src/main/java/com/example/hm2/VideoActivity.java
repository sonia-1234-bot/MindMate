package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class VideoActivity extends AppCompatActivity {

    ImageButton meditateVideoButton;
    ImageButton  sceneVideoButton;
    ImageButton inspireVideoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // Find views
        meditateVideoButton= findViewById(R.id.meditateV);
        sceneVideoButton = findViewById(R.id.scenaryV);
        inspireVideoButton = findViewById(R.id.inspireV);
    }

    // Method to handle click on Home button
    public void onclickMeditateVideo(View view) {
        Intent intent = new Intent( VideoActivity.this, MeditateVideo.class);
        startActivity(intent);
    }

    // Method to handle click on Music button
    public void onclickSceneVideo(View view) {
        Intent intent = new Intent(VideoActivity.this, ScenaryVideo.class);
        startActivity(intent);
    }

    // Method to handle click on Video button
    public void onclickInspireVideo(View view) {
        Intent intent = new Intent(VideoActivity.this, InspireVideo.class);
        startActivity(intent);
    }
}
