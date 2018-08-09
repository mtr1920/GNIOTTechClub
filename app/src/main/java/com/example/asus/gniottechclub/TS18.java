package com.example.asus.gniottechclub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.widget.TextView;

public class TS18 extends AppCompatActivity {
    //Button register,event;
    FloatingActionButton fab;
    TextView website;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ts18);

        fab = (FloatingActionButton) findViewById(R.id.button2);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Events.class);
                startActivity(i);
            }});
        website = (TextView) findViewById(R.id.imageButton4);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gniotclubs.com/")));
            }
        });
      /*  register = (Button) findViewById(R.id.button);
        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://techclub.gniotclubs.com/register")));
            }
        }); */
    }
}
