package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import static android.text.TextUtils.isEmpty;

public class length extends AppCompatActivity  {
    TextInputEditText unitval,result;
    Spinner unit1,unit2;
    CardView convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        unitval = findViewById(R.id.unit1val);
        unit1 = findViewById(R.id.unit1);
        unit2 = findViewById(R.id.unit2);
        convert = findViewById(R.id.convert);
        result = findViewById(R.id.result);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u1 = unit1.getSelectedItem().toString();
                String u2 = unit2.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),u1+" to "+u2,Toast.LENGTH_SHORT).show();
                float value =0;
                if(!isEmpty(unitval.getText().toString())){
                    value =Float.parseFloat(unitval.getText().toString());
                }
                //Toast.makeText(getApplicationContext(),"Converting",Toast.LENGTH_SHORT).show();
                if(!u1.equals(u2))
                {
                    result.setText("Converting...");
                    convertor obj = new convertor();
                    float sol = obj.lengthconversion(u1,u2,value);
                    result.setText(""+sol);
                }
                else
                {
                    result.setText(""+value);
                }
            }
        });
    }
}