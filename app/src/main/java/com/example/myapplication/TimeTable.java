package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import com.example.myapplication.model.TimeTableModel;

import java.util.ArrayList;
import java.util.Calendar;


public class TimeTable extends Fragment {

    RecyclerView timetablerecycler;
    CalendarView calendarView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_time_table, container, false);

            timetablerecycler = view. findViewById(R.id.ttrecycler);
            calendarView = view.findViewById(R.id.calendar);

        ArrayList<TimeTableModel> dateWiseList = new ArrayList<>();
        ArrayList<TimeTableModel> timeWiseSubjectList = new ArrayList<>();

        timeWiseSubjectList.add(new TimeTableModel("09:00","10:00","Java"));
        timeWiseSubjectList.add(new TimeTableModel("10:00","11:00","Software Programming"));
        timeWiseSubjectList.add(new TimeTableModel("11:00","12:00","Computer Graphics"));

        dateWiseList.add(new TimeTableModel("16/08/2023" ,timeWiseSubjectList));



        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {

            }
        });


        return view;
    }
}