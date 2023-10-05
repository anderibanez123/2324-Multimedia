package com.example.ander_ibanez_oharrak;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class OharrakActivity extends AppCompatActivity  {

    private TextView notak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oharrak);

        Intent intent = getIntent();

        // Oharrak irakurtzeko
        OharrakIrakurri();


    }

    private void OharrakIrakurri() {

        notak = findViewById(R.id.notak_txt);

        try {

            FileInputStream fis = openFileInput("notak.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }

            fis.close();
            isr.close();
            br.close();

            String notakDatuak = sb.toString();
            notak.setText("NOTAK:" + notakDatuak);

        } catch (IOException e) {

            notak.setText("NOTAK: Ez dago notarik");

        }
    }










}
