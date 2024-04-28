package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Cuestionario2 extends AppCompatActivity {

    CheckBox chkEstoyDeAcuerdo1, chkNoEstoyDeAcuerdo1, chkEstoyDeAcuerdo2, chkNoEstoyDeAcuerdo2, chkNunca, chkAVeces, chkSiempre;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario2);

        // Inicializar checkboxes y botón
        chkEstoyDeAcuerdo1 = findViewById(R.id.chkEstoyDeAcuerdo1);
        chkNoEstoyDeAcuerdo1 = findViewById(R.id.chkNoEstoyDeAcuerdo1);
        chkEstoyDeAcuerdo2 = findViewById(R.id.chkEstoyDeAcuerdo2);
        chkNoEstoyDeAcuerdo2 = findViewById(R.id.chkNoEstoyDeAcuerdo2);
        chkNunca = findViewById(R.id.chkNunca);
        chkAVeces = findViewById(R.id.chkAVeces);
        chkSiempre = findViewById(R.id.chkSiempre);
        btnSiguiente = findViewById(R.id.btnSiguiente);


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validar que al menos una opción de cada pregunta esté seleccionada
                if ((chkEstoyDeAcuerdo1.isChecked() || chkNoEstoyDeAcuerdo1.isChecked()) &&
                        (chkEstoyDeAcuerdo2.isChecked() || chkNoEstoyDeAcuerdo2.isChecked()) &&
                        (chkNunca.isChecked() || chkAVeces.isChecked() || chkSiempre.isChecked())) {
                    // Ir a la siguiente pantalla
                    Intent intent = new Intent(Cuestionario2.this, SiguientePantalla.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Cuestionario2.this, "Por favor, seleccione una opción para cada pregunta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
