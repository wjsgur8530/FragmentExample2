package com.example.fragmentexample2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragmentexample2.Fragment.fragment_category_1_freestall;

public class WaterTankClean extends AppCompatActivity {
    private View view;
    String result;
    TextView test;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_tank_clean);
        LinearLayout stable1 = findViewById(R.id.stable1);
        LinearLayout stable2 = findViewById(R.id.stable2);
        LinearLayout stable3 = findViewById(R.id.stable3);
        LinearLayout stable4 = findViewById(R.id.stable4);
        LinearLayout stable5 = findViewById(R.id.stable5);
        LinearLayout stable6 = findViewById(R.id.stable6);
        LinearLayout stable7 = findViewById(R.id.stable7);
        LinearLayout stable8 = findViewById(R.id.stable8);
        LinearLayout stable9 = findViewById(R.id.stable9);
        LinearLayout stable10 = findViewById(R.id.stable10);
        LinearLayout stable11 = findViewById(R.id.stable11);
        LinearLayout stable12 = findViewById(R.id.stable12);
        LinearLayout stable13 = findViewById(R.id.stable13);
        LinearLayout stable14 = findViewById(R.id.stable14);
        LinearLayout stable15 = findViewById(R.id.stable15);
        LinearLayout stable16 = findViewById(R.id.stable16);
        LinearLayout stable17 = findViewById(R.id.stable17);
        LinearLayout stable18 = findViewById(R.id.stable18);
        LinearLayout stable19 = findViewById(R.id.stable19);
        LinearLayout stable20 = findViewById(R.id.stable20);
        LinearLayout[] stable = {stable1, stable2, stable3, stable4, stable5, stable6, stable7, stable8, stable9, stable10, stable11, stable12, stable13, stable14, stable15, stable16, stable17, stable18, stable19, stable20};
        String[] stableName = {"1동", "2동", "3동", "4동", "5동", "6동", "7동", "8동", "9동", "10동", "11동", "12동", "13동","14동", "15동", "16동", "17동", "18동", "19동", "20동"};
        Intent intent = getIntent();
        result = intent.getStringExtra("water_Tank_Clean_Num");
        for(int j=0; j<stableName.length; j++) {
            if(result.equals(stableName[j])) {
                for(int i=1+j; i<stable.length; i++) {
                    stable[i].setVisibility(view.GONE);
                }
            }
        }

        EditText ed_1_waitNum = (EditText) findViewById(R.id.freestall_wait_num_a1);
        ed_1_waitNum.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                if(TextUtils.isEmpty(ed_1_waitNum.getText().toString())) {
                    String msg = "값을 입력하세요";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                } else {

                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        Log.d("파라미터값: ", result);
    }
    public int getWaterTankCleanScore(int waitNum, int waterEat) { //대기 우, 음수 시간
//        String waitNum, waterEat;
        int waterTankCleanScore = 0;

        if(waitNum >= 20 && waterEat >= 10) { //대기 우 20% 이상, 음수 시간 10분 이상(미흡)
            waterTankCleanScore = 2;
        }
        else if(waitNum <= 20 && waterEat <= 10) { //대기 우 20% 이하, 음수 시간 10분 이하(양호)
            waterTankCleanScore = 1;
        }
        else if(waitNum == 0 && waterEat <= 5) { //대기 우 없음, 음수 시간 5분 이하(매우 양호)
            waterTankCleanScore = 0;
        }
        return waterTankCleanScore;
    }
}