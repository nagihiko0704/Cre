package com.example.cre;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FieldReserveFragment extends Fragment
{
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private FieldReserveAdapter fieldReserveAdapter;
    private ArrayList<ReserveData> reserveDataList = new ArrayList<>();

    private ImageButton btnAddReserve;
    private Button btnReserveCheck;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_field_reserve, container, false);

        setRecyclerView(view);
        setPopUpWindow(view);

        return view;
    }

    private void setRecyclerView(View v)
    {
        recyclerView = v.findViewById(R.id.recyclerView_freg_field_reserve);
        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.scrollToPosition(0);

        initReserveData();

        fieldReserveAdapter = new FieldReserveAdapter(reserveDataList, getActivity());

        recyclerView.setAdapter(fieldReserveAdapter);
    }

    private void initReserveData()
    {
        reserveDataList.add(new ReserveData("2021.05.03 (월)", "25 - 35 - 210 70㎥", ReserveState.취소));
        reserveDataList.add(new ReserveData("2021.05.03 (월)", "25 - 30 - 150 100㎥", ReserveState.대기));
        reserveDataList.add(new ReserveData("2021.05.01 (토)", "25 - 24 - 150 12㎥", ReserveState.확정));
        reserveDataList.add(new ReserveData("2021.05.01 (토)", "25 - 35 - 210 60㎥", ReserveState.대기));
        reserveDataList.add(new ReserveData("2021.04.30 (금)", "25 - 35 - 210 180㎥", ReserveState.확정));
        reserveDataList.add(new ReserveData("2021.04.29 (목)", "25 - 30 - 210 90㎥", ReserveState.취소));
        reserveDataList.add(new ReserveData("2021.04.28 (수)", "25 - 24 - 210 24㎥", ReserveState.대기));
    }

    private void setPopUpWindow(View v)
    {
        View puWindow = LayoutInflater.from(getActivity()).inflate(R.layout.puwin_add_reserve, null);
        final PopupWindow popupWindow = new PopupWindow(puWindow, 1000, 1400);

        popupWindow.setFocusable(true);

        btnAddReserve = v.findViewById(R.id.imageButton_field_reserve_add);
        btnAddReserve.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                popupWindow.showAtLocation(recyclerView, Gravity.CENTER, 0, 0);

                View root = getActivity().findViewById(R.id.constraintLayout_field_container);
                root.setForeground(new ColorDrawable(0xBE000000));
            }
        });

        btnReserveCheck = puWindow.findViewById(R.id.button_puwin_reserve);
        btnReserveCheck.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                View root = getActivity().findViewById(R.id.constraintLayout_field_container);
                root.setForeground(new ColorDrawable(0x00000000));

                popupWindow.dismiss();
            }
        });
    }

}
