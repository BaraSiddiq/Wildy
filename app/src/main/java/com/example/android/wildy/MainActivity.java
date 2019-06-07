package com.example.android.wildy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;
    final String nintendoUrl = "https://www.nintendo.com/games/switch/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.ok_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nintendoIntent = new Intent(MainActivity.this, NintendoWebView.class);
                nintendoIntent.putExtra("nintendoUrl", nintendoUrl);
                startActivity(nintendoIntent);
            }
        });
    }
}
