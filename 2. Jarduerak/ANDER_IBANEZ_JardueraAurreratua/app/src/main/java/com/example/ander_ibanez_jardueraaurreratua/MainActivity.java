package com.example.ander_ibanez_jardueraaurreratua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // HOME PARAMETROAK
    private ImageButton homeButton;
    private TextView hasieraTV;

    // IRUDIAK PARAMETROAK
    private ImageButton irudiakButton;
    private TextView irudiakTV;

    // PAINT PARAMETROAK
    private  ImageButton paintButton;

    // MAPS PARAMETROAK
    private ImageButton mapsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Home parametroak zehazten
        homeButton = findViewById(R.id.homeButton);
        hasieraTV = findViewById(R.id.hasiera_TView);

        // Irudiak parametroak zehazten
        irudiakButton = findViewById(R.id.albumButton);
        irudiakTV = findViewById(R.id.albumTV);

        // Paint parametroak zehazten
        paintButton = findViewById(R.id.paintButton);

        // Maps paramertoak zehazten
        mapsButton = findViewById(R.id.mapButton);



        // Home button sakatzerakoan egin behar duena
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (hasieraTV.getVisibility() == View.INVISIBLE){

                    // Hasiera textua visible jarri
                    hasieraTV.setVisibility(View.VISIBLE);

                }


            }
        });

        // Irudiak button sakatzerakoan egin behar duena
        irudiakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (hasieraTV.getVisibility() == View.INVISIBLE){

                    // Hasiera textua visible jarri
                    hasieraTV.setVisibility(View.VISIBLE);

                }


            }
        });


    }









}