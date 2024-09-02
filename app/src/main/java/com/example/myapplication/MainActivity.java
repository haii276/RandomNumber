package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    Button btnRandom;

    private void innitControl(){
        txtNumber=(TextView) findViewById(R.id.textViewNumber);
        btnRandom=(Button) findViewById(R.id.buttonRamdom);
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random  = new Random();
                int number = random.nextInt(7);
                txtNumber.setText(number+"");
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
}