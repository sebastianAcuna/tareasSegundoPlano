package com.example.tareasensegundoplanoprofesor.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareasensegundoplanoprofesor.clases.Estudiantes;
import com.example.tareasensegundoplanoprofesor.R;
import com.example.tareasensegundoplanoprofesor.adapters.viewHolders.viewHolderEstudiantes;

import java.util.List;

public class adapterEstudiantes extends RecyclerView.Adapter<viewHolderEstudiantes> {

    private List<Estudiantes> items;

    public adapterEstudiantes(List<Estudiantes> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public viewHolderEstudiantes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_asignaturas, parent,false);
        return new viewHolderEstudiantes(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderEstudiantes holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
