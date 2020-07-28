package com.tershi.myconstraubtkayiyt01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
    }
    public void showName(View view){
        String str = username.getText().toString();

        Toast.makeText(this,str,Toast.LENGTH_LONG).show();           //顯示在哪裡,顯示的內容,顯示的時間
    }
}