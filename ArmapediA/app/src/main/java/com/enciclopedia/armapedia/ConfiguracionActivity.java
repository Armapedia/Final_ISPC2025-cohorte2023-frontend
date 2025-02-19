package com.enciclopedia.armapedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ConfiguracionActivity extends AppCompatActivity {

    private Switch switchNotificaciones, switchModoOscuro;
    private Button btnCerrarSesion, btnPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        switchNotificaciones = findViewById(R.id.switchNotificaciones);
        switchModoOscuro = findViewById(R.id.switchModoOscuro);
        btnCerrarSesion = findViewById(R.id.btnCerrarSesion);
        btnPerfil = findViewById(R.id.btnPerfil); // Botón de perfil

        // Listeners para los switches
        switchNotificaciones.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String mensaje = isChecked ? "Notificaciones activadas" : "Notificaciones desactivadas";
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        });

        switchModoOscuro.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String mensaje = isChecked ? "Modo oscuro activado" : "Modo claro activado";
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        });

        // Navegar a la pantalla de perfil
        btnPerfil.setOnClickListener(v -> {
            Intent intent = new Intent(ConfiguracionActivity.this, PerfilActivity.class);
            startActivity(intent);
        });

        // Cerrar sesión y volver al landing page
        btnCerrarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(ConfiguracionActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
        });
    }
}
