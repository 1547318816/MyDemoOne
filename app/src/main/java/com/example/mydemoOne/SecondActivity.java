package com.example.mydemoOne;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mydemoOne.bean.Flower;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject
    Flower flower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerSecondComponent.builder()
//                // 设置 MainModule 对象
//                .mainModule(new MainModule())
//                .build()
//                .inject(this);

        Log.e("flower", flower.toString());
    }
}
