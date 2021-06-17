package com.example.cre;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ManagerLeftNumFragment extends Fragment
{
    private HorizontalBarChart barChart;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.frag_manager_leftnum, null);

        setBarChart(view);

        return view;
    }

    private void setBarChart(View v)
    {
        barChart = v.findViewById(R.id.chart_manager_leftnum);

        ArrayList<String> labels = new ArrayList<>();
        labels.add("21");
        labels.add("24");
        labels.add("27");
        labels.add("30");
        labels.add("35");

        BarData barData = new BarData(getDataSet());
        barData.setValueTextSize(14f);
        barData.setValueTextColor(Color.DKGRAY);
        barData.setBarWidth(0.6f);
        barData.setValueFormatter(new ValueFormatter()
        {
            @Override
            public String getFormattedValue(float value)
            {
                DecimalFormat format = new DecimalFormat("#");
                return format.format(value);
            }
        });

        barChart.setData(barData);
        barChart.setDrawGridBackground(false);
        barChart.setDrawBarShadow(true);
        barChart.animateY(1000);
        barChart.getDescription().setEnabled(false);

        barChart.getXAxis().setDrawGridLines(false);
        barChart.getXAxis().setDrawLabels(true);
        barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        barChart.getXAxis().setLabelCount(5);
        barChart.getXAxis().setTextSize(18);
        barChart.getXAxis().setValueFormatter(new ValueFormatter()
        {
            @Override
            public String getFormattedValue(float value)
            {
                return labels.get((int) value) + "\t";
            }
        });



        barChart.getAxisLeft().setDrawGridLines(false);
        barChart.getAxisLeft().setAxisMaximum(100f);
        barChart.getAxisLeft().setAxisMinimum(0f);
        barChart.getAxisLeft().setDrawLabels(false);

        barChart.getAxisRight().setDrawGridLines(false);
        barChart.getAxisRight().setDrawLabels(false);

        Legend legend = barChart.getLegend();
        legend.setEnabled(false);

        barChart.invalidate();
    }

    private BarDataSet getDataSet()
    {
        ArrayList<BarEntry> entries = new ArrayList<>();

        for(int i = 0; i < 5; i++)
        {
            entries.add(new BarEntry(i, (int) (Math.random() * 100)));
        }

        BarDataSet dataSet = new BarDataSet(entries, "");
        //dataSet.setColor(ContextCompat.getColor(getContext(), R.color.dark_mint_0));
        int starColor = ContextCompat.getColor(getActivity().getApplicationContext(), R.color.main_mint_0);
        int endColor = ContextCompat.getColor(requireActivity().getApplicationContext(), R.color.main_purple_0);

        dataSet.setGradientColor(starColor, endColor);

        return dataSet;
    }

    private void OnReserveEndButtonClicked()
    {

    }
}
