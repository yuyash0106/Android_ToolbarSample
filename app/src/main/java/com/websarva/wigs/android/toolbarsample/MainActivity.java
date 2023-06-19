package com.websarva.wigs.android.toolbarsample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbarを取得。
        Toolbar toolbar = findViewById(R.id.toolbar);
        //ツールバーにロゴを設定。
        toolbar.setLogo(R.mipmap.ic_launcher);
        //ツールバーにタイトル文字列を設定。
        toolbar.setTitle(R.string.toolbar_title);
        //ツールバーのタイトル文字色を設定。
        toolbar.setTitleTextColor(Color.WHITE);
        //ツールバーのサブタイトル文字列を設定。
        toolbar.setSubtitle(R.string.toolbar_subtitle);
        //ツールバーのサブタイトル文字色を設定。
        toolbar.setSubtitleTextColor(Color.LTGRAY);
        //アクションバーにツールバーを設定。
       setActionBar(toolbar);
    }
 }