package com.ngoctai.dmt.butonimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
  //Button buttonimage = new Button() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        relativeLayout =( RelativeLayout) findViewById(R.id.activity_main);
        Random random= random.nextInt()
    }
}