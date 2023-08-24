package com.example.myapplication;
import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.listmodel;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<listmodel> items;

    public MyAdapter(Context context, List<listmodel> items) {
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.rowlayout,parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        listmodel datamodel = items.get(position);
        holder.name.setText(datamodel.getUserName());
        holder.imageview.setImageResource(datamodel.getImgid());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview=itemView.findViewById(R.id.imageview);
            name=itemView.findViewById(R.id.name);
        }
    }
}
