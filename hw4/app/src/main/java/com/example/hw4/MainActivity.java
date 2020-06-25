package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer game = MediaPlayer.create(MainActivity.this,R.raw.game);
        Button play = (Button)findViewById(R.id.game);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game.start();
            }
        });

        Button stop = (Button)findViewById(R.id.Stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                game.stop();
            }
        });







            Button p = findViewById(R.id.button1);
            p.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this,thecal.class);
                    startActivity(i);

                }
            });

        }
    }
