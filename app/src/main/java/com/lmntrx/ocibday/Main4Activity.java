package com.lmntrx.ocibday;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void Click(View view) {

        Toast.makeText(Main4Activity.this, "Happy Birthday Oci.. This was all that I could do..!!!!", Toast.LENGTH_LONG).show();
    }

    public void Music(View view) {
        MediaPlayer myplayer = MediaPlayer.create(this, R.raw.music2);
        myplayer.setLooping(true);
        myplayer.setVolume(100,100);
        myplayer.start();
    }
}
