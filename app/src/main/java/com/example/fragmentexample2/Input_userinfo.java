package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Input_userinfo extends AppCompatActivity {

    Integer input_checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_userinfo);

        Button farm_selector = (Button) findViewById(R.id.farm_selector);
        RadioGroup input_farm = (RadioGroup) findViewById(R.id.input_farm);

        input_farm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.input_1) { // 비육 농장
                    input_checked = 1;
                } else if (checkedId == R.id.input_2) { // 번식 농장
                    input_checked = 2;
                } else if (checkedId == R.id.input_3) { // 일괄 사육 농장
                    input_checked = 3;
                } else if (checkedId == R.id.input_4) { // 젖소 일반 우사
                    input_checked = 4;
                } else if (checkedId == R.id.input_5) { // 젖소 프리스톨 우사
                    input_checked = 5;
                }
            }
        });

        farm_selector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Input_userinfo.this, category1.class);
                intent.putExtra("input_checked", input_checked);
                startActivity(intent);
            }
        });
    }
}