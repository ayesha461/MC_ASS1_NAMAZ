package com.example.ass1namaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void niyet(View view) {
        Intent intent=new Intent(dashboard.this,niyet.class);
        startActivity(intent);
    }

    public void sana(View view) {
        Intent intent=new Intent(dashboard.this,sana.class);
        startActivity(intent);
    }

    public void surahAlFatiha(View view) {
        Intent intent=new Intent(dashboard.this,surahAlFatiha.class);
        startActivity(intent);
    }

    public void surahIkhlas(View view) {
        Intent intent=new Intent(dashboard.this,SurahIkhlas.class);
        startActivity(intent);
    }

    public void ruku(View view) {
        Intent intent=new Intent(dashboard.this,Ruku.class);
        startActivity(intent);
    }

    public void qooma(View view) {
        Intent intent=new Intent(dashboard.this,qooma.class);
        startActivity(intent);
    }

    public void sajda(View view) {
        Intent intent=new Intent(dashboard.this,sajda.class);
        startActivity(intent);
    }

    public void tashud(View view) {
        Intent intent=new Intent(dashboard.this,tashud.class);
        startActivity(intent);
    }

    public void durood(View view) {
        Intent intent=new Intent(dashboard.this,durood.class);
        startActivity(intent);
    }

    public void duaAfterDurood(View view) {
        Intent intent=new Intent(dashboard.this,duasAfterDurood.class);
        startActivity(intent);
    }

    public void salaam(View view) {
        Intent intent=new Intent(dashboard.this,salaam.class);
        startActivity(intent);
    }
}