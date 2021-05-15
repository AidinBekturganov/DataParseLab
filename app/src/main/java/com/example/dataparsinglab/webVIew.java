package com.example.dataparsinglab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webVIew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_v_iew);
        WebView webView = (WebView) findViewById(R.id.webiew);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://iuca.kg/ru");
    }


}