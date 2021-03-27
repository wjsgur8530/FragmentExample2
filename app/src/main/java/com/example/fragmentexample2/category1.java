package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class category1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category1);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        fragment_category_1 fragment_category_1 = new fragment_category_1();
        transaction.replace(R.id.framelayout, fragment_category_1); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
        transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
    }
}