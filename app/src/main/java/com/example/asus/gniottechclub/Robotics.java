package com.example.asus.gniottechclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by ASUS on 21-03-2017.
 */

public class Robotics extends Activity {
    Button robosoccer,roborace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.robotics);

        robosoccer=(Button)findViewById(R.id.button);
        robosoccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Roborace.class);
                startActivity(i);
            }
        });
        roborace=(Button) findViewById(R.id.button2);
        roborace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Robosoccer.class);
                startActivity(i);
            }
        });
    }
}
