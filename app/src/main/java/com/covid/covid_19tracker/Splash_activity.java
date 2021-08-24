package com.covid.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);

        getSupportActionBar().hide();
        
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Intent i = new Intent(Splash_activity.this, Register.class); startActivity(i);
                finish(); } }, 4000);
    }
}