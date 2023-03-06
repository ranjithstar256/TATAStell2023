package com.example.tatastell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    WebView wb;
    EditText e;
    String s;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        wb=findViewById(R.id.wbb);
        b=findViewById(R.id.button);
        e=findViewById(R.id.editTextTextPersonName);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https:www.google.com/");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wb.loadUrl("https:"+e.getText().toString());
            }
        });
    }
}