package com.enciclopedia.armapedia;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class ArmasLargasActivity extends AppCompatActivity {

    private EditText buscador;
    private ListView listaArmas;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> armasLargas = new ArrayList<>(Arrays.asList("AK-47", "M4A1", "MP5", "Sniper Rifle"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armas_largas);

        buscador = findViewById(R.id.buscador);
        listaArmas = findViewById(R.id.listaArmas);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, armasLargas);
        listaArmas.setAdapter(adapter);

        buscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}
