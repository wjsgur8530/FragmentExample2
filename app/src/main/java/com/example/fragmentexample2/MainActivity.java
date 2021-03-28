package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    public static Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        Button startbtn = (Button) findViewById(R.id.startbtn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Input_userinfo.class);
                startActivity(intent);
            }
        });
    }
    // 버튼 눌렀을 때 자동 스크롤 함수
    public static void scrollToView(View view, final ScrollView scrollView, int count) {
        if (view != null && view != scrollView) {
            count += view.getTop();
            scrollToView((View) view.getParent(), scrollView, count);
        } else if (scrollView != null) {
            final int finalCount = count;
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    scrollView.smoothScrollTo(0, finalCount);
                }
            }, 200);
        }
    }
}