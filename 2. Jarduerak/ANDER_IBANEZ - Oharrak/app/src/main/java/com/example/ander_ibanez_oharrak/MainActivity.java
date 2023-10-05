package com.example.ander_ibanez_oharrak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    // Parametroak
    private EditText titulo_BT;
    private EditText nota_TXT;
    private Button gorde_BT;
    private Button bistaratu_BT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Parametroak konponenteekin juntau
        titulo_BT = findViewById(R.id.Titulua_TXT);
        nota_TXT = findViewById(R.id.nota_txt);
        gorde_BT = findViewById(R.id.oharraGorde_BT);
        bistaratu_BT = findViewById(R.id.bistaratu_BT);

        // Gorde botoia sakatzerakoan
        gorde_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Parametroak hartu
                String izenburua = titulo_BT.getText().toString();
                String nota = nota_TXT.getText().toString();

                // Gorde botoia sakatzerakoan
                if (izenburua.length() > 0 && nota.length() > 0){

                    // Textua beteta badago
                    try{

                        // TXT-a sortu eta idazteko modua ireki
                        FileOutputStream fos = openFileOutput("notak.txt", Context.MODE_APPEND);
                        OutputStreamWriter writer = new OutputStreamWriter(fos);

                        // Textua gorde
                        writer.write("*********************" + "\n"
                                + izenburua + "\n" + nota + "\n");

                        // idazteko funtzioa itxi
                        writer.close();

                        // Oharra gorde baldin ba dugu, mezua irakutziko dugu
                        Toast.makeText(getApplicationContext(), "OHARRA GORDE DUGU", Toast.LENGTH_SHORT).show();

                    }catch(IOException e){

                        Toast.makeText(getApplicationContext(), "EZIN IZAN DUGU OHARRA GORDE", Toast.LENGTH_SHORT).show();

                    }

                }else{

                    // Ez badago ezer idatzita textuan
                    Toast.makeText(getApplicationContext(), "Oharra gordetzeko textua bete beharko duzu.", Toast.LENGTH_SHORT).show();

                }


            }
        });

        // Bistaratu botoia sakatzerakoan
        bistaratu_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, OharrakActivity.class);
                startActivity(intent);

            }
        });


    }
}