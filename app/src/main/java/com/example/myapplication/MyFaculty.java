package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.model.MyFacultyModel;

import java.util.ArrayList;


public class MyFaculty extends Fragment {

        RecyclerView rv;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myfaculty, container, false);
        rv= view.findViewById(R.id.recyclerview);

        ArrayList<MyFacultyModel> myFacultyModelArrayList= new ArrayList<>();
        myFacultyModelArrayList.add(new MyFacultyModel("IFT101","JAVA","Ram"));
        myFacultyModelArrayList.add(new MyFacultyModel("IFT102","Soft Computing","Ram"));
        myFacultyModelArrayList.add(new MyFacultyModel("IFT103","Artificial Intelligence","Ram"));
        myFacultyModelArrayList.add(new MyFacultyModel("IFT104","Computer Graphics","Ram"));
        myFacultyModelArrayList.add(new MyFacultyModel("IFT105","Software Engineering","Ram"));
        MyFacultyAdapter facultyAdapter= new MyFacultyAdapter(requireContext(),myFacultyModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(facultyAdapter);


        return view;
    }
}