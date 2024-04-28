package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CPedad extends AppCompatActivity {

    EditText editTextEdad;
    Button buttonListo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpedad);

        editTextEdad = findViewById(R.id.editTextEdad);
        buttonListo = findViewById(R.id.buttonListo);
        buttonListo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = editTextEdad.getText().toString();
                if (edad.isEmpty()) {
                    editTextEdad.setError("Por favor, ingresa tu edad");
                } else {
                    Intent intent = new Intent(CPedad.this, QPgenero.class);
                    intent.putExtra("edad", edad);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
