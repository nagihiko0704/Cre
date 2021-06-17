package com.example.cre;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ManagerPlacingRecyclerViewHolder extends RecyclerView.ViewHolder
{
    private TextView field, info1, info2;

    public ManagerPlacingRecyclerViewHolder(@NonNull @NotNull View itemView)
    {
        super(itemView);

        field = itemView.findViewById(R.id.textView_item_placing_field);
        info1 = itemView.findViewById(R.id.textView_item_placing_info_1);
        info2 = itemView.findViewById(R.id.textView_item_placing_info_2);
    }

    public void setView()
    {

    }
}
