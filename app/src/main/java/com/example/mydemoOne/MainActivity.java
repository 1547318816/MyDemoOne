package com.example.mydemoOne;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mydemoOne.bean.Cat;

import javax.inject.Inject;


public class MainActivity  extends AppCompatActivity {

    @Inject
    Cat cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerMainComponent.builder()
//                .build()
//                .inject(this);

        Log.e("cat", cat.toString());
    }

}
