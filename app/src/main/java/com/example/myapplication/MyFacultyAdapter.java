package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.MyCourseModel;
import com.example.myapplication.model.MyFacultyModel;

import java.util.ArrayList;

public class MyFacultyAdapter extends RecyclerView.Adapter<MyFacultyAdapter.MyViewHolder> {
    Context context;
    ArrayList<MyFacultyModel> facultyModelArrayList;


    public MyFacultyAdapter(Context context, ArrayList<MyFacultyModel> facultyModelArrayList) {
        this.context = context;
        this.facultyModelArrayList = facultyModelArrayList;
    }


    @NonNull
    @Override
    public MyFacultyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyFacultyAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.myfacultylayout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyFacultyAdapter.MyViewHolder holder, int position) {
        MyFacultyModel facultyModel = facultyModelArrayList.get(position);
        holder.facultycourseId.setText(facultyModel.getFacultycrsid());
        holder.facultycourseName.setText(facultyModel.getFacultycrsname());
        holder.facultyname.setText(facultyModel.getFacultyname());
    }



    @Override
    public int getItemCount() {
        return facultyModelArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView facultycourseId, facultycourseName, facultyname;

        public MyViewHolder(@NonNull View facultyView) {
            super(facultyView);
            facultycourseId = facultyView.findViewById(R.id.cid);
            facultycourseName = facultyView.findViewById(R.id.cname);
            facultyname = facultyView.findViewById(R.id.facultyname);

        }
    }






}