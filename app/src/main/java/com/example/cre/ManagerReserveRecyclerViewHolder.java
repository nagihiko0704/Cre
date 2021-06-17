package com.example.cre;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ManagerReserveRecyclerViewHolder extends RecyclerView.ViewHolder
{
    private TextView field, info, state;

    public ManagerReserveRecyclerViewHolder(@NonNull @NotNull View itemView)
    {
        super(itemView);

        field = itemView.findViewById(R.id.textView_item_reserve_manage_field_name);
        info = itemView.findViewById(R.id.textView_item_reserve_manage_data);
        state = itemView.findViewById(R.id.textView_item_reserve_manage_state);
    }

    public void setView(ReserveData reserveData)
    {
        field.setText(reserveData.getPlace());
        info.setText(reserveData.getInfo());
        state.setText(reserveData.getReserveState().toString());
    }
}
