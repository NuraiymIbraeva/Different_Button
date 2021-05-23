package com.nurayim.different_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button btn1, btn2, btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);


        // OnClickListener - Это один из методов слушателя кнопки снизу передаем сам
        // слушатель также идет имплементация это было с помошью
        // интерфейса
        View.OnClickListener muBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Вы использовали первый метод");
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);


            }
        };
        btn1.setOnClickListener(muBtn);
        btn2.setOnClickListener(this::onClick);



    }

    @Override
    public void onClick(View v) {
        textView.setText("Вы использовали второй метод");
        //Внутри метода  кнопки прописывать и если оброщаться к кнопке через поля
        //то получится что будет вся инфа высвечиваться внутри кнопки
        //то очень нужно быть внимателькной к кому именно

    }


    public void ClickMuButton(View view) {
        //Здесь обращение через xml айл там создали onCLick метод и
        // здесь автоматом появляются
        textView.setText("Вы использовали третий метод ");
    }
}