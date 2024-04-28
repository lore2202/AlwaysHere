package com.example.alwaysapp_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFrasesMotivacionales extends AppCompatActivity {

    Button btnFrasesInspiradoras, btnAmorP, btnReflex, btnSup;
    TextView textViewFrases, textAmorP, textReflex, textSup;
    boolean frasesInspiradorasVisible, amorPropioVisible, reflexivasVisible, superacionVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases_motivacionales);

        btnFrasesInspiradoras = findViewById(R.id.btnFrasesInspiradoras);
        btnAmorP = findViewById(R.id.btnAmorP);
        btnReflex = findViewById(R.id.btnReflex);
        btnSup = findViewById(R.id.btnSup);

        textViewFrases = findViewById(R.id.textViewFrases);
        textAmorP = findViewById(R.id.textAmorP);
        textReflex = findViewById(R.id.textReflex);
        textSup = findViewById(R.id.textSup);

        frasesInspiradorasVisible = false;
        amorPropioVisible = false;
        reflexivasVisible = false;
        superacionVisible = false;

        btnFrasesInspiradoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!frasesInspiradorasVisible) {
                    textViewFrases.setText("“Si nos gusta lo que hacemos, si siempre hacemos nuestro mejor esfuerzo, entonces, realmente, estamos disfrutando de la vida.” — Miguel Ángel Ruiz \n“El único modo de hacer un gran trabajo es amar lo que haces.” — Steve Jobs");
                    textViewFrases.setVisibility(View.VISIBLE);
                    frasesInspiradorasVisible = true;
                } else {
                    textViewFrases.setVisibility(View.GONE);
                    frasesInspiradorasVisible = false;
                }
            }
        });

        btnAmorP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!amorPropioVisible) {
                    textAmorP.setText("“Amarse a uno mismo es el comienzo de un romance de por vida.” — Oscar Wilde\n “Querer ser otra persona es un desperdicio de la persona que eres”. — Marilyn Monroe ");
                    textAmorP.setVisibility(View.VISIBLE);
                    amorPropioVisible = true;
                } else {
                    textAmorP.setVisibility(View.GONE);
                    amorPropioVisible = false;
                }
            }
        });

        btnReflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!reflexivasVisible) {
                    textReflex.setText("“La felicidad de tu vida depende de la calidad de tus pensamientos.” — Marco Aurelio\n “El mayor enemigo del conocimiento no es la ignorancia, sino la ilusión del conocimiento.” — Stephen Hawking");
                    textReflex.setVisibility(View.VISIBLE);
                    reflexivasVisible = true;
                } else {
                    textReflex.setVisibility(View.GONE);
                    reflexivasVisible = false;
                }
            }
        });

        btnSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!superacionVisible) {
                    textSup.setText("“Sé el cambio que quieres ver en el mundo.” — Mahatma Gandhi\n“El cambio es ley de vida. Cualquiera que sólo mire al pasado o al presente, se perderá el futuro.” — John F. Kennedy");
                    textSup.setVisibility(View.VISIBLE);
                    superacionVisible = true;
                } else {
                    textSup.setVisibility(View.GONE);
                    superacionVisible = false;
                }
            }
        });
    }
}
