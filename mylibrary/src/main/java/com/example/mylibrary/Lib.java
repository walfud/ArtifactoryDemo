package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by walfud on 2016/10/20.
 */

public class Lib {
    public static void foo(Context context) {
        Toast.makeText(context, "foo", Toast.LENGTH_SHORT).show();
    }

    public static void fo2(Context context) {
        Toast.makeText(context, "fo", Toast.LENGTH_SHORT).show();
    }

    public static void fo3(Context context) {
        Toast.makeText(context, "fo2", Toast.LENGTH_SHORT).show();
    }
}
