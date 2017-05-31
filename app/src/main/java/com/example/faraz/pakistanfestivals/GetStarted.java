package com.example.faraz.pakistanfestivals;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GetStarted extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=3000;
   // ImageButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeInt=new Intent(GetStarted.this,MainActivity.class);
                startActivity(homeInt);
                finish();
            }
        }, SPLASH_TIME_OUT);
       /* b1=(ImageButton) findViewById(R.id.imageButton);
        b1.setOnClickListener(this);*/
    }

   /* @Override
    public void onClick(View v) {
        Intent newInt=new Intent(this,MainActivity.class);
        startActivity(newInt);

    }*/
}
