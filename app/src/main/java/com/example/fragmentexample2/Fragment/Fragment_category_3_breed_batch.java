package com.example.fragmentexample2.Fragment;

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

import com.example.fragmentexample2.R;
import com.example.fragmentexample2.category1;

public class Fragment_category_3_breed_batch extends Fragment implements category1.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;
    private EditText ed_17_Limp, ed_18_slight_Hairloss, ed_19_critical_Hairloss,
            ed_20_cough, ed_21_runny_Nose, ed_22_ophthalmic_Secretion, ed_23_respiratory_Failure, ed_24_diarrhea,
            ed_25_ruminant, ed_26_fall_Dead;
    Integer horn = 0, horn_Anesthesia = 0, horn_Painkiller = 0, castration = 0, castration_Anesthesia = 0,
            castration_Painkiller = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_3_breed_batch, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.


        ed_17_Limp = (EditText) view.findViewById(R.id.breed_batch_Limp_a17);
        ed_18_slight_Hairloss = (EditText) view.findViewById(R.id.breed_batch_slight_Hairloss_a18);
        ed_19_critical_Hairloss = (EditText) view.findViewById(R.id.breed_batch_critical_Hairloss_a19);
        ed_20_cough = (EditText) view.findViewById(R.id.breed_batch_cough_a20);
        ed_21_runny_Nose = (EditText) view.findViewById(R.id.breed_batch_runny_Nose_a21);
        ed_22_ophthalmic_Secretion = (EditText) view.findViewById(R.id.breed_batch_ophthalmic_Secretion_a22);
        ed_23_respiratory_Failure = (EditText) view.findViewById(R.id.breed_batch_respiratory_Failure_a23);
        ed_24_diarrhea = (EditText) view.findViewById(R.id.breed_batch_diarrhea_a24);
        ed_25_ruminant = (EditText) view.findViewById(R.id.breed_batch_ruminant_a25);
        ed_26_fall_Dead = (EditText) view.findViewById(R.id.breed_batch_fall_Dead_a26);

        RadioGroup rdiog_27_horn = (RadioGroup) view.findViewById(R.id.breed_batch_horn_rdogrp27);
        RadioGroup rdiog_28_horn_anesthesia = (RadioGroup) view.findViewById(R.id.breed_batch_horn_Anesthesia_rdogrp28);
        RadioGroup rdiog_29_horn_painkiller = (RadioGroup) view.findViewById(R.id.breed_batch_horn_Painkiller_rdogrp29);
        RadioGroup rdiog_30_castration = (RadioGroup) view.findViewById(R.id.breed_batch_castration_rdogrp30);
        RadioGroup rdiog_31_castration_anesthesia = (RadioGroup) view.findViewById(R.id.breed_batch_castration_Anesthesia_rdogrp31);
        RadioGroup rdiog_32_castration_painkiller = (RadioGroup) view.findViewById(R.id.breed_batch_castration_Painkiller_rdogrp32);

        rdiog_27_horn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_horn_a27_1) {
                    horn = 1;
                } else if (checkedId == R.id.breed_batch_horn_a27_2) {
                    horn = 2;
                } else if (checkedId == R.id.breed_batch_horn_a27_3) {
                    horn = 3;
                } else if (checkedId == R.id.breed_batch_horn_a27_4) {
                    horn = 4;
                }
            }
        });

        rdiog_28_horn_anesthesia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_horn_Anesthesia_a28_1) {
                    horn_Anesthesia = 1;
                } else if (checkedId == R.id.breed_batch_horn_Anesthesia_a28_2) {
                    horn_Anesthesia = 2;
                }
            }
        });

        rdiog_29_horn_painkiller.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_horn_Painkiller_a29_1) {
                    horn_Painkiller = 1;
                } else if (checkedId == R.id.breed_batch_horn_Painkiller_a29_2) {
                    horn_Painkiller = 2;
                }
            }
        });

        rdiog_30_castration.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_castration_a30_1) {
                    castration = 1;
                } else if (checkedId == R.id.breed_batch_castration_a30_2) {
                    castration = 2;
                } else if (checkedId == R.id.breed_batch_castration_a30_3) {
                    castration = 3;
                } else if (checkedId == R.id.breed_batch_castration_a30_4) {
                    castration = 4;
                }
            }
        });

        rdiog_31_castration_anesthesia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_castration_Anesthesia_a31_1) {
                    castration_Anesthesia = 1;
                } else if (checkedId == R.id.breed_batch_castration_Anesthesia_a31_2) {
                    castration_Anesthesia = 2;
                }
            }
        });

        rdiog_32_castration_painkiller.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.breed_batch_castration_Painkiller_a32_1) {
                    castration_Painkiller = 1;
                } else if (checkedId == R.id.breed_batch_castration_Painkiller_a32_2) {
                    castration_Painkiller = 2;
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

                String limp = ed_17_Limp.getText().toString();
                String slight_hairloss = ed_18_slight_Hairloss.getText().toString();
                String critical_hairloss = ed_19_critical_Hairloss.getText().toString();
                String cought = ed_20_cough.getText().toString();
                String runny_nose = ed_21_runny_Nose.getText().toString();
                String ophthalmic_secretion = ed_22_ophthalmic_Secretion.getText().toString();
                String respiratory_failure = ed_23_respiratory_Failure.getText().toString();
                String diarrhea = ed_24_diarrhea.getText().toString();
                String ruminant = ed_25_ruminant.getText().toString();
                String fall_dead = ed_26_fall_Dead.getText().toString();

                String horn_1 = Integer.toString(horn);
                String horn_anesthesia = Integer.toString(horn_Anesthesia);
                String horn_painkiller = Integer.toString(horn_Painkiller);
                String castration_1 = Integer.toString(castration);
                String castration_anesthesia = Integer.toString(castration_Anesthesia);
                String castration_painkiller = Integer.toString(castration_Painkiller);

                String[] protocol3 = { limp, slight_hairloss, critical_hairloss, cought, runny_nose,
                        ophthalmic_secretion, respiratory_failure, diarrhea, ruminant, fall_dead };

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                 //id, content 마지막 페이지로 데이터 전달
                bundle.putString("submit", limp);
                bundle.putString("submit", slight_hairloss);
                bundle.putString("submit", critical_hairloss);
                bundle.putString("submit", cought);
                bundle.putString("submit", runny_nose);
                bundle.putString("submit", ophthalmic_secretion);
                bundle.putString("submit", respiratory_failure);
                bundle.putString("submit", diarrhea);
                bundle.putString("submit", ruminant);
                bundle.putString("submit", fall_dead);
                bundle.putString("submit", horn_1);
                bundle.putString("submit", horn_anesthesia);
                bundle.putString("submit", horn_painkiller);
                bundle.putString("submit", castration_1);
                bundle.putString("submit", castration_anesthesia);
                bundle.putString("submit", castration_painkiller);
                bundle.putStringArray("submit", protocol3);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Fragment_category_4_breed_batch fragment_category_4_breed_batch = new Fragment_category_4_breed_batch();
                fragment_category_4_breed_batch.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_4_breed_batch); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
    @Override
    public void onBackKey() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.framelayout, new Fragment_category_2_breed_batch())
                .addToBackStack(null)
                .commit();
    }
}
