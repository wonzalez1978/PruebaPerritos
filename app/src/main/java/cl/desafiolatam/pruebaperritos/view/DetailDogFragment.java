package cl.desafiolatam.pruebaperritos.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import cl.desafiolatam.pruebaperritos.presenter.IPresenterViewDetalles;

public class DetailDogFragment extends Fragment implements IPresenterViewDetalles {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public DetailDogFragment() {

    }
    public static DetailDogFragment newInstance(String param1, String param2) {
        DetailDogFragment fragment = new DetailDogFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


}
