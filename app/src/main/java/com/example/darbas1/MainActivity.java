package com.example.darbas1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.buttonAppear);
        Button btncolor = findViewById(R.id.buttonColor);
        TextView text = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "The Button Has Been Clicked", Toast.LENGTH_LONG).show();
            }
        });
        btncolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextColor(Color.rgb(100,0,0));
            }
        });

    }

}