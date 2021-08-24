package com.covid.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button Ab, imp, abcorona, cases, world, prevention;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ab = findViewById(R.id.Ab);
        imp = findViewById(R.id.imp);
        abcorona = findViewById(R.id.abcorona);
        cases = findViewById(R.id.cases);
        world = findViewById(R.id.world);
        prevention = findViewById(R.id.prevention);

        Ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, About_id.class));
            }
        });
        imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, impnews.class));
            }
        });
        abcorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Corona.class));
            }
        });
        prevention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Prevention.class));
            }
        });
        cases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, India.class));
            }
        });
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, World.class));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.id_Corona) {
            Intent intentabout = new Intent(MainActivity.this, AboutApp.class);
            startActivity(intentabout);
            return true;
        }if (id == R.id.id_Settings) {
            Intent intentseet = new Intent(MainActivity.this, Settings.class);
            startActivity(intentseet);
            return true;
        }if (id == R.id.id_profile) {
            Intent intentst = new Intent(MainActivity.this, Logout.class);
            startActivity(intentst);
            return true;
        }if (id == R.id.id_noti) {
            Intent intent = new Intent(MainActivity.this, Notification.class);
            startActivity(intent);
            return true;
        }
        return true;
    }
}

