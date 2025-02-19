package com.enciclopedia.armapedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HistoriaArmasActivity extends AppCompatActivity {

    private Button btnVolverCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_armas);

        btnVolverCatalogo = findViewById(R.id.btnVolverCatalogo);

        // Evento para volver al catálogo
        btnVolverCatalogo.setOnClickListener(v -> {
            Intent intent = new Intent(HistoriaArmasActivity.this, CatalogoActivity.class);
            startActivity(intent);
            finish(); // Cierra la pantalla actual para evitar volver atrás con el botón de retroceso
        });
    }
}
