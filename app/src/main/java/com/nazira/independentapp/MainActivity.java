package com.nazira.independentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    Button dhaka,chattogram,khulna,sylhet,barishal,rajshahi,mymensingh,cumilla,rangpur;
    LinearLayout protestors,criminals,information,government,country,sarjisalam,asifmahmud;
    TextView txtMarquee;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        dhaka = findViewById(R.id.dhaka);
        chattogram = findViewById(R.id.chattogram);
        khulna = findViewById(R.id.khulna);
        sylhet = findViewById(R.id.sylhet);
        barishal = findViewById(R.id.barishal);
        rangpur = findViewById(R.id.rangpur);
        rajshahi = findViewById(R.id.rajshahi);
        mymensingh = findViewById(R.id.mymensingh);
        cumilla = findViewById(R.id.cumilla);
        protestors = findViewById(R.id.protestors);
        criminals = findViewById(R.id.criminals);
        txtMarquee = findViewById(R.id.marqueeText);
        txtMarquee.setSelected(true);
        information = findViewById(R.id.information);
        government = findViewById(R.id.government);
        country = findViewById(R.id.country);
        sarjisalam = findViewById(R.id.sarjisalam);
        asifmahmud = findViewById(R.id.asifmahmud);


        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntent);

            }
        });


        chattogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(myIntent);
            }
        });

        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(myIntent);
            }
        });

        sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(myIntent);
            }
        });

        barishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, SixthActivity.class);
                startActivity(myIntent);
            }
        });


        rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,SeventhActivity.class);
                startActivity(myIntent);
            }
        });

        mymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,EighthActivity.class);
                startActivity(myIntent);
            }
        });


        rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,NinethActivity.class);
                startActivity(myIntent);
            }
        });

        cumilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,TenthActivity.class);
                startActivity(myIntent);

            }
        });

        protestors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, EleventhActivity.class);
                startActivity(myIntent);
            }
        });

        criminals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,TwelvethActivity.class);
                startActivity(myIntent);
            }
        });

        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,ThirteenActivity.class);
                startActivity(myIntent);
            }
        });

        government.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,FourteenActivity.class);
                startActivity(myIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,FifthteenActivity.class);
                startActivity(myIntent);
            }
        });

        sarjisalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, SixteenActivity.class);
                startActivity(myIntent);
            }
        });

        asifmahmud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,EighthteenActivity.class);
                startActivity(myIntent);
            }
        });











    }
}