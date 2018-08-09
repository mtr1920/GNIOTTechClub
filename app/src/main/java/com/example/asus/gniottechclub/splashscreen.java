package com.example.asus.gniottechclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by ASUS on 20-03-2017.
 */

public class splashscreen extends Activity{

    private static int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activitysplash);

        new Handler().postDelayed(new Runnable() {

                                      @Override
                                      public void run() {
                                          // TODO Auto-generated method stub
                                          Intent s= new Intent(splashscreen.this, MainActivity.class);
                                          startActivity(s);

                                          finish();

                                          Toast.makeText(getApplicationContext(), "Welcome...", Toast.LENGTH_SHORT).show();

                                      }

                                  }, SPLASH_TIME_OUT

        );
    } }
