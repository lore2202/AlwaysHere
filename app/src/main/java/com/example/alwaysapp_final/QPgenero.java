package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QPgenero extends AppCompatActivity {

    private String nombre;
    private int edad;
    private String genero;

    EditText editTextGenero;
    Button buttonListo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qpgenero);

        editTextGenero = findViewById(R.id.editTextGenero);
        buttonListo = findViewById(R.id.buttonListo);
        buttonListo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genero = editTextGenero.getText().toString();
                if (genero.isEmpty()) {
                    editTextGenero.setError("Por favor, ingresa tu género");
                } else {
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("genero", genero);
                    setResult(RESULT_OK, resultIntent);

                    Intent intent = new Intent(QPgenero.this, Comienzo.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}