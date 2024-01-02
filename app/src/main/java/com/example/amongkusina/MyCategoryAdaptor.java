package com.example.amongkusina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyCategoryAdaptor extends RecyclerView.Adapter<MyCategoryHolder> {
    Context context;
    List<categoryItems> items;

    public MyCategoryAdaptor(Context context, List<categoryItems> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyCategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyCategoryHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyCategoryHolder holder, int position) {
        holder.image.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
