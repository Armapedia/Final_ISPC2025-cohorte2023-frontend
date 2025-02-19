package com.enciclopedia.armapedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SeleccionarCategoriaActivity extends AppCompatActivity {

    private Button btnArmasCortas, btnArmasLargas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_categoria);

        btnArmasCortas = findViewById(R.id.btnArmasCortas);
        btnArmasLargas = findViewById(R.id.btnArmasLargas);

        // Botón para Armas Cortas
        btnArmasCortas.setOnClickListener(v -> {
            Intent intent = new Intent(SeleccionarCategoriaActivity.this, ArmasCortasActivity.class);
            startActivity(intent);
        });

        // Botón para Armas Largas
        btnArmasLargas.setOnClickListener(v -> {
            Intent intent = new Intent(SeleccionarCategoriaActivity.this, ArmasLargasActivity.class);
            startActivity(intent);
        });
    }
}
