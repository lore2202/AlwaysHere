package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CuestionarioActivity extends AppCompatActivity {

    CheckBox chkEstres, chkAnsiedad, chkCansancio, chkFelicidad;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);


        chkEstres = findViewById(R.id.chkEstres);
        chkAnsiedad = findViewById(R.id.chkAnsiedad);
        chkCansancio = findViewById(R.id.chkCansancio);
        chkFelicidad = findViewById(R.id.chkFelicidad);


        btnSiguiente = findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verificar si al menos una casilla está marcada
                if (chkEstres.isChecked() || chkAnsiedad.isChecked() || chkCansancio.isChecked() || chkFelicidad.isChecked()) {
                    Intent intent = new Intent(CuestionarioActivity.this, Cuestionario2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(CuestionarioActivity.this, "Debes seleccionar al menos una opción", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkEstres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(CuestionarioActivity.this, "Has seleccionado Estrés", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkAnsiedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(CuestionarioActivity.this, "Has seleccionado Ansiedad", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkCansancio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(CuestionarioActivity.this, "Has seleccionado Cansancio", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chkFelicidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(CuestionarioActivity.this, "Has seleccionado Felicidad", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}