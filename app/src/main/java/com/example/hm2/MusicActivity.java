package com.example.hm2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MusicActivity extends AppCompatActivity {
    MediaPlayer player1;
    MediaPlayer player2;
    MediaPlayer player3;
    MediaPlayer player4;
    MediaPlayer player5;
    MediaPlayer player6;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    public void play1(View v) {
        if (player1 == null) {
            player1 = MediaPlayer.create(this, R.raw.song1);
            player1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player1.start();
    }


    public void pause1(View v){
        if(player1!=null){
            player1.pause();
        }
    }

    public void play2(View v) {
        if (player2 == null) {
            player2 = MediaPlayer.create(this, R.raw.song2);
            player2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player2.start();
    }


    public void pause2(View v){
        if(player2!=null){
            player2.pause();
        }
    }

    public void play3(View v) {
        if (player3 == null) {
            player3 = MediaPlayer.create(this, R.raw.song3);
            player3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player3.start();
    }


    public void pause3(View v){
        if(player3!=null){
            player3.pause();
        }
    }

    public void play4(View v) {
        if (player4 == null) {
            player4 = MediaPlayer.create(this, R.raw.song4);
            player4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player4.start();
    }


    public void pause4(View v){
        if(player4!=null){
            player4.pause();
        }
    }

    public void play5(View v) {
        if (player5 == null) {
            player5 = MediaPlayer.create(this, R.raw.song5);
            player5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player5.start();
    }


    public void pause5(View v){
        if(player5!=null){
            player5.pause();
        }
    }

    public void play6(View v) {
        if (player6 == null) {
            player6 = MediaPlayer.create(this, R.raw.song6);
            player6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player6.start();
    }


    public void pause6(View v){
        if(player6!=null){
            player6.pause();
        }
    }

    public void stop(View v){
        stopPlayer();
    }

    public void stopPlayer(){
        if(player1!=null){
            player1.release();
            player1=null;
            Toast.makeText(this,"MediaPlayer released",Toast.LENGTH_SHORT).show();
        }
        if(player2!=null){
            player2.release();
            player2=null;
            Toast.makeText(this,"MediaPlayer released",Toast.LENGTH_SHORT).show();
        }
        if(player3!=null){
            player3.release();
            player3=null;
            Toast.makeText(this,"MediaPlayer released",Toast.LENGTH_SHORT).show();
        }
        if(player4!=null){
            player4.release();
            player4=null;
            Toast.makeText(this,"MediaPlayer released",Toast.LENGTH_SHORT).show();
        }
        if(player5!=null){
            player5.release();
            player5=null;
            Toast.makeText(this,"MediaPlayer released",Toast.LENGTH_SHORT).show();
        }
        if(player6!=null){
            player6.release();
            player6=null;
            Toast.makeText(this,"MediaPlayer released",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
