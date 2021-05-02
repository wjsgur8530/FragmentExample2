package com.example.fragmentexample2.Fragment;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmentexample2.Input_userinfo;
import com.example.fragmentexample2.MainActivity;
import com.example.fragmentexample2.Qustion_dong.Breed_q4;
import com.example.fragmentexample2.R;
import com.example.fragmentexample2.category1;
import com.example.fragmentexample2.getStrawScore;

public class Fragment_category_1_breed_batch extends Fragment implements category1.onKeyBackPressedListener{
    private View view;
    private String result;
    private Button btn_move;
    private EditText ed_1_poorRate;

    Integer water_Tank_Num = 0, water_Tank_Clean = 0, water_Tank_Time = 0;

    public String total_cow_count = ((Input_userinfo) Input_userinfo.context_userinfo).total_cow_count;
    public MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_1_breed_batch, container, false);
        ScrollView scrollview_freestall_1 = view.findViewById(R.id.scrollview_freestall_1); //fatten으로
        Spinner Spinner_breed_q4 = view.findViewById(R.id.spinner_breed_q4);
        RadioGroup rdiog_2_water_tank_num = (RadioGroup) view.findViewById(R.id.breed_batch_water_Tank_Num_rdogrp2);//2번 문항
        RadioGroup rdiog_3_water_tank_clean = (RadioGroup) view.findViewById(R.id.breed_batch_water_Tank_Clean_rdogrp3); //3번 문항
        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        ed_1_poorRate = (EditText) view.findViewById(R.id.breed_batch_poor_Rate_a1); //1번 문항
        TextView breed_poor_Rate_ratio = (TextView) view.findViewById(R.id.breed_poor_Rate_ratio);
        TextView breed_poor_Rate_score = (TextView) view.findViewById(R.id.breed_poor_Rate_score);
        TextView freestall_water_Tank_Num_q2 = (TextView) view.findViewById(R.id.freestall_water_Tank_Num_q2);
        TextView freestall_water_Tank_Clean_q3 = (TextView) view.findViewById(R.id.freestall_water_Tank_Clean_q3);
        TextView freestall_water_Tank_Time_q4 = (TextView) view.findViewById(R.id.freestall_water_Tank_Time_q4);

        ArrayAdapter spinnerAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.dong_size,
                android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner mSpinner = view.findViewById(R.id.spinner_breed_q4);
        mSpinner.setAdapter( spinnerAdapter );
        final int[] selectedItemIndex = new int[1];
        Spinner_breed_q4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 선택된 데이터 값
                String selectedItem = parent.getSelectedItem().toString();

                // 선택된 데이터 위치( 0 부터 )
                selectedItemIndex[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        Button breed_btn_q4 = view.findViewById(R.id.breed_btn_q4);


        breed_btn_q4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String dong_count = Integer.toString(selectedItemIndex[0]);
                if(Integer.parseInt(dong_count) == 0){
                    String msg = "축사 동 수를 선택해주세요";
                    Toast.makeText(getActivity().getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                }else{
                    int dong_size = Integer.parseInt(dong_count);
                    Intent intent = new Intent(getActivity(), Breed_q4.class);
                    intent.putExtra("dong_count",dong_size); /*송신*/

                    startActivity(intent);
                }

            }
        });
        rdiog_2_water_tank_num.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ((MainActivity) MainActivity.mContext).scrollToView(freestall_water_Tank_Clean_q3, scrollview_freestall_1, 0);
                if (checkedId == R.id.breed_batch_water_Tank_Num_a2_1) {
                    water_Tank_Num = 1;
                } else if (checkedId == R.id.breed_batch_water_Tank_Num_a2_2) {
                    water_Tank_Num = 2;
                }
            }
        });

        rdiog_3_water_tank_clean.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ((MainActivity) MainActivity.mContext).scrollToView(freestall_water_Tank_Time_q4, scrollview_freestall_1, 0);
                if (checkedId == R.id.breed_batch_water_Tank_Clean_a3_1) {
                    water_Tank_Clean = 1;
                } else if (checkedId == R.id.breed_batch_water_Tank_Clean_a3_2) {
                    water_Tank_Clean = 2;
                } else if (checkedId == R.id.breed_batch_water_Tank_Clean_a3_3) {
                    water_Tank_Clean = 3;
                }
            }
        });



        Button btn_move = ((Button) getActivity().findViewById(R.id.btn_move1));
        Button btn_back = ((Button) getActivity().findViewById(R.id.btn_back));

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackKey();
            }
        });

        //데이터 받는 곳
