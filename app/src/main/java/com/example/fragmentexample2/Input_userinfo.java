package com.example.fragmentexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import android.view.MotionEvent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import android.widget.Toast;


public class Input_userinfo extends AppCompatActivity {
    private static EditText editText;
    private static TextView textView;
    public static Context context_userinfo;
    public String result;
    public String total_cow_count;

    public String sample_size_count;



    private static final int SEARCH_ADDRESS_ACTIVITY = 10000;
    private EditText et_address;

    Integer input_checked = null;
    String farm_name;
    String farm_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_userinfo);
        context_userinfo = this;
        Button farm_selector = (Button) findViewById(R.id.farm_selector);
        RadioGroup input_farm = (RadioGroup) findViewById(R.id.input_farm);

        EditText total_cow = (EditText)findViewById(R.id.total_cow);
        TextView sample_size = (TextView)findViewById(R.id.sample_size);





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
                if(input_checked != null) {
                    Intent intent = new Intent(Input_userinfo.this, category1.class);
                    intent.putExtra("input_checked", input_checked);
                    startActivity(intent);
                } else {
                        String msg = "농장 종류를 선택해주세요";
                        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                }
            }
        });
        total_cow.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                if(TextUtils.isEmpty(total_cow.getText().toString())) {
                    sample_size.setText("값을 입력해주세요");
                } else {
                    result = getSampleSizeScore(total_cow.getText().toString());
                    sample_size.setText(result);
                    total_cow_count = total_cow.getText().toString();
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });

        total_cow.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                if(TextUtils.isEmpty(total_cow.getText().toString())) {
                    sample_size.setText("값을 입력해주세요");
                } else {
                    result = getSampleSizeScore(total_cow.getText().toString());
                    sample_size.setText(result);
                    total_cow_count = total_cow.getText().toString();
                    sample_size_count = result;
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        // 주소 입력을 위한 창
        et_address = (EditText) findViewById(R.id.et_address);


        if (et_address != null) {
            et_address.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event)
                {
                    if(event.getAction() == MotionEvent.ACTION_UP) {
                        Intent i = new Intent(Input_userinfo.this, com.example.fragmentexample2.WebViewActivity.class);
                        startActivityForResult(i, SEARCH_ADDRESS_ACTIVITY);
                        return true;
                    }
                    return false;
                }
            });
        }
    }



    // 주소지 결과 창
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        super.onActivityResult(requestCode, resultCode, intent);
        switch (requestCode) {
            case SEARCH_ADDRESS_ACTIVITY:
                if (resultCode == RESULT_OK) {
                    String data = intent.getExtras().getString("data");
                    if (data != null) {
                        et_address.setText(data);
                    }
                }
                break;
        }
    }
    //--------------------------------

    public String getSampleSizeScore(String inputVal){
        int inputIntval = Integer.parseInt(inputVal);

        if(inputIntval <= 30){
            return "30";
        } else if(inputIntval <= 40){
            return "30";
        }  else if(inputIntval <= 50){
            return "33";
        } else if(inputIntval <= 60){
            return "37";
        } else if(inputIntval <= 70){
            return "41";
        } else if(inputIntval <= 80){
            return "44";
        } else if(inputIntval <= 90){
            return "47";
        } else if(inputIntval <= 100){
            return "59";
        } else if(inputIntval <= 110){
            return "52";
        } else if(inputIntval <= 120){
            return "54";
        } else if(inputIntval <= 130){
            return "55";
        } else if(inputIntval <= 140){
            return "57";
        } else if(inputIntval <= 150){
            return "59";
        } else if(inputIntval <= 160){
            return "60";
        } else if(inputIntval <= 170){
            return "62";
        } else if(inputIntval <= 180){
            return "63";
        } else if(inputIntval <= 190){
            return "64";
        }else if(inputIntval <= 200){
            return "65";
        }else if(inputIntval <= 210){
            return "66";
        }else if(inputIntval <= 220){
            return "67";
        }else if(inputIntval <= 230){
            return "68";
        }else if(inputIntval <= 240){
            return "69";
        }else if(inputIntval <= 250){
            return "70";
        }else if(inputIntval <= 260){
            return "70";
        }else if(inputIntval <= 270){
            return "71";
        }else if(inputIntval <= 280){
            return "72";
        }else if(inputIntval <= 290){
            return "72";
        }else {
            return "73";
        }





    }

}