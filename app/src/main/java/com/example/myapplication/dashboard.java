package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.listmodel;

import java.util.ArrayList;
import java.util.List;

public class dashboard extends Fragment {
    RecyclerView r;
    Button mycourses,myfaculty;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        r = view.findViewById(R.id.recyclerview);
        mycourses= view.findViewById(R.id.mycoursesbtn);
        myfaculty= view.findViewById(R.id.myfacultybtn);


        List<listmodel> items = new ArrayList<>();
        items.add(new listmodel("Attendance", R.drawable.atten));
        items.add(new listmodel("Time Table", R.drawable.tt));
        items.add(new listmodel("Calendar", R.drawable.calendar));
        items.add(new listmodel("My Courses", R.drawable.courses));
        items.add(new listmodel("My Faculty", R.drawable.faculty));
        MyAdapter adapter = new MyAdapter(requireContext(), items);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        r.setLayoutManager(gridLayoutManager);
        r.setAdapter(adapter);


        mycourses.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                gotomycourses(""," "," ");

            }
        });

        myfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotomyfaculty("","","");
            }
        });
        return view;
    }

    private void gotomycourses(String courseId, String courseName, String courseType) {
        final FragmentTransaction dashboardTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        final MyCourses mFragment = new MyCourses();
        Bundle mybundle = new Bundle();
        mybundle.putString("COURSEID", courseId);
        mybundle.putString("COURSENAME", courseName);
        mybundle.putString("COURSETYPE", courseType);
        mFragment.setArguments(mybundle);
        dashboardTransaction.replace(R.id.mainLayout, mFragment);
        dashboardTransaction.commit();

    }
    private void gotomyfaculty(String facultycrsid, String facultycrsname, String facultyname){
        final FragmentTransaction facultytransaction= getActivity().getSupportFragmentManager().beginTransaction();
        final MyFaculty facultyfragment = new MyFaculty();
        Bundle facultybundle = new Bundle();
        facultybundle.putString("FACULTYCOURSEID",facultycrsid);
        facultybundle.putString("FACULTYCOURSENAME",facultycrsname);
        facultybundle.putString("FACULTYNAME",facultyname);
        facultyfragment.setArguments(facultybundle);
        facultytransaction.replace(R.id.mainLayout,facultyfragment);
        facultytransaction.commit();

    }
}