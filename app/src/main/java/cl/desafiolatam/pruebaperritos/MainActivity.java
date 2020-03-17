package cl.desafiolatam.pruebaperritos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import cl.desafiolatam.pruebaperritos.view.DetailDogFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.mainFrameLayout, DetailDogFragment
                .newInstance(1), "listaPerritos").commit();

    }


}
