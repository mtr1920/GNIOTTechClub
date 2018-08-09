package com.example.asus.gniottechclub;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by ASUS on 21-03-2017.
 */

public class Events extends Activity {

    Button Robotics,Momentum,Lan_Thrash,Debate,Extempore,Poster_Making,An_Idea_for_Change,Backtrack,Debugging,Spell_Bee,IQ_Sector,Bridge_Building,Circuit_Sergeon,Quiz,Beg_Borrow_Steal,Creative_Writing, Hackathon,Product_Design,Photography,Selfie ,pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    setContentView(R.layout.events);

        Robotics = (Button)findViewById(R.id.button);
        Robotics.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Robotics.class);
                startActivity(i);
            }
        });

        Momentum = (Button) findViewById(R.id.button2);
        Momentum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Momentum.class);
                startActivity(i);
            }
        });

        Lan_Thrash = (Button) findViewById(R.id.button3);
        Lan_Thrash.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Lan_Thrash.class);
                startActivity(i);
            }
        });

        Debate = (Button)findViewById(R.id.button4);
        Debate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Debate.class);
                startActivity(i);
            }
        });

        Extempore = (Button) findViewById(R.id.button5);
        Extempore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Extempore.class);
                startActivity(i);
            }
        });


        Poster_Making = (Button) findViewById(R.id.button8);
        Poster_Making.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Poster_Making.class);
                startActivity(i);
            }
        });

        An_Idea_for_Change = (Button) findViewById(R.id.button9);
        An_Idea_for_Change.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), An_Idea_for_Change.class);
                startActivity(i);
            }
        });

        Backtrack = (Button) findViewById(R.id.button10);
        Backtrack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Backtrack.class);
                startActivity(i);
            }
        });

        Debugging = (Button)findViewById(R.id.button11);
        Debugging.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Debugging.class);
                startActivity(i);
            }
        });

        Spell_Bee = (Button) findViewById(R.id.button12);
        Spell_Bee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Spell_Bee.class);
                startActivity(i);
            }
        });

        IQ_Sector = (Button) findViewById(R.id.button13);
        IQ_Sector.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), IQ_Sector.class);
                startActivity(i);
            }
        });

        Bridge_Building = (Button) findViewById(R.id.button14);
        Bridge_Building.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Bridge_Building.class);
                startActivity(i);
            }
        });

        Circuit_Sergeon = (Button)findViewById(R.id.button15);
        Circuit_Sergeon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Circuit_Sergeon.class);
                startActivity(i);
            }
        });

        Quiz = (Button) findViewById(R.id.button16);
        Quiz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Quiz.class);
                startActivity(i);
            }
        });

        Beg_Borrow_Steal = (Button) findViewById(R.id.button17);
        Beg_Borrow_Steal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Beg_Borrow_Steal.class);
                startActivity(i);
            }
        });

        Creative_Writing = (Button) findViewById(R.id.button18);
        Creative_Writing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Creative_Writing.class);
                startActivity(i);
            }
        });

        Hackathon = (Button) findViewById(R.id.button19);
        Hackathon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Hackathon.class);
                startActivity(i);
            }
        });

        Product_Design = (Button) findViewById(R.id.button20);
        Product_Design.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Product_Design.class);
                startActivity(i);
            }
        });

        Selfie= (Button) findViewById(R.id.button21);
        Selfie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Selfie.class);
                startActivity(i);
            }
        });

        pdf = (Button) findViewById(R.id.button23);
        pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://files.acrobat.com/a/preview/a9a5ab2a-6a37-423e-9301-5598e6487931")));
            }
        });
    }
}
