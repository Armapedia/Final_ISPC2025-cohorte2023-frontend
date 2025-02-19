package com.enciclopedia.armapedia;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    private EditText etNombre, etContrasena;
    private Button btnGuardarCambios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        etNombre = findViewById(R.id.etNombre);
        etContrasena = findViewById(R.id.etContrasena);
        btnGuardarCambios = findViewById(R.id.btnGuardarCambios);

        btnGuardarCambios.setOnClickListener(v -> {
            String nuevoNombre = etNombre.getText().toString().trim();
            String nuevaContrasena = etContrasena.getText().toString().trim();

            if (nuevoNombre.isEmpty() || nuevaContrasena.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
            } else {
                // Lógica para guardar los cambios en la base de datos o preferencias compartidas
                Toast.makeText(this, "Cambios guardados", Toast.LENGTH_SHORT).show();
                finish(); // Volver a la pantalla anterior
            }
        });
    }
}
