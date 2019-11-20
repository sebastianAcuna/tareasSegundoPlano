package com.example.tareasensegundoplanoprofesor.adapters.viewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareasensegundoplanoprofesor.clases.Estudiantes;
import com.example.tareasensegundoplanoprofesor.R;

public class viewHolderEstudiantes  extends RecyclerView.ViewHolder {

        private TextView asignatura_rv,codigo_asignatura_rv;


        public viewHolderEstudiantes(@NonNull View itemView) {
            super(itemView);


            asignatura_rv = (TextView) itemView.findViewById(R.id.asignatura_rv);
            codigo_asignatura_rv = (TextView) itemView.findViewById(R.id.codigo_asignatura_rv);

        }


        public void bind(Estudiantes asig){

            asignatura_rv.setText(String.valueOf(asig.getIdEstudiante()));
            codigo_asignatura_rv.setText(asig.getDescEstudiantes());


        }


    }

