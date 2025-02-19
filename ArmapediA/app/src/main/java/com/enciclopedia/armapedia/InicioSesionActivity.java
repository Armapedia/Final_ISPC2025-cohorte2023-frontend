package com.enciclopedia.armapedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class InicioSesionActivity extends AppCompatActivity {

    private EditText etCorreo, etContrasena;
    private Button btnIniciarSesion;
    private TextView tvOlvidasteContrasena, tvNoEstasRegistrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        etCorreo = findViewById(R.id.etCorreo);
        etContrasena = findViewById(R.id.etContrasena);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        tvOlvidasteContrasena = findViewById(R.id.tvOlvidasteContrasena);
        tvNoEstasRegistrado = findViewById(R.id.tvNoEstasRegistrado);

        btnIniciarSesion.setOnClickListener(v -> validarCredenciales());

        // Navegar a la pantalla de recuperación de contraseña
        tvOlvidasteContrasena.setOnClickListener(v -> {
            Intent intent = new Intent(InicioSesionActivity.this, RecuperarContrasenaActivity.class);
            startActivity(intent);
        });

        // Navegar a la pantalla de registro
        tvNoEstasRegistrado.setOnClickListener(v -> {
            Intent intent = new Intent(InicioSesionActivity.this, RegistroActivity.class);
            startActivity(intent);
        });
    }

    private void validarCredenciales() {
        String correo = etCorreo.getText().toString().trim();
        String contrasena = etContrasena.getText().toString().trim();

        if (correo.isEmpty() || contrasena.isEmpty()) {
            Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
        } else if (correo.equals("usuario@armapedia.com") && contrasena.equals("1234")) {
            // Inicio de sesión exitoso
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(InicioSesionActivity.this, MenuPrincipalActivity.class);
            startActivity(intent);
            finish(); // Evita volver al login al presionar 'Atrás'
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}
