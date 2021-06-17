package com.example.cre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class ManagerActivity extends AppCompatActivity
{
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_main);

        setBottomNavigationView();
    }

    protected void setBottomNavigationView()
    {
        getSupportFragmentManager().beginTransaction().add(R.id.manager_content, new ManagerReserveFragment()).commit();

        bottomNavigationView = findViewById(R.id.bottomNavigationView_manager);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.item_manager_reserve:
                        getSupportFragmentManager().beginTransaction().replace(R.id.manager_content, new ManagerReserveFragment()).commit();
                        break;

                    case R.id.item_manager_placing:
                        getSupportFragmentManager().beginTransaction().replace(R.id.manager_content, new ManagerPlacingFragment()).commit();
                        break;

                    case R.id.item_manager_leftnum:
                        getSupportFragmentManager().beginTransaction().replace(R.id.manager_content, new ManagerLeftNumFragment()).commit();
                        break;

                    case R.id.item_manager_setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.manager_content, new ManagerSettingFragment()).commit();
                        break;
                }

                return true;
            }
        });
    }
}