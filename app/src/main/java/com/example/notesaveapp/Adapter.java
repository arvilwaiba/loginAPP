package com.example.notesaveapp;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private String[] data;

    public Adapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_design, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String texts = data[i];
        viewHolder.namesText.setText(texts);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namesText;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namesText = itemView.findViewById(R.id.nameTextView);
            imageView = itemView.findViewById(R.id.imgView);
        }
    }

}