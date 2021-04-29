package com.example.fragmentexample2.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmentexample2.R;
import com.example.fragmentexample2.category1;

public class Fragment_category_2_breed_batch extends Fragment implements category1.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;
    private EditText ed_8_outward_Hygiene;
    Integer straw_Feed_Tank = 0, straw_Normal = 0, straw_Resting_Place = 0, outward_Hygiene = 0, shade = 0, summer_Ventilating = 0, mist_Spary = 0,
    wind_Block_Adult = 0, winter_Ventilating = 0, straw = 0, warm = 0, wind_Block_Child = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_2_breed_batch, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        RadioGroup rdiog_5_straw_feed_tank = (RadioGroup) view.findViewById(R.id.breed_batch_straw_Feed_Tank_rdogrp5);
        RadioGroup rdiog_6_straw_normal = (RadioGroup) view.findViewById(R.id.breed_batch_straw_Normal_rdogrp6);
        RadioGroup rdiog_7_straw_resting_place = (RadioGroup) view.findViewById(R.id.breed_batch_straw_Resting_Place_rdogrp7); //7번 문항(프리스톨)
        ed_8_outward_Hygiene = (EditText) view.findViewById(R.id.breed_batch_outward_Hygiene_a8);
        RadioGroup rdiog_9_shade = (RadioGroup) view.findViewById(R.id.breed_batch_shade_rdogrp9); //9번 문항
        RadioGroup rdiog_10_summer_ventilating = (RadioGroup) view.findViewById(R.id.breed_batch_summer_Ventilating_rdogrp10); //10번 문항
        RadioGroup rdiog_11_mist_spary = (RadioGroup) view.findViewById(R.id.breed_batch_mist_Spary_rdogrp11); //11번 문항
        RadioGroup rdiog_12_wind_block = (RadioGroup) view.findViewById(R.id.breed_batch_wind_Block_rdogrp12); //11번 문항
        RadioGroup rdiog_13_winter_ventilating = (RadioGroup) view.findViewById(R.id.breed_batch_winter_Ventilating_rdogrp13);
        RadioGroup rdiog_14_straw = (RadioGroup) view.findViewById(R.id.breed_batch_straw_rdogrp14);
        RadioGroup rdiog_15_warm = (RadioGroup) view.findViewById(R.id.breed_batch_warm_rdogrp15);
        RadioGroup rdiog_16_wind_block = (RadioGroup) view.findViewById(R.id.breed_batch_wind_Block_rdogrp16);

        TextView breed_summer_rest_score = (TextView)view.findViewById(R.id.breed_summer_rest_score);
        TextView breed_winter_rest_score = (TextView)view.findViewById(R.id.breed_winter_rest_score);
        TextView breed_calf_winter_rest_score = (TextView)view.findViewById(R.id.breed_calf_winter_rest_score);

        rdiog_5_straw_feed_tank.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_straw_Feed_Tank_a5_1) {
                    straw_Feed_Tank = 1;
                } else if (checkedId == R.id.breed_batch_straw_Feed_Tank_a5_2) {
                    straw_Feed_Tank = 2;
                } else if (checkedId == R.id.breed_batch_straw_Feed_Tank_a5_3) {
                    straw_Feed_Tank = 3;
                }
            }
        });


        rdiog_6_straw_normal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_straw_Normal_a6_1) {
                    straw_Normal = 1;
                } else if (checkedId == R.id.breed_batch_straw_Normal_a6_2) {
                    straw_Normal = 2;
                } else if (checkedId == R.id.breed_batch_straw_Normal_a6_3) {
                    straw_Normal = 3;
                } else if (checkedId == R.id.breed_batch_straw_Normal_a6_4) {
                    straw_Normal = 4;
                }
            }
        });

        rdiog_7_straw_resting_place.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_straw_Resting_Place_a7_1) {
                    straw_Resting_Place = 1;
                } else if (checkedId == R.id.breed_batch_straw_Resting_Place_a7_2) {
                    straw_Resting_Place = 2;
                } else if (checkedId == R.id.breed_batch_straw_Resting_Place_a7_3) {
                    straw_Resting_Place = 3;
                } else if (checkedId == R.id.breed_batch_straw_Resting_Place_a7_4) {
                    straw_Resting_Place = 4;
                }
            }
        });

        rdiog_9_shade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_shade_a9_1) {
                    shade = 1;
                } else if (checkedId == R.id.breed_batch_shade_a9_2) {
                    shade = 2;
                }
                breed_summer_rest_score.setText(Integer.toString(getSummerRestScore(shade,summer_Ventilating,mist_Spary)));
            }
        });

        rdiog_10_summer_ventilating.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_summer_Ventilating_a10_1) {
                    summer_Ventilating = 1;
                } else if (checkedId == R.id.breed_batch_summer_Ventilating_a10_2) {
                    summer_Ventilating = 2;
                }
                breed_summer_rest_score.setText(Integer.toString(getSummerRestScore(shade,summer_Ventilating,mist_Spary)));
            }
        });

        rdiog_11_mist_spary.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_mist_Spary_a11_1) {
                    mist_Spary = 1;
                } else if (checkedId == R.id.breed_batch_mist_Spary_a11_2) {
                    mist_Spary = 2;
                }
                breed_summer_rest_score.setText(Integer.toString(getSummerRestScore(shade,summer_Ventilating,mist_Spary)));
            }
        });

        rdiog_12_wind_block.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_wind_Block_a12_1) {
                    wind_Block_Adult = 1;
                } else if (checkedId == R.id.breed_batch_wind_Block_a12_2) {
                    wind_Block_Adult = 2;
                }
                breed_winter_rest_score.setText(Integer.toString(getWinterRestScore(wind_Block_Adult,winter_Ventilating)));
            }
        });

        rdiog_13_winter_ventilating.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_winter_Ventilating_a13_1) {
                    winter_Ventilating = 1;
                } else if (checkedId == R.id.breed_batch_winter_Ventilating_a13_2) {
                    winter_Ventilating = 2;
                }
                breed_winter_rest_score.setText(Integer.toString(getWinterRestScore(wind_Block_Adult,winter_Ventilating)));
            }
        });

        rdiog_14_straw.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_straw_a14_1) {
                    straw = 1;
                } else if (checkedId == R.id.breed_batch_straw_a14_2) {
                    straw = 2;
                }
                breed_calf_winter_rest_score.setText(Integer.toString(getWinterCalfRestScore(
                        straw,warm,wind_Block_Child)));
            }

        });

        rdiog_15_warm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_warm_a15_1) {
                    warm = 1;
                } else if (checkedId == R.id.breed_batch_warm_a15_2) {
                    warm = 2;
                }

                breed_calf_winter_rest_score.setText(Integer.toString(getWinterCalfRestScore(
                        straw,warm,wind_Block_Child)));
            }
        });

        rdiog_16_wind_block.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_wind_Block_a16_1) {
                    wind_Block_Child = 1;
                } else if (checkedId == R.id.breed_batch_wind_Block_a16_2) {
                    wind_Block_Child = 2;
                }
                breed_calf_winter_rest_score.setText(Integer.toString(getWinterCalfRestScore(
                        straw,warm,wind_Block_Child)));
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
//            result = getArguments().getString("submit"); //프래그먼트1로부터 setArguments된 데이터를 받아옴.
//            submit_test2.setText(result);
//        }

        btn_move.setOnClickListener(new View.OnClickListener() { //fragment1로 이동
            @Override
            public void onClick(View v) {
                String straw_feed_tank = Integer.toString(straw_Feed_Tank);
                String straw_normal = Integer.toString(straw_Normal);
                String straw_resting_place = Integer.toString(straw_Resting_Place);
                String outward_hygiene = ed_8_outward_Hygiene.getText().toString();
                String shade_1 = Integer.toString(shade);
                String summer_ventilating = Integer.toString(summer_Ventilating);
                String mist_spary = Integer.toString(mist_Spary);
                String wind_block_adult = Integer.toString(wind_Block_Adult);
                String winter_ventilating = Integer.toString(winter_Ventilating);
                String straw_1 = Integer.toString(straw);
                String warm_1 = Integer.toString(warm);
                String wind_block_child = Integer.toString(wind_Block_Child);

                String[] protocol2 = { straw_feed_tank, straw_normal, straw_resting_place, outward_hygiene, shade_1, summer_ventilating,
                        mist_spary, wind_block_adult, winter_ventilating, straw_1, warm_1, wind_block_child };

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                bundle.putString("submit", straw_feed_tank); //id, content 마지막 페이지로 데이터 전달
                bundle.putString("submit", straw_normal);
                bundle.putString("submit", straw_resting_place);
                bundle.putString("submit", outward_hygiene);
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
                Fragment_category_3_breed_batch fragment_category_3_breed_batch = new Fragment_category_3_breed_batch();
                fragment_category_3_breed_batch.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_3_breed_batch); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
    @Override
    public void onBackKey() {
            getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.framelayout, new Fragment_category_1_breed_batch())
                        .addToBackStack(null)
                        .commit();
    }
    // 혹서기 - 그늘, 환기팬, 안개분무 시설 점수 계산
    public int getSummerRestScore(int shade,int summerVentilating, int mistSpary)
    {
        int summerRestScore = 0;
        // 충분한 그늘 항목 "예"인 경우
        if (shade == 1) {
            // 충분한 풍속 항목 "예"인 경우
            if (summerVentilating  == 1) {
                //안개분무 풍속 "예"인 경우
                if (mistSpary == 1) {
                    summerRestScore = 100;
                } else {
                    summerRestScore = 80;
                }
            } else {
                if (mistSpary == 1) {
                    summerRestScore = 60;
                } else {
                    summerRestScore = 45;
                }
            }
        } else {
            if (summerVentilating == 1) {
                if (mistSpary == 1) {
                    summerRestScore = 55;
                } else {
                    summerRestScore = 40;
                }
            } else {
                if (mistSpary == 1) {
                    summerRestScore = 20;
                } else {
                    summerRestScore = 0;
                }
            }
        }
        return summerRestScore;
    }
    public int getWinterRestScore(int windBlock, int winterVentilating)
    {
        int windRestScore = 0;
        // 바람차단시설 항목 "예"인 경우
        if (windBlock == 1) {
            // 최소 풍속시설 항목 "예"인 경우
            if (winterVentilating == 1) {
                windRestScore = 100;
            } else {
                windRestScore = 70;
            }
            // 바람차단시설 항목 "아니오 "인 경우
        } else {
            if (winterVentilating == 1) {
                windRestScore = 40;
            } else {
                windRestScore = 20;
            }
        }
        return windRestScore;
    }
    public int getWinterCalfRestScore(int straw, int warm, int windBlock)
    {
        int winterCalfRestScore = 0;
        // 충분한 깔짚 항목 "예"
        if (straw == 1) {
            // 충분한 보온 항목 "예"
            if (warm == 1) {
                // 바람 차단 시설 "예"
                if (windBlock == 1) {
                    winterCalfRestScore = 100;
                } else {
                    winterCalfRestScore = 80;
                }
            }
            // 충분한 보온 항목 "아니오"
            else {
                if (windBlock == 1) {
                    winterCalfRestScore = 60;
                } else {
                    winterCalfRestScore = 45;
                }
            }
        }
        // 충분한 깔짚 항목 "아니오"
        else {
            if (warm == 1) {
                if (windBlock == 1) {
                    winterCalfRestScore = 55;
                } else {
                    winterCalfRestScore = 40;
                }
            } else {
                if (windBlock == 1) {
                    winterCalfRestScore = 20;
                } else {
                    winterCalfRestScore = 0;
                }
            }
        }
        return winterCalfRestScore;
    }
}

