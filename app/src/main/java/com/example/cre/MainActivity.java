package com.example.cre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText id, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.etxt_main_loginID);
        password = findViewById(R.id.editTextTextPassword);
    }

    public void OnLoginClicked(View view)
    {
        if(AppData.getFieldID() == id.getText().toString()
                && AppData.getFieldPassword() == password.getText().toString())
        {
            Intent intent = new Intent(this, FieldActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast loginError = Toast.makeText(this.getApplicationContext(), "아이디 혹은 비밀번호가 옳지 않습니다", Toast.LENGTH_SHORT);
            loginError.show();
        }

    }

    public void OnLoginAsManagerClicked(View view)
    {
        if(AppData.getManagerID() == id.getText().toString()
                && AppData.getManagerPassword() == password.getText().toString())
        {
            Intent intent = new Intent(this, ManagerActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast loginError = Toast.makeText(this.getApplicationContext(), "아이디 혹은 비밀번호가 옳지 않습니다", Toast.LENGTH_SHORT);
            loginError.show();
        }
    }
}