package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.model.listmodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mContentRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotodashboard("", "");
    }

    private void gotodashboard(String user, String pswrd) {
        final FragmentManager mFragmentManager = getSupportFragmentManager();
        final FragmentTransaction mfragmentTransaction = mFragmentManager.beginTransaction();
        final dashboard mFragment = new dashboard();
        Bundle mbundle = new Bundle();
        mbundle.putString("USERNAME", user);
        mbundle.putString("PASSWORD", pswrd);
        mFragment.setArguments(mbundle);

        mfragmentTransaction.replace(R.id.mainLayout, mFragment);
        mfragmentTransaction.commit();
    }
}
