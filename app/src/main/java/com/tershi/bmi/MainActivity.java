package com.tershi.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weightEditText;
    EditText heightEditText;
    Button countButton;
    TextView results;
    TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = findViewById(R.id.weightEditText);
        heightEditText = findViewById(R.id.heightEditText);
        countButton =  findViewById(R.id.countButton);
        results = findViewById(R.id.results);
        result2 = findViewById(R.id.result2);
    }
    public void onCountClick(View v){
        double bmi = Double.parseDouble(weightEditText.getText().toString()) / Double.parseDouble(heightEditText.getText().toString()) / Double.parseDouble(heightEditText.getText().toString());
        results.setText(Double.toString(Math.round(bmi*10000)/10000.0));
        if (bmi >=35){
            result2.setText("重度肥胖");
        }else if (bmi >=30){
            result2.setText("中度肥胖");
        }else if (bmi >=27){
            result2.setText("輕度肥胖");
        }else if (bmi >=24){
            result2.setText("過重");
        }else if (bmi >=18.5){
            result2.setText("正常");
        }else if (bmi <18.5){
            result2.setText("過輕");
        }
    }
}