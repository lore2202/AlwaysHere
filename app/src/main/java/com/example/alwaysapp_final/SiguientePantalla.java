package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SiguientePantalla extends AppCompatActivity {

    CheckBox chkEstoyDeAcuerdo1, chkNoEstoyDeAcuerdo1, chkPensamientosRepetitivos, chkEstresAnsiedad, chkLuz, chkRuido, chkMeditaciones, chkHistorias, chkSonidosNaturaleza;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente_pantalla);

        // Inicializar checkboxes y botón
        chkEstoyDeAcuerdo1 = findViewById(R.id.chkEstoyDeAcuerdo1);
        chkNoEstoyDeAcuerdo1 = findViewById(R.id.chkNoEstoyDeAcuerdo1);
        chkPensamientosRepetitivos = findViewById(R.id.chkPensamientosRepetitivos);
        chkEstresAnsiedad = findViewById(R.id.chkEstresAnsiedad);
        chkLuz = findViewById(R.id.chkLuz);
        chkRuido = findViewById(R.id.chkRuido);
        chkMeditaciones = findViewById(R.id.chkMeditaciones);
        chkHistorias = findViewById(R.id.chkHistorias);
        chkSonidosNaturaleza = findViewById(R.id.chkSonidosNaturaleza);
        btnSiguiente = findViewById(R.id.btnSiguiente);


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validar que al menos una opción de cada pregunta esté seleccionada
                if ((chkEstoyDeAcuerdo1.isChecked() || chkNoEstoyDeAcuerdo1.isChecked()) &&
                        (chkPensamientosRepetitivos.isChecked() || chkEstresAnsiedad.isChecked() || chkLuz.isChecked() || chkRuido.isChecked()) &&
                        (chkMeditaciones.isChecked() || chkHistorias.isChecked() || chkSonidosNaturaleza.isChecked())) {

                    Toast.makeText(SiguientePantalla.this, "Respuestas guardadas correctamente", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SiguientePantalla.this, PantallaP.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(SiguientePantalla.this, "Por favor, seleccione una opción para cada pregunta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
