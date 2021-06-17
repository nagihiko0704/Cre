package com.example.cre;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class FieldActivity extends AppCompatActivity
{
    private BottomNavigationView bottomNavigationView;
    private FieldReserveRecyclerViewHolder fieldReserveRecyclerViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_main);

        setBottomNavigationView();

    }

    protected void setBottomNavigationView()
    {
        getSupportFragmentManager().beginTransaction().add(R.id.field_content, new FieldLeftNumFragment()).commit();

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.item_field_leftnum:
                        getSupportFragmentManager().beginTransaction().replace(R.id.field_content, new FieldLeftNumFragment()).commit();
                        break;

                    case R.id.item_field_reserve:
                        getSupportFragmentManager().beginTransaction().replace(R.id.field_content, new FieldReserveFragment()).commit();
                        break;

                    case R.id.item_field_setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.field_content, new FieldSettingFragment()).commit();
                        break;
                }

                return true;
            }
        });
    }


}
