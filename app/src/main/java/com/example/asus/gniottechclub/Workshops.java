package com.example.asus.gniottechclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ASUS on 21-03-2017.
 */

public class Workshops extends Activity {

    Button augmented,printing,staadpro,arduino,dataanalytics,robotics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.workshops);

        augmented=(Button)findViewById(R.id.button);
        augmented.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(getApplicationContext(), Augmented.class);
                startActivity(i);
            }
        });

        printing=(Button)findViewById(R.id.button2);
        printing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(getApplicationContext(), Printing.class);
                startActivity(i);
            }
        });

        staadpro=(Button)findViewById(R.id.button3);
        staadpro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(getApplicationContext(), Staadpro.class);
                startActivity(i);
            }
        });

        arduino=(Button)findViewById(R.id.button4);
        arduino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(getApplicationContext(), Arduino.class);
                startActivity(i);
            }
        });

        dataanalytics=(Button)findViewById(R.id.button5);
        dataanalytics.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(getApplicationContext(), Dataanalytics.class);
                startActivity(i);
            }
        });

        robotics=(Button)findViewById(R.id.button6);
        robotics.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(getApplicationContext(), Robotic.class);
                startActivity(i);
            }
        });
    }
}
