package com.example.amongkusina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amongkusina.Items.items;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewerHolder> {
private final RecyclerViewInterface recyclerViewInterface;
 Context context;
 List<items> items;

    public MyAdapter(Context context, List<com.example.amongkusina.Items.items> items , RecyclerViewInterface recycleViewInterface) {
        this.context = context;
        this.items = items;
        this.recyclerViewInterface = recycleViewInterface;
    }

    @NonNull
    @Override
    public MyViewerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewerHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false), recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewerHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.image.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
