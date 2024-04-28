package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TPbienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpbienvenida);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");

        TextView textViewHola = findViewById(R.id.textViewHola);
        textViewHola.setText("¡Hola " + nombre + "!");

        Button buttonSiguiente = findViewById(R.id.buttonSiguiente);
        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TPbienvenida.this, CPedad.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
                finish();
            }
        });
    }
}
