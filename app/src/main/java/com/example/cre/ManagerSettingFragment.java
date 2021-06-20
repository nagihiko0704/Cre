package com.example.cre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.jetbrains.annotations.NotNull;

public class ManagerSettingFragment extends Fragment
{
    private Button profile, leftNum;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.frag_manager_setting, null);

        setButtons(view);

        return view;
    }

    private void setButtons(View v)
    {
        profile = v.findViewById(R.id.button_manager_setting_profile);
        leftNum = v.findViewById(R.id.button_manager_setting_leftnum);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.manager_content, new ProfileFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        leftNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
