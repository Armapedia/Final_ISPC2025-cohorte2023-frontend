package com.enciclopedia.armapedia;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RecuperarContrasenaActivity extends AppCompatActivity {

    private EditText etCorreoRecuperacion;
    private Button btnEnviarRecuperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contrasena);

        etCorreoRecuperacion = findViewById(R.id.etCorreoRecuperacion);
        btnEnviarRecuperacion = findViewById(R.id.btnEnviarRecuperacion);

        btnEnviarRecuperacion.setOnClickListener(v -> {
            String correo = etCorreoRecuperacion.getText().toString().trim();
            if (correo.isEmpty()) {
                Toast.makeText(this, "Ingresa tu correo electrónico", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Se ha enviado un correo de recuperación a " + correo, Toast.LENGTH_LONG).show();
                finish(); // Volver a la pantalla anterior
            }
        });
    }
}
