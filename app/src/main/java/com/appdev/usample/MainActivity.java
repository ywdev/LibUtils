package com.appdev.usample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.appdev.lib.utils.TimeUtils;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity_yw";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = TimeUtils.formatMillisToTimeString("yyyy-MM-dd HH:mm:ss", System.currentTimeMillis());
        Log.d(TAG,s);
    }
}
