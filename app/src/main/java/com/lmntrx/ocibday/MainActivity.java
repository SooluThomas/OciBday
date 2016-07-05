package com.lmntrx.ocibday;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Vibrator(View view) {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(5000);
        MediaPlayer myplayer = MediaPlayer.create(this, R.raw.music);
        myplayer.setLooping(true);
        myplayer.setVolume(100,100);
        myplayer.start();
        Intent myIntent = new Intent(this,Main2Activity.class);
        startActivity(myIntent);
        //finish();
    }



}
