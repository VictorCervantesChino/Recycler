package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class datos  extends RecyclerView.Adapter<datos.ViewHolder> {
    LayoutInflater inflater=null;
    Context context;
    String[] titulo;
    String[] descripcion;
    int[] avatar;

    public datos(Context context, String[] titulo,String[] descripcion, int[] avatar) {

        this.context = context;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.avatar = avatar;

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public datos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.item_fila,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull datos.ViewHolder holder, int position) {
        holder.titulo.setText(titulo[position]);
        holder.descripcion.setText(descripcion[position]);
        holder.avatar.setImageResource(avatar[position]);
    }

    @Override
    public int getItemCount() {
        return titulo.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView descripcion;
        ImageView avatar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo=itemView.findViewById(R.id.titulo);
            descripcion=itemView.findViewById(R.id.descripcion);
            avatar=itemView.findViewById(R.id.avatar);
        }
    }
}
