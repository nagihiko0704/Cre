package com.example.cre;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ManagerReserveAdapter extends RecyclerView.Adapter<ManagerReserveRecyclerViewHolder>
{
    private ArrayList<ReserveData> managerReserveList = new ArrayList<>();

    public ManagerReserveAdapter(ArrayList<ReserveData> reserveData)
    {
        this.managerReserveList = reserveData;
    }

    @NonNull
    @NotNull
    @Override
    public ManagerReserveRecyclerViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reserve_manage, parent, false);

        ManagerReserveRecyclerViewHolder managerReserveRecyclerViewHolder
                = new ManagerReserveRecyclerViewHolder(view);

        return managerReserveRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ManagerReserveRecyclerViewHolder holder, int position)
    {
        ReserveData reserveData = managerReserveList.get(position);
        holder.setView(reserveData);
    }

    @Override
    public int getItemCount()
    {
        return managerReserveList.size();
    }
}
