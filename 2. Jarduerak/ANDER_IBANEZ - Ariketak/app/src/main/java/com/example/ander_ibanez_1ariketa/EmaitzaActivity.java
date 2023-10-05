package com.example.ander_ibanez_1ariketa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class EmaitzaActivity extends AppCompatActivity {

    // Emaitzaren parametroak
    private TextView emaitzakalku_txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emaitza);

        emaitzakalku_txt = findViewById(R.id.erantzunaKalk_txt);

        Intent intent = getIntent();
        if (intent != null) {

            int eran = intent.getIntExtra("ERANTZUNA: ", 0);
            emaitzakalku_txt.setText("Emaitza: " + eran);

        }

    }



}
