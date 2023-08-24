package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.TimeTableModel;

import java.util.ArrayList;

public class TimeTableAdapter extends RecyclerView.Adapter<TimeTableAdapter.MyViewHolder> {

Context context;
ArrayList<TimeTableModel> timetablemodelArrayList;

    public TimeTableAdapter(Context context, ArrayList<TimeTableModel> timetablemodelArrayList) {
        this.context= context;
        this.timetablemodelArrayList= timetablemodelArrayList;
    }


    @NonNull
    @Override
    public TimeTableAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TimeTableAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.timetablelayout, parent, false));
    }










    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView day, lecture1, lecture2,lecture3,lecture4,lecture5,lecture6,lecture7;

        public MyViewHolder(@NonNull View timetableview) {
            super(timetableview);
            day = timetableview.findViewById(R.id.);
            lecture1 = timetableview.findViewById(R.id.);
            lecture2 = timetableview.findViewById(R.id.);
            lecture3 = timetableview.findViewById(R.id.);
            lecture4 = timetableview.findViewById(R.id.);
            lecture5 = timetableview.findViewById(R.id.);
            lecture6 = timetableview.findViewById(R.id);
            lecture7 = timetableview.findViewById(R.id)

        }
}
}