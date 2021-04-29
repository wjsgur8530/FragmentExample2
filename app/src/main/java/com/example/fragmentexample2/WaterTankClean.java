package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WaterTankClean extends AppCompatActivity {

    LinearLayout dynamicLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_tank_clean);

        Intent intent = getIntent();
        int get_water_Tank_Clean = intent.getExtras().getInt("water_Tank_Clean_Num");

        dynamicLayout = (LinearLayout)findViewById(R.id.dynamicLayout);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        for(int i = 0; i < get_water_Tank_Clean; i++) {
            TextView waterTankClean_text = new TextView(this);
            TextView waterTankClean_text1 = new TextView(this);
            TextView waterTankClean_text2 = new TextView(this);
            TextView waterTankClean_text3 = new TextView(this);
            TextView waterTankClean_text4 = new TextView(this);
            EditText waterTankClean_q1 = new EditText(this);
            EditText waterTankClean_q2 = new EditText(this);
            EditText waterTankClean_q3 = new EditText(this);
            EditText waterTankClean_q4 = new EditText(this);

            LinearLayout dynamicHori = new LinearLayout(this);
            dynamicHori.setOrientation(LinearLayout.VERTICAL);
//            waterTankClean_q1.getResources().getDrawable(R.drawable.button_circle);

            waterTankClean_text.setText("제"+(i+1)+"축사동");
            waterTankClean_text.setBackgroundResource(R.color.colorPrimary);
            waterTankClean_text.setTextColor(Color.parseColor("#ffffff"));
            waterTankClean_text1.setTextColor(Color.parseColor("#000000"));
            waterTankClean_text2.setTextColor(Color.parseColor("#000000"));
            waterTankClean_text3.setTextColor(Color.parseColor("#000000"));
            waterTankClean_text4.setTextColor(Color.parseColor("#000000"));

            dynamicHori.addView(waterTankClean_text);
            dynamicHori.setBackgroundResource(R.drawable.button_circle_line);

            waterTankClean_text1.setText("동별 표본펜 위치를 입력하세요");
            dynamicHori.addView(waterTankClean_text1);
            waterTankClean_q1.setHint("동별 표본펜 위치를 입력하세요");
            dynamicHori.addView(waterTankClean_q1);

            waterTankClean_text2.setText("표본펠 별 사육두수를 입력하세요");
            dynamicHori.addView(waterTankClean_text2);
            waterTankClean_q2.setHint("표본펠 별 사육두수를 입력하세요");
            dynamicHori.addView(waterTankClean_q2);

            waterTankClean_text3.setText("표본펜 별 대기우 수를 입력하세요");
            dynamicHori.addView(waterTankClean_text3);
            waterTankClean_q3.setHint("표본펜 별 대기우 수를 입력하세요");
            dynamicHori.addView(waterTankClean_q3);

            waterTankClean_text4.setText("표본펜 별 음수우 음수시간을 입력하세요");
            dynamicHori.addView(waterTankClean_text4);
            waterTankClean_q4.setHint("표본펜 별 음수우 음수시간을 입력하세요");
            dynamicHori.addView(waterTankClean_q4);
            dynamicLayout.addView(dynamicHori);
        }
    }
    public void back(View view) {
        finish();
    }
}