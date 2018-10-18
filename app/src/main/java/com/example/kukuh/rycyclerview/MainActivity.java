package com.example.kukuh.rycyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rl;
    String s1[],s2[];
    int imageResource[]={R.drawable.capcaygorengbakso,R.drawable.tumiskangkungterasi,R.drawable.terongbalado,R.drawable.sayurasemjawatimur,R.drawable.sambalgorengkentangtempe};

    MyOwnAdapter ad;
    //AdaptorResep ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (RecyclerView)findViewById(R.id.myRecycler);

        s1 = getResources().getStringArray(R.array.pet_name);
        s2 = getResources().getStringArray(R.array.desc);

        ad = new MyOwnAdapter(this,s1,s2,imageResource);

        rl.setAdapter(ad);
        rl.setLayoutManager(new LinearLayoutManager(this));
    }
}
