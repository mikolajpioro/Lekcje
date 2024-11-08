package com.example.suwak;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textViewRozmiar;
    SeekBar suwak;
    TextView textViewPowitanie;
    Button button;
    String napis;
    int progress;
    String[] tablica = {"Dzień dobry","Buenos dias", "Good morning"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRozmiar = (TextView) findViewById(R.id.textViewRozmiar);
        suwak = (SeekBar) findViewById(R.id.seekBar);
        textViewPowitanie = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                progress = suwak.getProgress();
                textViewRozmiar.setText("Rozmiar: " + progress);
                textViewPowitanie.setTextSize(progress);

                if(textViewPowitanie.getText().toString().equals("Dzień dobry")){
                    textViewPowitanie.setText("Buenos dias");
                } else if (textViewPowitanie.getText().toString().equals("Buenos dias")) {
                    textViewPowitanie.setText("Good morning");
                } else if (textViewPowitanie.getText().toString().equals("Good morning")) {
                    textViewPowitanie.setText("Dzień dobry");
                }

            }
        });

    }
}