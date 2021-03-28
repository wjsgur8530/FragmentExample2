package com.example.fragmentexample2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class fragment_category_2_milk extends Fragment implements MainActivity.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;
    Integer sit_Action_Time = 0, outward_Hygiene_Leg = 0, outward_Hygiene_Back = 0, outward_Hygiene_Breast = 0, shade = 0, summer_Ventilating = 0, mist_Spary = 0,
            wind_Block_Adult = 0, winter_Ventilating = 0, straw = 0, warm = 0, wind_Block_Child = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_2_milk, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.

        RadioGroup rdiog_5_sit_action_time = (RadioGroup) view.findViewById(R.id.milk_sit_Action_Time_rdogrp5);

        rdiog_5_sit_action_time.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_sit_Action_Time_a5_1) {
                    sit_Action_Time = 1;
                } else if (checkedId == R.id.milk_sit_Action_Time_a5_2) {
                    sit_Action_Time = 2;
                } else if (checkedId == R.id.milk_sit_Action_Time_a5_3) {
                    sit_Action_Time = 3;
                }
            }
        });

        RadioGroup rdiog_6_outward_hygiene_leg = (RadioGroup) view.findViewById(R.id.milk_outward_Hygiene_Leg_rdogrp6); //9번 문항

        rdiog_6_outward_hygiene_leg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_outward_Hygiene_Leg_a6_1) {
                    outward_Hygiene_Leg = 1;
                } else if (checkedId == R.id.milk_outward_Hygiene_Leg_a6_2) {
                    outward_Hygiene_Leg = 2;
                } else if (checkedId == R.id.milk_outward_Hygiene_Leg_a6_3) {
                    outward_Hygiene_Leg = 3;
                }
            }
        });

        RadioGroup rdiog_7_outward_hygiene_back = (RadioGroup) view.findViewById(R.id.milk_outward_Hygiene_Back_rdogrp7); //10번 문항

        rdiog_7_outward_hygiene_back.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_outward_Hygiene_Back_a7_1) {
                    outward_Hygiene_Back = 1;
                } else if (checkedId == R.id.milk_outward_Hygiene_Back_a7_2) {
                    outward_Hygiene_Back = 2;
                } else if (checkedId == R.id.milk_outward_Hygiene_Back_a7_3) {
                    outward_Hygiene_Back = 3;
                }
            }
        });

        RadioGroup rdiog_8_outward_hygiene_breast = (RadioGroup) view.findViewById(R.id.milk_outward_Hygiene_Breast_rdogrp8); //11번 문항

        rdiog_8_outward_hygiene_breast.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_outward_Hygiene_Breast_a8_1) {
                    outward_Hygiene_Breast = 1;
                } else if (checkedId == R.id.milk_outward_Hygiene_Breast_a8_2) {
                    outward_Hygiene_Breast = 2;
                } else if (checkedId == R.id.milk_outward_Hygiene_Breast_a8_3) {
                    outward_Hygiene_Breast = 3;
                }
            }
        });

        RadioGroup rdiog_9_shade = (RadioGroup) view.findViewById(R.id.milk_shade_rdogrp9); //11번 문항

        rdiog_9_shade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_shade_a9_1) {
                    shade = 1;
                } else if (checkedId == R.id.milk_shade_a9_2) {
                    shade = 2;
                }
            }
        });

        RadioGroup rdiog_10_summer_ventilating = (RadioGroup) view.findViewById(R.id.milk_summer_Ventilating_rdogrp10); //11번 문항

        rdiog_10_summer_ventilating.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_summer_Ventilating_a10_1) {
                    summer_Ventilating = 1;
                } else if (checkedId == R.id.milk_summer_Ventilating_a10_2) {
                    summer_Ventilating = 2;
                }
            }
        });

        RadioGroup rdiog_11_mist_spary = (RadioGroup) view.findViewById(R.id.milk_mist_Spary_rdogrp11); //11번 문항

        rdiog_11_mist_spary.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_mist_Spary_a11_1) {
                    mist_Spary = 1;
                } else if (checkedId == R.id.milk_mist_Spary_a11_2) {
                    mist_Spary = 2;
                }
            }
        });

        RadioGroup rdiog_12_wind_block_adult = (RadioGroup) view.findViewById(R.id.milk_wind_Block_rdogrp12); //11번 문항

        rdiog_12_wind_block_adult.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_wind_Block_a12_1) {
                    wind_Block_Adult = 1;
                } else if (checkedId == R.id.milk_wind_Block_a12_2) {
                    wind_Block_Adult = 2;
                }
            }
        });

        RadioGroup rdiog_13_winter_ventilating = (RadioGroup) view.findViewById(R.id.milk_winter_Ventilating_rdogrp13); //11번 문항

        rdiog_13_winter_ventilating.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_winter_Ventilating_a13_1) {
                    winter_Ventilating = 1;
                } else if (checkedId == R.id.milk_winter_Ventilating_a13_2) {
                    winter_Ventilating = 2;
                }
            }
        });

        RadioGroup rdiog_14_straw = (RadioGroup) view.findViewById(R.id.milk_straw_rdogrp14); //11번 문항

        rdiog_14_straw.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_straw_a14_1) {
                    straw = 1;
                } else if (checkedId == R.id.milk_straw_a14_2) {
                    straw = 2;
                }
            }
        });

        RadioGroup rdiog_15_warm = (RadioGroup) view.findViewById(R.id.milk_warm_rdogrp15); //11번 문항

        rdiog_15_warm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_warm_a15_1) {
                    warm = 1;
                } else if (checkedId == R.id.milk_warm_a15_2) {
                    warm = 2;
                }
            }
        });

        RadioGroup rdiog_16_wind_block_child = (RadioGroup) view.findViewById(R.id.milk_wind_Block_rdogrp16); //11번 문항

        rdiog_16_wind_block_child.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_wind_Block_a16_1) {
                    wind_Block_Child = 1;
                } else if (checkedId == R.id.milk_wind_Block_a16_2) {
                    wind_Block_Child = 2;
                }
            }
        });

        Button btn_move = ((Button)getActivity().findViewById(R.id.btn_move1));
        Button btn_back = ((Button)getActivity().findViewById(R.id.btn_back));

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
                String sit_action_time = Integer.toString(sit_Action_Time);
                String outward_hygiene_leg = Integer.toString(outward_Hygiene_Leg);
                String outward_hygiene_back = Integer.toString(outward_Hygiene_Back);
                String outward_hygiene_breast = Integer.toString(outward_Hygiene_Breast);
                String shade_1 = Integer.toString(shade);
                String summer_ventilating = Integer.toString(summer_Ventilating);
                String mist_spary = Integer.toString(mist_Spary);
                String wind_block_adult = Integer.toString(wind_Block_Adult);
                String winter_ventilating = Integer.toString(winter_Ventilating);
                String straw_1 = Integer.toString(straw);
                String warm_1 = Integer.toString(warm);
                String wind_block_child = Integer.toString(wind_Block_Child);

                String[] protocol2 = {sit_action_time, outward_hygiene_leg, outward_hygiene_back, outward_hygiene_breast, shade_1,
                        summer_ventilating, mist_spary, wind_block_adult, winter_ventilating, straw_1, warm_1, wind_block_child};

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                bundle.putString("submit", sit_action_time);
                bundle.putString("submit", outward_hygiene_leg);
                bundle.putString("submit", outward_hygiene_back);
                bundle.putString("submit", outward_hygiene_breast);
                bundle.putString("submit", shade_1);
                bundle.putString("submit", summer_ventilating);
                bundle.putString("submit", mist_spary);
                bundle.putString("submit", wind_block_adult);
                bundle.putString("submit", winter_ventilating);
                bundle.putString("submit", straw_1);
                bundle.putString("submit", warm_1);
                bundle.putString("submit", wind_block_child);
                bundle.putStringArray("submit", protocol2);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragment_category_3_milk fragment_category_3_milk = new fragment_category_3_milk();
                fragment_category_3_milk.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_3_milk); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
    @Override
    public void onBackKey() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.framelayout, new fragment_category_1_milk())
                .addToBackStack(null)
                .commit();
    }
}
