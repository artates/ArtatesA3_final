package com.example.cisc.artatesa3_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Google extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        WebView google = (WebView) findViewById(R.id.webView_google);
        google.loadUrl("https://www.google.com/");
    }
}
