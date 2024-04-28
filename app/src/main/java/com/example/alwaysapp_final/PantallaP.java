package com.example.alwaysapp_final;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class PantallaP extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_p);

        videoView = findViewById(R.id.videoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video2);
        videoView.setVideoURI(uri);
        videoView.start();

        Button btnDormir = findViewById(R.id.btnDormir);
        btnDormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaP.this, ActivityDormir.class);
                startActivity(intent);
            }
        });

        Button btnDatosCientificos = findViewById(R.id.btnDatosCientificos);
        btnDatosCientificos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaP.this, ActivityDatosCientificos.class);
                startActivity(intent);
            }
        });

        Button btnMeditaciones = findViewById(R.id.btnMeditaciones);
        btnMeditaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaP.this, ActivityMeditaciones.class);
                startActivity(intent);
            }
        });

        Button btnFrasesMotivacionales = findViewById(R.id.btnFrasesMotivacionales);
        btnFrasesMotivacionales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaP.this, ActivityFrasesMotivacionales.class);
                startActivity(intent);
            }
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("No puedes regresar a la pantalla anterior")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // No hacer nada, simplemente cerrar el diálogo
                        dialog.dismiss();
                    }
                })
                .show();
    }



    @Override
    protected void onResume() {
        super.onResume();
        if (videoView != null && !videoView.isPlaying()) {
            videoView.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (videoView != null && videoView.isPlaying()) {
            videoView.pause();
        }
    }

}
