package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView length,area,volume,speed,weigth,temperature,power,pressure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        length = findViewById(R.id.length);
        area = findViewById(R.id.area);
        volume = findViewById(R.id.volume);
        speed = findViewById(R.id.speed);
        weigth = findViewById(R.id.weight);
        temperature = findViewById(R.id.temperature);
        power = findViewById(R.id.power);
        pressure = findViewById(R.id.pressure);
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lintent = new Intent(getApplicationContext(),length.class);
                startActivity(lintent);
            }
        });
    }
}