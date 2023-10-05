package com.example.ander_ibanez_1ariketa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Kaixoren konponenteak
    private Button kaixoButton;
    private TextView textoVisible;

    // Kalkulagailuaren konponenteak
    private Button KalkulagailuaButton;
    private Button gehitu_BT;
    private Button bidertu_BT;
    private EditText num1;
    private EditText num2;
    private TextView erantzuna;
    private Button garbitu_BT;
    private ImageButton itxi_BT;

    // Web Orrialdearen konponenteak
    private Button partekatu_BT;
    private Button webOrrialdea_BT;
    private TextView partekatu_text;
    private TextView webOrriaIdea_Text;
    private Button ezberdinak_BT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Kaixoren parametroak
        kaixoButton = findViewById(R.id.kaixoButton);
        textoVisible = findViewById(R.id.textView);

        // Kalkulagailuen parametroak
        KalkulagailuaButton = findViewById(R.id.kalkulagailuaButton);
        gehitu_BT = findViewById(R.id.gehitu_BT);
        bidertu_BT = findViewById(R.id.bider_BT);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        erantzuna = findViewById(R.id.erantzuna_txt);
        garbitu_BT = findViewById(R.id.garbitu_BT);

        // General parametroak
        itxi_BT = findViewById(R.id.itxi);

        // Web Parametroak
        partekatu_BT = findViewById(R.id.partekatu_BT);
        webOrrialdea_BT = findViewById(R.id.webOrrialdea_BT);
        partekatu_text = findViewById(R.id.partekatu_text);
        webOrriaIdea_Text = findViewById(R.id.webOrriaIdea_Text);
        ezberdinak_BT = findViewById(R.id.ezberdinak_BT);


        // Kaixoren parametroak irekitzen
        kaixoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // PARTEKATZEKO PARAMETROAK KENDU
                if (partekatu_BT.getVisibility() == View.VISIBLE){

                    partekatu_BT.setVisibility(View.INVISIBLE);
                    webOrrialdea_BT.setVisibility(View.INVISIBLE);
                    partekatu_text.setVisibility(View.INVISIBLE);
                    webOrriaIdea_Text.setVisibility(View.INVISIBLE);

                }

                // KALKULAGAILUA PARAMETROAK KENDU
                if (erantzuna.getVisibility() == View.VISIBLE){

                    gehitu_BT.setVisibility(View.INVISIBLE);
                    bidertu_BT.setVisibility(View.INVISIBLE);

                    num1.setVisibility(View.INVISIBLE);
                    num1.setText("");

                    num2.setVisibility(View.INVISIBLE);
                    num2.setText("");

                    erantzuna.setVisibility(View.INVISIBLE);
                    erantzuna.setText("Erantzuna: ");

                    garbitu_BT.setVisibility(View.INVISIBLE);

                }

                // Textua visible edo invisible egiteko
                if (textoVisible.getVisibility() == View.VISIBLE) {

                    Toast.makeText(getApplicationContext(), "TEXTUA IREKITA DUZU.", Toast.LENGTH_SHORT).show();

                } else {

                    textoVisible.setVisibility(View.VISIBLE);
                    itxi_BT.setVisibility(View.VISIBLE);

                }   
            }
        });

        // Kalkulagailu parametroak irekitzen
        KalkulagailuaButton.setOnClickListener(new View.OnClickListener(){

            @Override   
            public void onClick(View view) {

                // PARTEKATZEKO PARAMETROAK KENDU
                if (partekatu_BT.getVisibility() == View.VISIBLE){

                    partekatu_BT.setVisibility(View.INVISIBLE);
                    webOrrialdea_BT.setVisibility(View.INVISIBLE);
                    partekatu_text.setVisibility(View.INVISIBLE);
                    webOrriaIdea_Text.setVisibility(View.INVISIBLE);

                }

                // Kaixo Android textua kentzeko paretik
                if (textoVisible.getVisibility() == View.VISIBLE) {

                    textoVisible.setVisibility(View.INVISIBLE);

                }

                // Kalkulagailuaren botoiak kargatu
                if (num1.getVisibility() == View.VISIBLE){

                    Toast.makeText(getApplicationContext(), "KALKULAGAILUA IREKITA DUZU.", Toast.LENGTH_SHORT).show();

                } else {

                    KalkulagailuaButton.setVisibility(View.VISIBLE);
                    gehitu_BT.setVisibility(View.VISIBLE);
                    bidertu_BT.setVisibility(View.VISIBLE);

                    num1.setVisibility(View.VISIBLE);
                    num1.setText("");

                    num2.setVisibility(View.VISIBLE);
                    num2.setText("");

                    erantzuna.setVisibility(View.VISIBLE);
                    erantzuna.setText("Erantzuna: ");

                    garbitu_BT.setVisibility(View.VISIBLE);

                    itxi_BT.setVisibility(View.VISIBLE);

                }

            }

        });

        // Kalkulagailu parametroak irekitzen
        ezberdinak_BT.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                // Kaixo Android textua kentzeko paretik
                if (textoVisible.getVisibility() == View.VISIBLE) {

                    textoVisible.setVisibility(View.INVISIBLE);

                }

                // kalkulagailua ireki badago gorde
                if (erantzuna.getVisibility() == View.VISIBLE){

                    gehitu_BT.setVisibility(View.INVISIBLE);
                    bidertu_BT.setVisibility(View.INVISIBLE);

                    num1.setVisibility(View.INVISIBLE);
                    num1.setText("");

                    num2.setVisibility(View.INVISIBLE);
                    num2.setText("");

                    erantzuna.setVisibility(View.INVISIBLE);
                    erantzuna.setText("Erantzuna: ");

                    garbitu_BT.setVisibility(View.INVISIBLE);

                }

                // Ez berdinak botoiak kargatu
                if (partekatu_BT.getVisibility() == View.VISIBLE){

                    Toast.makeText(getApplicationContext(), "OPZIOAK IREKITA DITUZU.", Toast.LENGTH_SHORT).show();

                } else {

                    partekatu_BT.setVisibility(View.VISIBLE);
                    webOrrialdea_BT.setVisibility(View.VISIBLE);
                    partekatu_text.setVisibility(View.VISIBLE);
                    webOrriaIdea_Text.setVisibility(View.VISIBLE);

                }

            }

        });

        // Kalkulagailua irekita badago, gehitu botoiak zer egin behar duenaren kontrola
        gehitu_BT.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if (num1.getText().length() == 0 || num2.getText().length() == 0) {

                    Toast.makeText(getApplicationContext(), "MESEDEZ, ZENBAKIAK BETE.", Toast.LENGTH_SHORT).show();

                } else {

                    // Sarrerak lortzen
                    String num1STR = String.valueOf(num1.getText());
                    String num2STR = String.valueOf(num2.getText());

                    // Sarrerak zenbakietan bihurtzen
                    int zenbakia1 = Integer.parseInt(num1STR);
                    int zenbakia2 = Integer.parseInt(num2STR);

                    // Eratzuna kalkulatzen
                    int eran = zenbakia1 + zenbakia2;

                    // Erantzuna bistaratzen
                    //erantzuna.setText("Erantzuna: " + eran);
                    Intent intent = new Intent(MainActivity.this, EmaitzaActivity.class);
                    intent.putExtra("ERANTZUNA: ", eran);
                    startActivity(intent);


                }

            }

        });

        // Kalkulagailua irekita badago, bidertu botoiak zer egin behar duenaren kontrola
        bidertu_BT.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if (num1.getText().length() == 0 || num2.getText().length() == 0) {

                    Toast.makeText(getApplicationContext(), "MESEDEZ, ZENBAKIAK BETE.", Toast.LENGTH_SHORT).show();

                } else {

                    // Sarrerak lortzen
                    String num1STR = String.valueOf(num1.getText());
                    String num2STR = String.valueOf(num2.getText());

                    // Sarrerak zenbakietan bihurtzen
                    int zenbakia1 = Integer.parseInt(num1STR);
                    int zenbakia2 = Integer.parseInt(num2STR);

                    // Eratzuna kalkulatzen
                    int eran = zenbakia1 * zenbakia2;

                    // Erantzuna bistaratzen
                    //erantzuna.setText("Erantzuna: " + eran);
                    Intent intent = new Intent(MainActivity.this, EmaitzaActivity.class);
                    intent.putExtra("ERANTZUNA: ", eran);
                    startActivity(intent);

                }

            }

        });

        // Kalkulagailua ireki badago, garbitu botoiak zer egin behar duenaren kontrola
        garbitu_BT.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                num1.setText("");
                num2.setText("");
                erantzuna.setText("Erantzuna: ");

            }

        });

        // Dena ixten duen botoiaren kontrola
        itxi_BT.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if (textoVisible.getVisibility() == View.VISIBLE) {

                    textoVisible.setVisibility(View.INVISIBLE);
                    itxi_BT.setVisibility(View.INVISIBLE);


                } else if (erantzuna.getVisibility() == View.VISIBLE){

                    gehitu_BT.setVisibility(View.INVISIBLE);
                    bidertu_BT.setVisibility(View.INVISIBLE);

                    num1.setVisibility(View.INVISIBLE);
                    num1.setText("");

                    num2.setVisibility(View.INVISIBLE);
                    num2.setText("");

                    erantzuna.setVisibility(View.INVISIBLE);
                    erantzuna.setText("Erantzuna: ");

                    garbitu_BT.setVisibility(View.INVISIBLE);

                    itxi_BT.setVisibility(View.INVISIBLE);

                }

            }

        });

        webOrrialdea_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String busqueda = webOrriaIdea_Text.getText().toString();

                //
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setPackage("com.android.chrome");
                intent.setData(Uri.parse("https://www.google.com/search?q=" + Uri.encode(busqueda)));

                //
                PackageManager packageManager = getPackageManager();
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent);
                } else {
                    //
                    Toast.makeText(getApplicationContext(), "Chrome ez dugu topatu instalatuta", Toast.LENGTH_SHORT).show();
                }



            }
        });

        partekatu_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = partekatu_text.getText().toString();

                //
                if (text != null){
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                    startActivity(Intent.createChooser(shareIntent, "Partekatu textua:"));
                }else {
                    Toast.makeText(getApplicationContext(), "Ez dago texturik idatzita", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
