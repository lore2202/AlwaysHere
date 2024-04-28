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

public class SPnombre extends AppCompatActivity {

    EditText editTextNombre;
    Button buttonListo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spnombre);

        editTextNombre = findViewById(R.id.editTextNombre);
        buttonListo = findViewById(R.id.buttonListo);
        buttonListo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                if (nombre.isEmpty()) {
                    editTextNombre.setError("Por favor, ingresa tu nombre");
                } else {
                    Intent intent = new Intent(SPnombre.this, TPbienvenida.class);
                    intent.putExtra("nombre", nombre);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
