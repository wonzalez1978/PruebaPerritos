package cl.desafiolatam.pruebaperritos.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.pruebaperritos.R;

public class AdapterPerritos extends RecyclerView.Adapter<AdapterPerritos.ViewHolderDatos> {
    private static final String TAG = "MyDogRecyclerViewAdapter";
    private final List<String> mValues;
    private AdapterView.OnItemClickListener mListener;
    //crear la referencia a la lista de perritos y constructor explícito

    ArrayList<String> listaDatos;

    public AdapterPerritos(List<String> mValues, AdapterView.OnItemClickListener mListener, ArrayList<String> listaDatos) {
        this.mValues = mValues;
        this.mListener = mListener;
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragmentdetaildog, parent, false );

        return new ViewHolderDatos(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.asignardatos(listaDatos.get(position));

    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView dato;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            dato = itemView.findViewById(R.id.idDato);
        }

        public void asignardatos(String datos) {
            dato.setText(datos);
        }
    }
}
