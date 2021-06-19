package com.example.cre;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ManagerPlacingAdapter extends RecyclerView.Adapter<ManagerPlacingRecyclerViewHolder>
{
    private ArrayList<PlacingData> placingDataArrayList;

    public ManagerPlacingAdapter(ArrayList<PlacingData> placingData)
    {
        this.placingDataArrayList = placingData;
    }

    @NonNull
    @NotNull
    @Override
    public ManagerPlacingRecyclerViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_placing, parent, false);

        ManagerPlacingRecyclerViewHolder managerPlacingRecyclerViewHolder
                = new ManagerPlacingRecyclerViewHolder(view);

        return managerPlacingRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ManagerPlacingRecyclerViewHolder holder, int position)
    {
        PlacingData placingData = placingDataArrayList.get(position);
        holder.setView(placingData);
    }

    @Override
    public int getItemCount()
    {
        return this.placingDataArrayList.size();
    }
}
