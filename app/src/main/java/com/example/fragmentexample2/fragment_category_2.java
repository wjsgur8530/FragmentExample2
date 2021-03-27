package com.example.fragmentexample2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class fragment_category_2 extends Fragment {
    private View view;
    private String result;
    private Button btn_move;
    Integer freestall_Num, sit_Collision, freestall_Area_Out_Collision, sit_Action_Time, outward_HygieneLeg, outward_Hygiene_Back, outward_Hygiene_Breast;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_2, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        RadioGroup rdiog_5_freestall_num = (RadioGroup) view.findViewById(R.id.freestall_Num_rdogrp5); //2번 문항

        rdiog_5_freestall_num.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.freestall_Num_a5_1) {
                    freestall_Num = 1;
                } else if (checkedId == R.id.freestall_Num_a5_2) {
                    freestall_Num = 2;
                } else if (checkedId == R.id.freestall_Num_a5_3) {
                    freestall_Num = 3;
                }
            }
        });

        RadioGroup rdiog_6_sit_collision = (RadioGroup) view.findViewById(R.id.sit_Collision_rdogrp6); //2번 문항

        rdiog_5_freestall_num.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.freestall_Num_a5_1) {
                    freestall_Num = 1;
                } else if (checkedId == R.id.freestall_Num_a5_2) {
                    freestall_Num = 2;
                } else if (checkedId == R.id.freestall_Num_a5_3) {
                    freestall_Num = 3;
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
                fragment_category_2 fragment_category_2 = new fragment_category_2();
                fragment_category_2.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_2); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
}
