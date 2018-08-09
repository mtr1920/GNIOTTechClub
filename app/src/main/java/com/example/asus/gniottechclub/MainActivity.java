package com.example.asus.gniottechclub;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.util.Linkify;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;


public class MainActivity extends AppCompatActivity {

    CardView workshops, our_team,ts17,ts18;
    TextView website,mail,phone,phone1;
    ImageView facebook,instagram,twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ts18 = (CardView) findViewById(R.id.ts18);
        ts18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), TS18.class);
                startActivity(i);
            }
        });

        ts17 = (CardView) findViewById(R.id.ts17);
        ts17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), TS17.class);
                startActivity(i);
            }
        });

        workshops = (CardView) findViewById(R.id.workshops);
        workshops.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Workshops.class);
                startActivity(i);
            }
        });

        our_team = (CardView) findViewById(R.id.ourteam);
        our_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Ourteam.class);
                startActivity(i);
            }
        });

        facebook = (ImageView) findViewById(R.id.imageButton);
        facebook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/GNIOTtechClub")));
            }
        });

        twitter = (ImageView) findViewById(R.id.imageButton2);
        twitter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/GniotTech")));
            }
        });

        instagram = (ImageView) findViewById(R.id.imageButton3);
        instagram.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/gniot_techclub")));
            }
        });

        website = (TextView) findViewById(R.id.imageButton4);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gniotclubs.com/")));
            }
        });

        mail = (TextView) findViewById(R.id.imageButton5);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Linkify.addLinks(mail, Linkify.EMAIL_ADDRESSES);
            }
        });

        phone = (TextView) findViewById(R.id.imageButton6);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Linkify.addLinks(phone, Linkify.PHONE_NUMBERS);
            }
        });

        phone1 = (TextView) findViewById(R.id.imageButton7);
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Linkify.addLinks(phone1, Linkify.PHONE_NUMBERS);
            }
        });


    }
}