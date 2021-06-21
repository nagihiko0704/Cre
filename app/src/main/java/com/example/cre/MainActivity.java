package com.example.cre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppData appData = AppData.getInstance();

    private EditText id, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.etxt_main_loginID);
        password = findViewById(R.id.editTextTextPassword);

        Log.e("fieldID", appData.getFieldID());
        Log.e("fieldPassword", appData.getFieldPassword());
    }

    public void OnLoginClicked(View view)
    {
        if(appData.getFieldID().equals(id.getText().toString())
                && appData.getFieldPassword().equals(password.getText().toString()))
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
        if(appData.getManagerID().equals(id.getText().toString())
                && appData.getManagerPassword().equals(password.getText().toString()))
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