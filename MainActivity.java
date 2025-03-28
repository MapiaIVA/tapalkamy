package com.example.myapplication5;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView counterTextView;
    private ImageView tapImage;
    private Button resetButton;
    private Button randomButton;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counterTextView);
        tapImage = findViewById(R.id.tapImage);
        resetButton = findViewById(R.id.resetButton);
        randomButton = findViewById(R.id.randomButton);

        // Обработка нажатия на изображение
        tapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                updateCounter();
            }
        });

        // Обработка нажатия на кнопку "Сбросить"
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                updateCounter();
            }
        });

        // Обработка нажатия на кнопку "Рандом"
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNumber = random.nextInt(100); // Случайное число от 0 до 99
                counter += randomNumber;
                updateCounter();
            }
        });
    }

    // Метод для обновления текста счетчика
    private void updateCounter() {
        counterTextView.setText(String.valueOf(counter));
    }
}