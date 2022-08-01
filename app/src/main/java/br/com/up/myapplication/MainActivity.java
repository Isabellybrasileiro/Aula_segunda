package br.com.up.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewTitle = findViewById(R.id.text_title);
        textViewTitle.setText("Olá turma de ADS");
        textViewTitle.setTextColor(Color.RED);

        TextView textView = findViewById(R.id.text_secundario);
        textView.setText("Olá turma de ADS - Segunda");

        TextView button = findViewById(R.id.button);
        button.setText("Click em mim");
    }
}