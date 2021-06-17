package com.example.cre;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FieldReserveAdapter extends RecyclerView.Adapter<FieldReserveRecyclerViewHolder>
{
    private ArrayList<ReserveData> reserveDataList = new ArrayList<>();

    public FieldReserveAdapter(ArrayList<ReserveData> reserveDataSet, Activity activity)
    {
        this.reserveDataList = reserveDataSet;
    }

    @NonNull
    @NotNull
    @Override
    public FieldReserveRecyclerViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reserve, parent, false);

        FieldReserveRecyclerViewHolder fieldReserveRecyclerViewHolder
                = new FieldReserveRecyclerViewHolder(view);

        return fieldReserveRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FieldReserveRecyclerViewHolder holder, int position)
    {
        ReserveData reserveData = reserveDataList.get(position);
        holder.setView(reserveData);
    }

    @Override
    public int getItemCount()
    {
        return reserveDataList.size();
    }

    public void addReserve(ReserveData reserveData)
    {
        reserveDataList.add(reserveData);
    }

    public void addReserveList(ArrayList<ReserveData> reserveDataList)
    {
        this.reserveDataList = reserveDataList;
    }
}
