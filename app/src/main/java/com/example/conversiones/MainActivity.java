package com.example.conversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ET2;
    TextView ET;
    Spinner spnn, spnn2;
    String[] opciones = {"Celsius", "Kelvin", "Farenheit"};
    String opcion2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET = findViewById(R.id.editText);
        ET2 = findViewById(R.id.editText2);
        spnn = findViewById(R.id.combobox);
        spnn2 = findViewById(R.id.combobox2);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnn.setAdapter(adapter);
        spnn2.setAdapter(adapter);

        spnn2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                int valor = Integer.parseInt(ET.getText().toString());
                opcion2 = parentView.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });

        spnn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                int valor = Integer.parseInt(ET.getText().toString());
                String opcion = parentView.getItemAtPosition(position).toString();
                switch (opcion){
                    case "Celsius":
                        if(opcion2 == "Kelvin"){
                            
                        } else if (opcion2 == "Farenheit") {
                            
                        }
                        break;
                    case "Kelvin":
                        break;
                    case "Farenheit":
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });

    }
}