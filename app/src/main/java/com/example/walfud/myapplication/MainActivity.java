package com.example.walfud.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.mylibrary.Lib;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lib.foo(this);
        Lib.fo2(this);
    }
}
