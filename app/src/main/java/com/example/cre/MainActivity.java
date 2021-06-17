package com.example.cre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnLoginClicked(View view) {
        Intent intent = new Intent(this, FieldActivity.class);
        startActivity(intent);
    }

    public void OnLoginAsManagerClicked(View view)
    {
        Intent intent = new Intent(this, ManagerActivity.class);
        startActivity(intent);
    }
}