package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    RecyclerView recyclerView;
    int a = random3();
    String titulo[] = new String[a];
    String descripcion[] = new String[a];
    int avatar[] = new int[a] ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i<a ; i++){
            titulo[i]="titulo " + i;
        }
        for(int i=0; i<a ; i++){
            descripcion[i]="descipcion " + i;
        }
        for(int i=0; i<a ; i++){
            if(i %2 ==0) {
                avatar[i] = R.drawable.a;
            }else {
                avatar[i] = R.drawable.c;
            }
        }
        recyclerView = findViewById(R.id.Recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new datos(this,titulo,descripcion,avatar));
    }
    public  int  random3(){
        random.setSeed(System.currentTimeMillis());
        int random4 =100+ random.nextInt(500);

        return random4;

    }
}