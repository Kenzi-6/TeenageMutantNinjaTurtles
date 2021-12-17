package com.example.teenagemutantninjaturtles;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TextView textView = findViewById(R.id.heroesList2);
        WebView browser = findViewById(R.id.webBrowser);
        String heroVar = getIntent().getStringExtra("hero");
        switch (heroVar) {
            case ("Леонардо"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Леонардо_(мультсериал_2003)");
                break;
            case ("Рафаэль"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Рафаэль_(мультсериал_2003)");
                break;
            case ("Донателло"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Донателло_(мультсериал_2003)");
                break;
            case ("Микеланджело"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Микеланджело_(мультсериал_2003)");
                break;
            case ("Сплинтер"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Сплинтер_(мультсериал_2003)");
                break;
            case ("Эйприл О'Нил"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Эйприл_О%27Нил_(мультсериал_2003)");
                break;
            case ("Кейси Джонс"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Арнольд_Кейси_Джонс_мл._(мультсериал_2003)");
                break;
            case ("Шреддер"):
                textView.setText(heroVar);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://turtlepedia.fandom.com/ru/wiki/Ч%27релл_(мультсериал_2003)");
                break;

        }
    }
}
