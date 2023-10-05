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
    private TextView paintTV;

    // MAPS PARAMETROAK
    private ImageButton mapsButton;
    private TextView mapsTV;

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
        paintTV = findViewById(R.id.paintTV);


        // Maps paramertoak zehazten
        mapsButton = findViewById(R.id.mapButton);
        mapsTV = findViewById(R.id.mapTV);



        // Home button sakatzerakoan egin behar duena
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (hasieraTV.getVisibility() == View.INVISIBLE){

                    // Hasiera textua visible jarri
                    homeButtonAktibatu();

                }

                if (irudiakTV.getVisibility() == View.VISIBLE){

                    // Irudiak textuari visible aldatu
                    irudiakTV.setVisibility(View.INVISIBLE);

                }

                if (paintTV.getVisibility() == View.VISIBLE){

                    // paint textuari visible aldatu
                    paintTV.setVisibility(View.INVISIBLE);

                }

                if (mapsTV.getVisibility() == View.VISIBLE){

                    // maps textuari visible aldatu
                    mapsTV.setVisibility(View.INVISIBLE);

                }


            }
        });

        // Irudiak button sakatzerakoan egin behar duena
        irudiakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (irudiakTV.getVisibility() == View.INVISIBLE){

                    // Irudiak textua visible jarri
                    irudiakButtonAktibatu();
                }

                if (hasieraTV.getVisibility() == View.VISIBLE){

                    // Hasiera textuari visible aldatu
                    homeButtonDESAktibatu();
                }

                if (paintTV.getVisibility() == View.VISIBLE){

                    // paint textuari visible aldatu
                    paintTV.setVisibility(View.INVISIBLE);

                }

                if (mapsTV.getVisibility() == View.VISIBLE){

                    // maps textuari visible aldatu
                    mapsTV.setVisibility(View.INVISIBLE);

                }


            }
        });

        // Paint button sakatzerakoan egin behar duena
        paintButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (paintTV.getVisibility() == View.INVISIBLE){

                    // paint textua visible jarri
                    paintButtonAktibatu();
                }

                if (hasieraTV.getVisibility() == View.VISIBLE){

                    // Hasiera textuari visible aldatu
                    homeButtonDESAktibatu();
                }

                if (irudiakTV.getVisibility() == View.VISIBLE){

                    // Irudiak textuari visible aldatu
                    irudiakTV.setVisibility(View.INVISIBLE);

                }

                if (mapsTV.getVisibility() == View.VISIBLE){

                    // maps textuari visible aldatu
                    mapsTV.setVisibility(View.INVISIBLE);

                }

            }

        });

        // Maps button sakatzerakoan egin behar duena
        mapsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (mapsTV.getVisibility() == View.INVISIBLE){

                    // Maps textua visible jarri
                    mapsButtonAktibatu();
                }

                if (hasieraTV.getVisibility() == View.VISIBLE){

                    // Hasiera textuari visible aldatu
                    homeButtonDESAktibatu();
                }

                if (irudiakTV.getVisibility() == View.VISIBLE){

                    // Irudiak textuari visible aldatu
                    irudiakTV.setVisibility(View.INVISIBLE);

                }

                if (paintTV.getVisibility() == View.VISIBLE){

                    // Paint textuari visible aldatu
                    paintTV.setVisibility(View.INVISIBLE);

                }

            }

        });


    }

    // Home botoiaren parametroak aktibatu
    private void homeButtonAktibatu(){

        hasieraTV.setVisibility(View.VISIBLE);

    }

    private void homeButtonDESAktibatu(){

        hasieraTV.setVisibility(View.INVISIBLE);

    }

    // Irudiak botoiaren parametroak aktibatu
    private void irudiakButtonAktibatu(){

        irudiakTV.setVisibility(View.VISIBLE);

    }

    // Paint botoiaren parametroak aktibatu
    private void paintButtonAktibatu(){

        paintTV.setVisibility(View.VISIBLE);

    }

    // Maps botoiaren parametroak aktibatu
    private void mapsButtonAktibatu(){

        mapsTV.setVisibility(View.VISIBLE);

    }



}