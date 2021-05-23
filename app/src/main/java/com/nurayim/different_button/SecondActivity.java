package com.nurayim.different_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView myTextView;
    Button myButton1;
    Button myButton2;
    Button myButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myTextView = (TextView) findViewById(R.id.textView);
        myButton1 = (Button) findViewById(R.id.btn1);
        myButton2 = (Button) findViewById(R.id.btn2);
        myButton3 = (Button) findViewById(R.id.btn3);


        View.OnClickListener myButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn1:myTextView.setText("Вы нажали на первую кнопку ");
                    break;
                    case R.id.btn2:myTextView.setText("Вы нажали на вторую кнопку ");
                    break;
                    case R.id.btn3:myTextView.setText("Вы нажали на третью кнопку");
                    break;

                }

                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
        };


    };  // Здесь прописываем в скобках нашу переменную нашего слушателя 
        myButton1.setOnClickListener(myButton);
        myButton2.setOnClickListener(myButton);
        myButton3.setOnClickListener(myButton);
//Здесь мы прописали во втором активити три кнопки через switch case и инетн тож
// один интент на все три кнопки



}}