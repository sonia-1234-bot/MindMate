package com.example.hm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PruebaMainActivity extends AppCompatActivity {

    ImageButton infoImageButton;
    ImageButton infoImageButtonResources;
    ImageButton infoImageButtonResults;
    ImageButton infoImageButtonChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_main);

        infoImageButton = (ImageButton) findViewById(R.id.buttonInfo);
        infoImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,PersonalInfo.class);
                startActivity(intentLoadActivityInfo);
            }
            });

        infoImageButtonResources = (ImageButton) findViewById(R.id.buttonResources);
        infoImageButtonResources.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,Resources.class);
                startActivity(intentLoadActivityInfo);
            }
        });


        infoImageButtonResults = (ImageButton) findViewById(R.id.buttonResults);
        infoImageButtonResults.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,Results.class);
                startActivity(intentLoadActivityInfo);
            }
        });

        infoImageButtonChat = (ImageButton) findViewById(R.id.chatButton);
        infoImageButtonChat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadActivityInfo = new Intent(PruebaMainActivity.this,ChatbotActivity.class);
                startActivity(intentLoadActivityInfo);
            }
        });
    }
}