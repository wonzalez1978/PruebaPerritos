package cl.desafiolatam.pruebaperritos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cl.desafiolatam.pruebaperritos.view.AdapterPerritos;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> listaDatos;
    RecyclerView recycler;
    private Object ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerId);
       // recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        listaDatos = new ArrayList<String>();

        for ( int i = 0; i < 50 ; i++){
            listaDatos.add("Dato # "+i+" ");
        }
        AdapterPerritos adapter = new AdapterPerritos(listaDatos);
        recycler.setAdapter(adapter);
    }
}
