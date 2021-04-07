package com.example.ass1namaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    private static int SPLASH_TIME_OUT=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =findViewById(R.id.logo);
        textView =findViewById(R.id.title);
        imageView.animate().translationXBy(450).setDuration(2000);
        textView.animate().translationXBy(450).setDuration(2000);

        // then make an handler for delay to move to next activity
        new Handler().postDelayed(new Runnable() {
            //then call run build in function to to move to next activity
            @Override
            public void run() {
                Intent homeIntent=new Intent(MainActivity.this,dashboard.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}