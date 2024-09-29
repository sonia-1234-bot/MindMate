package com.example.hm2;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ScenaryVideo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_scenary);
        VideoView videoView=findViewById(R.id.vscenary);
        String  videoPath="android.resource://" +getPackageName()+"/"+R.raw.scenaryv;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController =new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

}
