package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Integer input_checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button farm_selector = (Button) findViewById(R.id.farm_selector);
        RadioGroup input_farm = (RadioGroup) findViewById(R.id.input_farm); //2번 문항

        input_farm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.input_1) {
                    input_checked = 1;
                } else if (checkedId == R.id.input_2) {
                    input_checked = 2;
                }
            }
        });

        farm_selector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, category1.class);
                intent.putExtra("input_checked", input_checked);
                startActivity(intent);
            }
        });
    }
}