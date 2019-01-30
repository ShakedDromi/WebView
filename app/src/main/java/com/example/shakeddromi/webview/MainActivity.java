package com.example.shakeddromi.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText et1, et2, et3;
    Button startpg, solu;
    int a, b, c;
    String url="https://www.google.co.il/search?ei=DXVCXKS6LbHrxgPV-YGYDw&q=";
    String st1,st2,st3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        startpg=findViewById(R.id.startpg);
        solu=findViewById(R.id.startpg);
    }

    public void statp(View view) {
        st1=et1.getText().toString();
        a=Integer.parseInt(st1);
        st2=et2.getText().toString();
        b=Integer.parseInt(st2);
        st3=et3.getText().toString();
        c=Integer.parseInt(st3);
        url="https://www.google.co.il/search?ei=DXVCXKS6LbHrxgPV-YGYDw&q=";
        url=url+a+"x%5E2%2B"+b+"x%2B"+c+"&oq";
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }

    public void solu(View view) {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        url="";
        webView.loadUrl(url);
    }
}
