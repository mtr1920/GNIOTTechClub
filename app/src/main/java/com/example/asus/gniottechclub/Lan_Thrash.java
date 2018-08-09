package com.example.asus.gniottechclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;

/**
 * Created by ASUS on 21-03-2017.
 */

public class Lan_Thrash extends Activity {

    Button mini,nfs,coc,cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lan_thrash);

        coc=(Button)findViewById(R.id.button);
        coc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i= new Intent(getApplicationContext(), COC.class);
                startActivity(i);
            }
        });

        nfs=(Button)findViewById(R.id.button2);
        nfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),NFS.class);
                startActivity(i);
            }
        });

        mini=(Button)findViewById(R.id.button3);
        mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Mini_Militia.class);
                startActivity(i);
            }
        });

         cs=(Button)findViewById(R.id.button4);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),CS.class);
                startActivity(i);
            }
        });

    }
}
