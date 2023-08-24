package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.MyCourseModel;
import com.example.myapplication.model.listmodel;

import java.util.ArrayList;
import java.util.List;

public class MyCouseAdapter extends RecyclerView.Adapter<MyCouseAdapter.MyViewHolder> {
    Context context;
    ArrayList<MyCourseModel> courseModelList;

    public MyCouseAdapter(Context context, ArrayList<MyCourseModel> courseModelList) {
        this.context = context;
        this.courseModelList = courseModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.mycourselayout, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyCourseModel courseModel = courseModelList.get(position);
        holder.courseId.setText(courseModel.getCourseId());
        holder.courseName.setText(courseModel.getCourseName());
        holder.courseType.setText(courseModel.getType());


    }

    @Override
    public int getItemCount() {
        return courseModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView courseId, courseName, courseType;

        public MyViewHolder(@NonNull View courseView) {
            super(courseView);
            courseId = courseView.findViewById(R.id.crsid);
            courseName = courseView.findViewById(R.id.crsname);
            courseType = courseView.findViewById(R.id.crstype);

        }
    }
}




