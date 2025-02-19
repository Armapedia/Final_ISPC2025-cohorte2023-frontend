package com.enciclopedia.armapedia;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class FavoritosActivity extends AppCompatActivity {

    private ListView listaFavoritos;
    private String[] favoritos = {"Arma 1", "Arma 2", "Arma 3", "Arma 4"}; // Ejemplo de datos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        listaFavoritos = findViewById(R.id.listaFavoritos);

        // Adaptador para mostrar la lista de favoritos
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, favoritos);
        listaFavoritos.setAdapter(adapter);
    }
}
