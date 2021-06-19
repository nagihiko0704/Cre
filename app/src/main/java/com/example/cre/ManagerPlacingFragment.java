package com.example.cre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ManagerPlacingFragment extends Fragment
{
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<PlacingData> placingDataArrayList = new ArrayList<>();
    private ManagerPlacingAdapter managerPlacingAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate((R.layout.frag_manager_placing), container, false);

        setPlacingRecyclerView(view);

        return view;
    }

    private void setPlacingRecyclerView(View v)
    {
        recyclerView = v.findViewById(R.id.recyclerView_frag_manager_placing);
        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.scrollToPosition(0);

        initPlacingData();

        managerPlacingAdapter = new ManagerPlacingAdapter(placingDataArrayList);

        recyclerView.setAdapter(managerPlacingAdapter);

    }

    private void initPlacingData()
    {
        placingDataArrayList.add(new PlacingData());
        placingDataArrayList.add(new PlacingData("영통물류센터개발지구"));
    }
}