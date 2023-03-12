package ru.mirea.pavlov.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    @Override
    ublic class MainActivity extends AppCompatActivity {
        private TextView textViewStudent;
        private Button btnWhoAmI;
        private Button btnItIsNotMe ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            textViewStudent = findViewById(R.id.textViewStudent);
            btnWhoAmI = findViewById(R.id.btnWhoAmI);
            btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        }
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку No 20");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    public void onButtonClick(View view)
    {
        textViewStudent.setText("Это не я");
        textViewStudent.setChecked(false);
    }
}