package com.example.cre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shrikanthravi.collapsiblecalendarview.data.Day;
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar;

import java.util.ArrayList;

public class ManagerReserveFragment extends Fragment
{
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ManagerReserveAdapter managerReserveAdapter;
    private ArrayList<ReserveData> managerReserveList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.frag_manager_reserve, container, false);

        setManagerRecyclerView(view);

        return view;
    }

    private void setManagerRecyclerView(View v)
    {
        recyclerView = v.findViewById(R.id.recyclerView_frag_manager_reserve);
        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.scrollToPosition(0);

        initReserveData();

        managerReserveAdapter = new ManagerReserveAdapter(managerReserveList);

        recyclerView.setAdapter(managerReserveAdapter);
    }

    private void initReserveData()
    {
        managerReserveList.add(new ReserveData("2021.05.03 (월)", "25 - 35 - 210 70㎥", ReserveState.대기));
        managerReserveList.add(new ReserveData("2021.05.03 (월)", "25 - 30 - 150 100㎥", ReserveState.대기));
        managerReserveList.add(new ReserveData("2021.05.01 (토)", "25 - 24 - 150 12㎥", ReserveState.대기));
        managerReserveList.add(new ReserveData("2021.05.01 (토)", "25 - 35 - 210 60㎥", ReserveState.대기));
        managerReserveList.add(new ReserveData("2021.04.30 (금)", "25 - 35 - 210 180㎥", ReserveState.대기));
        managerReserveList.add(new ReserveData("2021.04.29 (목)", "25 - 30 - 210 90㎥", ReserveState.대기));
        managerReserveList.add(new ReserveData("2021.04.28 (수)", "25 - 24 - 210 24㎥", ReserveState.대기));
    }
}