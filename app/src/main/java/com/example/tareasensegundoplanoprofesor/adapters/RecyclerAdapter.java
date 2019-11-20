package com.example.tareasensegundoplanoprofesor.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareasensegundoplanoprofesor.clases.Asignatura;
import com.example.tareasensegundoplanoprofesor.R;
import com.example.tareasensegundoplanoprofesor.adapters.viewHolders.viewHolders;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<viewHolders> {

    private List<Asignatura> items;

    public RecyclerAdapter(List<Asignatura> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public viewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_asignaturas, parent,false);
        return new viewHolders(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolders holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
