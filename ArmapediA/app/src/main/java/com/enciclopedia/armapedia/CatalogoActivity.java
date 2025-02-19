package com.enciclopedia.armapedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CatalogoActivity extends AppCompatActivity {

    private Button btnArmasCortas, btnArmasLargas, btnHistoriaArmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_armas);

        btnArmasCortas = findViewById(R.id.btnArmasCortas);
        btnArmasLargas = findViewById(R.id.btnArmasLargas);
        btnHistoriaArmas = findViewById(R.id.btnHistoriaArmas);

        // Botón para Armas Cortas
        btnArmasCortas.setOnClickListener(v -> {
            Intent intent = new Intent(CatalogoActivity.this, ArmasCortasActivity.class);
            startActivity(intent);
        });

        // Botón para Armas Largas
        btnArmasLargas.setOnClickListener(v -> {
            Intent intent = new Intent(CatalogoActivity.this, ArmasLargasActivity.class);
            startActivity(intent);
        });

        // Botón para Historia de las Armas de Fuego
        btnHistoriaArmas.setOnClickListener(v -> {
            Intent intent = new Intent(CatalogoActivity.this, HistoriaArmasActivity.class);
            startActivity(intent);
        });
    }
}
