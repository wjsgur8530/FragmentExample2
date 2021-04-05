package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class category1 extends AppCompatActivity {

    Button btn_move;
    ProgressBar progressBar;

    private onKeyBackPressedListener mOnKeyBackPressedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category1);

        Intent intent = getIntent();
        int input_checked = intent.getExtras().getInt("input_checked");

        if (input_checked == 1) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment_category_1_fatten fragment_category_1_fatten = new Fragment_category_1_fatten();
            transaction.replace(R.id.framelayout, fragment_category_1_fatten); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
            transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
        }
        else if (input_checked == 2 || input_checked == 3) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment_category_1_breed_batch fragment_category_1_breed_batch = new Fragment_category_1_breed_batch();
            transaction.replace(R.id.framelayout, fragment_category_1_breed_batch); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
            transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
        }
        else if (input_checked == 4) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            fragment_category_1_milk fragment_category_1_milk = new fragment_category_1_milk();
            transaction.replace(R.id.framelayout, fragment_category_1_milk); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
            transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
        }
        else if (input_checked == 5) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            fragment_category_1_freestall fragment_category_1_freestall = new fragment_category_1_freestall();
            transaction.replace(R.id.framelayout, fragment_category_1_freestall); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
            transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
        }
    }

    public interface onKeyBackPressedListener{
        void onBackKey();
    }
    public void setOnKeyBackPressedListener(onKeyBackPressedListener listener){
        mOnKeyBackPressedListener = listener;
        //Fragment 로 뒤로가기 callback 보내기위한 로직
        if (mOnKeyBackPressedListener != null) {
            mOnKeyBackPressedListener.onBackKey();
        }else{
            super.onBackPressed();
        }
    }

}