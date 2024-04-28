package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Comienzo extends AppCompatActivity {

    Button buttonComienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comienzo);

        buttonComienzo = findViewById(R.id.botonComienzo);
        buttonComienzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Comienzo.this, InicioActivity.class);
                startActivity(intent);
            }
        });

    }

}