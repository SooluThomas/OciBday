package com.lmntrx.ocibday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void NewActivity(View view) {

        Intent myIntent = new Intent(this,Main3Activity.class);
        startActivity(myIntent);
        //finish();
    }
}
