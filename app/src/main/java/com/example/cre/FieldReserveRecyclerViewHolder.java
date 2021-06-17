package com.example.cre;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class FieldReserveRecyclerViewHolder extends RecyclerView.ViewHolder
{
    private TextView date, data, state;


    public FieldReserveRecyclerViewHolder(@NonNull @NotNull View itemView)
    {
        super(itemView);

        date = itemView.findViewById(R.id.textView_item_reserve_date);
        data = itemView.findViewById(R.id.textView_item_reserve_data);
        state = itemView.findViewById(R.id.textView_item_reserve_state);

    }

    public void setView(ReserveData reserveData)
    {
        date.setText(reserveData.getDate());
        data.setText(reserveData.getInfo());
        state.setText(reserveData.getReserveState().toString());
    }
}
