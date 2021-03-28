package com.example.fragmentexample2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class fragment_category_1_milk extends Fragment {
    private View view;
    private String result;
    private Button btn_move;
    private EditText ed_1_poorRate;
    Integer water_Tank_Num, water_Tank_Clean, water_Tank_Time;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_1_milk, container, false);
        ScrollView scrollview_milk_1 = view.findViewById(R.id.scrollview_milk_1);
        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        ed_1_poorRate = (EditText) view.findViewById(R.id.milk_poorRate_a1); //1번 문항
        RadioGroup rdiog_2_water_tank_num = (RadioGroup) view.findViewById(R.id.milk_water_Tank_Num_rdogrp2); //2번 문항
        RadioGroup rdiog_3_water_tank_clean = (RadioGroup) view.findViewById(R.id.milk_water_Tank_Clean_rdogrp3); //3번 문항
        RadioGroup rdiog_4_water_tank_time = (RadioGroup) view.findViewById(R.id.milk_water_Tank_Time_rdogrp4); //4번 문항
        TextView milk_water_Tank_Clean_q3 = (TextView) view.findViewById(R.id.milk_water_Tank_Clean_q3);
        TextView milk_water_Tank_Time_q4 = (TextView) view.findViewById(R.id.milk_water_Tank_Time_q4);

        rdiog_2_water_tank_num.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ((MainActivity)MainActivity.mContext).scrollToView(milk_water_Tank_Clean_q3,scrollview_milk_1,0);
                if (checkedId == R.id.milk_water_Tank_Num_a2_1) {
                    water_Tank_Num = 1;
                } else if (checkedId == R.id.milk_water_Tank_Num_a2_2) {
                    water_Tank_Num = 2;
                }
            }
        });



        rdiog_3_water_tank_clean.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ((MainActivity)MainActivity.mContext).scrollToView(milk_water_Tank_Time_q4,scrollview_milk_1,0);
                if (checkedId == R.id.milk_water_Tank_Clean_a3_1) {
                    water_Tank_Clean = 1;
                } else if (checkedId == R.id.milk_water_Tank_Clean_a3_2) {
                    water_Tank_Clean = 2;
                } else if (checkedId == R.id.milk_water_Tank_Clean_a3_3) {
                    water_Tank_Clean = 3;
                }
            }
        });



        rdiog_4_water_tank_time.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_water_Tank_Time_a4_1) {
                    water_Tank_Time = 1;
                } else if (checkedId == R.id.milk_water_Tank_Time_a4_2) {
                    water_Tank_Time = 2;
                } else if (checkedId == R.id.milk_water_Tank_Time_a4_3) {
                    water_Tank_Time = 3;
                }
            }
        });

        Button btn_move = ((Button)getActivity().findViewById(R.id.btn_move1));


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
                fragment_category_2_milk fragment_category_2_milk = new fragment_category_2_milk();
                fragment_category_2_milk.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_2_milk); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
}
