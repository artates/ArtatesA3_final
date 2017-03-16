package com.example.cisc.artatesa3_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Activity_Mesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__mesa);

        WebView mesa = (WebView) findViewById(R.id.webView_mesa);
        mesa.loadUrl("http://www.sdmesa.edu/");
    }
}
