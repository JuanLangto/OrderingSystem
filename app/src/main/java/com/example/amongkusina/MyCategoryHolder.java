package com.example.amongkusina;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyCategoryHolder extends RecyclerView.ViewHolder {
    ImageView image;
    public MyCategoryHolder(@NonNull View itemView) {
        super(itemView);
        image.findViewById(R.id.image);
    }
}
