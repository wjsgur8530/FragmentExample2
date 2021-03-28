package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class category1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category1);

        Intent intent = getIntent();
        int input_checked = intent.getExtras().getInt("input_checked");

        if (input_checked == 1) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            fragment_category_1_milk fragment_category_1_milk = new fragment_category_1_milk();
            transaction.replace(R.id.framelayout, fragment_category_1_milk); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
            transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
        }
        else if (input_checked == 2) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            fragment_category_1_freestall fragment_category_1_freestall = new fragment_category_1_freestall();
            transaction.replace(R.id.framelayout, fragment_category_1_freestall); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
            transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
        }
    }
}