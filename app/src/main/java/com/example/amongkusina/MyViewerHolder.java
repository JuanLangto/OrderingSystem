package com.example.amongkusina;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewerHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name;

    public MyViewerHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        name = itemView.findViewById(R.id.name);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(recyclerViewInterface != null){
                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION){
                        recyclerViewInterface.onItemClick(pos);
                    }
                }
            }
        });
    }
}
