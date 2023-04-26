package com.example.rumireapavlovlesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class second_activity extends AppCompatActivity {

    private TextView currentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        currentText = findViewById(R.id.textView1);
        Intent intent = getIntent();
        String date = intent.getStringExtra("message");
        String msg = String.format("Квадрат значения моего номера по списку в группе составляет 400, а текущее время  %s", date);
        currentText.setText(msg);
    }
}