package com.example.android.wildy;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class NintendoWebView extends AppCompatActivity {

    WebView wv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nintendo_web_view);
        Intent recievedIntent = getIntent();
        String nintendoUrl = recievedIntent.getStringExtra("nintendoUrl");

        wv = findViewById(R.id.nintendo_wv);
        wv.setWebViewClient(new WebViewClient());


        wv.loadUrl(nintendoUrl);

    }
}
