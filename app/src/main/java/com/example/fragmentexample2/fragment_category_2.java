package com.example.fragmentexample2;

import android.os.Bundle;
import android.os.Handler;
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

public class fragment_category_2 extends Fragment {
    private View view;
    private String result;
    private Button btn_move;
    Integer freestall_Num, sit_Collision, freestall_Area_Out_Collision, sit_Action_Time, outward_Hygiene_Leg, outward_Hygiene_Back, outward_Hygiene_Breast, shade, summer_Ventilating, mist_Spary, wind_Block_Adult, winter_Ventilating, straw, warm, wind_Block_Child;


    private TextView q6;
    private TextView q7;
    private TextView q8;
    private TextView q9;
    private TextView q10;
    private TextView q11;
    private TextView q12;
    private TextView q13;
    private TextView q14;
    private TextView q15;
    private TextView q16;
    private TextView q17;
    private TextView q18;
    private TextView q19;
    private ScrollView scrollview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_2, container, false);

        scrollview = (ScrollView)view.findViewById(R.id.scrollview2);
        q6 = (TextView)view.findViewById(R.id.q6);
        q7 = (TextView)view.findViewById(R.id.q7);
        q8 = (TextView)view.findViewById(R.id.q8);
        q9 = (TextView)view.findViewById(R.id.q9);
        q10 = (TextView)view.findViewById(R.id.q10);
        q11 = (TextView)view.findViewById(R.id.q11);
        q12 = (TextView)view.findViewById(R.id.q12);
        q13 = (TextView)view.findViewById(R.id.q13);
        q14 = (TextView)view.findViewById(R.id.q14);
        q15 = (TextView)view.findViewById(R.id.q15);
        q16 = (TextView)view.findViewById(R.id.q16);
        q17 = (TextView)view.findViewById(R.id.q17);
        q18 = (TextView)view.findViewById(R.id.q18);
        q19 = (TextView)view.findViewById(R.id.q19);


        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        RadioGroup rdiog_5_freestall_num = (RadioGroup) view.findViewById(R.id.freestall_Num_rdogrp5); //5번 문항(프리스톨)

        rdiog_5_freestall_num.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q6,scrollview,0);
                if (checkedId == R.id.freestall_Num_a5_1) {
                    freestall_Num = 1;
                } else if (checkedId == R.id.freestall_Num_a5_2) {
                    freestall_Num = 2;
                } else if (checkedId == R.id.freestall_Num_a5_3) {
                    freestall_Num = 3;
                }
            }
        });

        RadioGroup rdiog_6_sit_collision = (RadioGroup) view.findViewById(R.id.sit_Collision_rdogrp6); //6번 문항(프리스톨)

        rdiog_6_sit_collision.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q7,scrollview,0);
                if (checkedId == R.id.sit_Collision_a6_1) {
                    sit_Collision = 1;
                } else if (checkedId == R.id.sit_Collision_a6_2) {
                    sit_Collision = 2;
                } else if (checkedId == R.id.sit_Collision_a6_3) {
                    sit_Collision = 3;
                }
            }
        });

        RadioGroup rdiog_7_freestall_area_out_collision = (RadioGroup) view.findViewById(R.id.freestall_Area_Out_Collision_rdogrp7); //7번 문항(프리스톨)

        rdiog_7_freestall_area_out_collision.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q8,scrollview,0);
                if (checkedId == R.id.freestall_Area_Out_Collision_a7_1) {
                    freestall_Area_Out_Collision = 1;
                } else if (checkedId == R.id.freestall_Area_Out_Collision_a7_2) {
                    freestall_Area_Out_Collision = 2;
                } else if (checkedId == R.id.freestall_Area_Out_Collision_a7_3) {
                    freestall_Area_Out_Collision = 3;
                }
            }
        });

        RadioGroup rdiog_8_sit_action_time = (RadioGroup) view.findViewById(R.id.sit_Action_Time_rdogrp8); //8번 문항

        rdiog_8_sit_action_time.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q9,scrollview,0);
                if (checkedId == R.id.sit_Action_Time_a8_1) {
                    sit_Action_Time = 1;
                } else if (checkedId == R.id.sit_Action_Time_a8_2) {
                    sit_Action_Time = 2;
                } else if (checkedId == R.id.sit_Action_Time_a8_3) {
                    sit_Action_Time = 3;
                }
            }
        });

        RadioGroup rdiog_9_outward_hygiene_leg = (RadioGroup) view.findViewById(R.id.outward_Hygiene_Leg_rdogrp9); //9번 문항

        rdiog_9_outward_hygiene_leg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q10,scrollview,0);
                if (checkedId == R.id.outward_Hygiene_Leg_a9_1) {
                    outward_Hygiene_Leg = 1;
                } else if (checkedId == R.id.outward_Hygiene_Leg_a9_2) {
                    outward_Hygiene_Leg = 2;
                } else if (checkedId == R.id.outward_Hygiene_Leg_a9_3) {
                    outward_Hygiene_Leg = 3;
                }
            }
        });

        RadioGroup rdiog_10_outward_hygiene_back = (RadioGroup) view.findViewById(R.id.outward_Hygiene_Back_rdogrp10); //10번 문항

        rdiog_10_outward_hygiene_back.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q11,scrollview,0);
                if (checkedId == R.id.outward_Hygiene_Back_a10_1) {
                    outward_Hygiene_Back = 1;
                } else if (checkedId == R.id.outward_Hygiene_Back_a10_2) {
                    outward_Hygiene_Back = 2;
                } else if (checkedId == R.id.outward_Hygiene_Back_a10_3) {
                    outward_Hygiene_Back = 3;
                }
            }
        });

        RadioGroup rdiog_11_outward_hygiene_breast = (RadioGroup) view.findViewById(R.id.outward_Hygiene_Breast_rdogrp11); //11번 문항

        rdiog_11_outward_hygiene_breast.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q12,scrollview,0);
                if (checkedId == R.id.outward_Hygiene_Breast_a11_1) {
                    outward_Hygiene_Breast = 1;
                } else if (checkedId == R.id.outward_Hygiene_Breast_a11_2) {
                    outward_Hygiene_Breast = 2;
                } else if (checkedId == R.id.outward_Hygiene_Breast_a11_3) {
                    outward_Hygiene_Breast = 3;
                }
            }
        });

        RadioGroup rdiog_12_shade = (RadioGroup) view.findViewById(R.id.shade_rdogrp12); //11번 문항

        rdiog_12_shade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q13,scrollview,0);
                if (checkedId == R.id.shade_a12_1) {
                    shade = 1;
                } else if (checkedId == R.id.shade_a12_2) {
                    shade = 2;
                }
            }
        });

        RadioGroup rdiog_13_summer_ventilating = (RadioGroup) view.findViewById(R.id.summer_Ventilating_rdogrp13); //11번 문항

        rdiog_13_summer_ventilating.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q14,scrollview,0);
                if (checkedId == R.id.summer_Ventilating_a13_1) {
                    summer_Ventilating = 1;
                } else if (checkedId == R.id.summer_Ventilating_a13_2) {
                    summer_Ventilating = 2;
                }
            }
        });

        RadioGroup rdiog_14_mist_spary = (RadioGroup) view.findViewById(R.id.mist_Spary_rdogrp14); //11번 문항

        rdiog_14_mist_spary.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q15,scrollview,0);
                if (checkedId == R.id.mist_Spary_a14_1) {
                    mist_Spary = 1;
                } else if (checkedId == R.id.mist_Spary_a14_2) {
                    mist_Spary = 2;
                }
            }
        });

        RadioGroup rdiog_15_wind_block_adult = (RadioGroup) view.findViewById(R.id.wind_Block_rdogrp15); //11번 문항

        rdiog_15_wind_block_adult.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q16,scrollview,0);
                if (checkedId == R.id.wind_Block_a15_1) {
                    wind_Block_Adult = 1;
                } else if (checkedId == R.id.wind_Block_a15_2) {
                    wind_Block_Adult = 2;
                }
            }
        });

        RadioGroup rdiog_16_winter_ventilating = (RadioGroup) view.findViewById(R.id.winter_Ventilating_rdogrp16); //11번 문항

        rdiog_16_winter_ventilating.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q17,scrollview,0);
                if (checkedId == R.id.winter_Ventilating_a16_1) {
                    winter_Ventilating = 1;
                } else if (checkedId == R.id.winter_Ventilating_a16_2) {
                    winter_Ventilating = 2;
                }
            }
        });

        RadioGroup rdiog_17_straw = (RadioGroup) view.findViewById(R.id.straw_rdogrp17); //11번 문항

        rdiog_17_straw.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q18,scrollview,0);
                if (checkedId == R.id.straw_a17_1) {
                    straw = 1;
                } else if (checkedId == R.id.straw_a17_2) {
                    straw = 2;
                }
            }
        });

        RadioGroup rdiog_18_warm = (RadioGroup) view.findViewById(R.id.warm_rdogrp18); //11번 문항

        rdiog_18_warm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                scrollToView(q19,scrollview,0);
                if (checkedId == R.id.warm_a18_1) {
                    warm = 1;
                } else if (checkedId == R.id.warm_a18_2) {
                    warm = 2;
                }
            }
        });

        RadioGroup rdiog_19_wind_block_child = (RadioGroup) view.findViewById(R.id.wind_Block_rdogrp19); //11번 문항

        rdiog_19_wind_block_child.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.wind_Block_a19_1) {
                    wind_Block_Child = 1;
                } else if (checkedId == R.id.wind_Block_a19_2) {
                    wind_Block_Child = 2;
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
                String freestall_num = Integer.toString(freestall_Num);
                String sit_collision = Integer.toString(sit_Collision);
                String freestall_area_out_collision = Integer.toString(freestall_Area_Out_Collision);
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

                String[] protocol2 = {freestall_num, sit_collision, freestall_area_out_collision, sit_action_time, outward_hygiene_leg, outward_hygiene_back, outward_hygiene_breast, shade_1,
                        summer_ventilating, mist_spary, wind_block_adult, winter_ventilating, straw_1, warm_1, wind_block_child};

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                bundle.putString("submit", freestall_num); //id, content 마지막 페이지로 데이터 전달
                bundle.putString("submit", sit_collision);
                bundle.putString("submit", freestall_area_out_collision);
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
                fragment_category_3 fragment_category_3 = new fragment_category_3();
                fragment_category_3.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_3); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
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
