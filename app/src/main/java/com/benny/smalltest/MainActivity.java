package com.benny.smalltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Small.openUri("main",this);
    }
}
