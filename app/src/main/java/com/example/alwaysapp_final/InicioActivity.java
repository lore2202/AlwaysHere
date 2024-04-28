package com.example.alwaysapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.material.button.MaterialButton;

public class InicioActivity extends AppCompatActivity {

    private GoogleSignInOptions gso;
    private GoogleSignInClient gsc;
    private MaterialButton btnIngresar;
    private ImageView googleBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        TextView usuario = findViewById(R.id.usuario);
        TextView contra = findViewById(R.id.contra);
        btnIngresar = findViewById(R.id.boton);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            navegar();
            return; // Salir del método para evitar que se continúe mostrando la actividad actual
        }

        googleBoton = findViewById(R.id.google_boton);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this, gso);

        googleBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sesion();
            }
        });

        // admin
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioText = usuario.getText().toString();
                String contraText = contra.getText().toString();
                if (usuarioText.equalsIgnoreCase("lore") && contraText.equals("lore")) {
                    Toast.makeText(InicioActivity.this, "SE INICIÓ SESIÓN CON ÉXITO", Toast.LENGTH_SHORT).show();
                    navegar();
                    finish(); // Finalizar la actividad actual
                } else {
                    String mensajeError = "FALLÓ EL INICIO DE SESIÓN. Usuario: " + usuarioText + ", Contraseña: " + contraText;
                    Toast.makeText(InicioActivity.this, mensajeError, Toast.LENGTH_SHORT).show();
                    // Log para depuración
                    Log.d("MainActivity", mensajeError);
                }
            }
        });

    }

    private void sesion() {
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1000) {
            try {
                GoogleSignInAccount account = GoogleSignIn.getSignedInAccountFromIntent(data).getResult(ApiException.class);
                navegar();
                finish(); // Finalizar la actividad actual
            } catch (ApiException e) {
                Toast.makeText(getApplicationContext(), "Algo no funcionó", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void navegar() {
        Intent intent = new Intent(InicioActivity.this, CuestionarioActivity.class);
        startActivity(intent);

    }
}