//        if(getArguments() != null) { //null
//            result = getArguments().getString("fromFrag1"); //프래그먼트1로부터 setArguments된 데이터를 받아옴.
//            tv_frag1.setText(result);
//        }

        btn_move.setOnClickListener(new View.OnClickListener() { //fragment1로 이동
            @Override
            public void onClick(View v) {
                String poorRate = ed_1_poorRate.getText().toString();
                String water_tank_num = Integer.toString(water_Tank_Num);
                String water_tank_clean = Integer.toString(water_Tank_Clean);
                String water_tank_time = Integer.toString(water_Tank_Time);

                String[] protocol1 = {poorRate, water_tank_num, water_tank_clean, water_tank_time};

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                bundle.putString("submit", poorRate); //id, content 마지막 페이지로 데이터 전달
                bundle.putString("submit", water_tank_num);
                bundle.putString("submit", water_tank_clean);
                bundle.putString("submit", water_tank_time);
                bundle.putStringArray("submit", protocol1);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Fragment_category_2_breed_batch fragment_category_2_breed_batch = new Fragment_category_2_breed_batch();
                fragment_category_2_breed_batch.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_2_breed_batch); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });
        ed_1_poorRate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {
                if (TextUtils.isEmpty(ed_1_poorRate.getText().toString())) {
                    breed_poor_Rate_ratio.setText("값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if (Integer.parseInt(total_cow_count) < Integer.parseInt(ed_1_poorRate.getText().toString())) {
                    breed_poor_Rate_ratio.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
                    String total_cow = breedPoorRateRatio(total_cow_count, ed_1_poorRate.getText().toString());
                    breed_poor_Rate_ratio.setText(total_cow + "%");

                    breed_poor_Rate_score.setText(breedPoorRateScore(total_cow));
                }
            }});
        return view;
    }

    @Override
    public void onBackKey() {
        category1 activity = (category1) getActivity();

        //액티비티의 콜백을 직접호출
        activity.setOnKeyBackPressedListener(null);
        activity.onBackPressed();

    }
    public String breedPoorRateRatio(String total, String rate){
        Float totalFloat = Float.parseFloat(total);
        Float rateFloat = Float.parseFloat(rate);
        double result = (rateFloat / totalFloat) * 100;
        return String.format("%.2f",result);
    }

    public String breedPoorRateScore(String ratio){
        Float RatioFloat = Float.parseFloat(ratio);
        int poorScore = 0;
        if (RatioFloat == 0) {
            poorScore = 100;
        } else if (RatioFloat < 1) {
            poorScore = 90;
        } else if (RatioFloat < 2) {
            poorScore = 80;
        } else if (RatioFloat < 3) {
            poorScore = 70;
        } else if (RatioFloat < 4) {
            poorScore = 60;
        } else if (RatioFloat < 5) {
            poorScore = 50;
        } else if (RatioFloat < 6) {
            poorScore = 40;
        } else if (RatioFloat <= 7) {
            poorScore = 30;
        } else if (RatioFloat <= 9) {
            poorScore = 20;
        } else if (RatioFloat < 11) {
            poorScore = 10;
        } else  poorScore = 0;

        return Integer.toString(poorScore);
    }
}
