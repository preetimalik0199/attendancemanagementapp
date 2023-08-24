package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.model.MyCourseModel;
import com.example.myapplication.model.listmodel;

import java.util.ArrayList;
import java.util.List;


public class MyCourses extends Fragment {
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_courses, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);


        ArrayList<MyCourseModel> myCourseModelArrayList= new ArrayList<>();
        myCourseModelArrayList.add(new MyCourseModel("IFT101","JAVA","Compulsory"));
        myCourseModelArrayList.add(new MyCourseModel("IFT102","Soft Computing","Compulsory"));
        myCourseModelArrayList.add(new MyCourseModel("IFT103","Artificial Intelligence","Compulsory"));
        myCourseModelArrayList.add(new MyCourseModel("IFT104","Computer Graphics","Compulsory"));
        myCourseModelArrayList.add(new MyCourseModel("IFT105","Software Engineering","Compulsory"));
        MyCouseAdapter courseAdapter= new MyCouseAdapter(requireContext(),myCourseModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(courseAdapter);


        return view;

    }
}