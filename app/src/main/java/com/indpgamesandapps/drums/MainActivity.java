package com.indpgamesandapps.drums;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
        //this is test
        MediaPlayer keyboard,drums,gitar,horn,piano,plats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keyboard=MediaPlayer.create(MainActivity.this,R.raw.keyboard);
        drums=MediaPlayer.create(MainActivity.this,R.raw.drums);
        gitar=MediaPlayer.create(MainActivity.this,R.raw.gitar);
        horn=MediaPlayer.create(MainActivity.this,R.raw.horn);
        piano=MediaPlayer.create(MainActivity.this,R.raw.piano);
        plats=MediaPlayer.create(MainActivity.this,R.raw.plats);

    }

    public void playDrums(View view)
    {
        drums.start();
    }

    public void playPlats(View view)
    {
        plats.start();
    }

    public void playGitar(View view)
    {
        gitar.start();
    }

    public void playHorn(View view)
    {
        horn.start();
    }

    public void playPiano(View view)
    {
        piano.start();
    }

    public void playKeyboard(View view)
    {
        keyboard.start();
    }
}
