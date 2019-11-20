package com.example.tareasensegundoplanoprofesor.adapters.viewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareasensegundoplanoprofesor.clases.Asignatura;
import com.example.tareasensegundoplanoprofesor.R;

public class viewHolders extends RecyclerView.ViewHolder {

    private TextView asignatura_rv,codigo_asignatura_rv;


    public viewHolders(@NonNull View itemView) {
        super(itemView);


        asignatura_rv = (TextView) itemView.findViewById(R.id.asignatura_rv);
        codigo_asignatura_rv = (TextView) itemView.findViewById(R.id.codigo_asignatura_rv);

    }


    public void bind(Asignatura asig){

        asignatura_rv.setText(String.valueOf(asig.getIdAsignatura()));
        codigo_asignatura_rv.setText(asig.getDescAsignatura());


    }


}
