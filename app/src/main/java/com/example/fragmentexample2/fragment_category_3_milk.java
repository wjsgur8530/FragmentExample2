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

public class fragment_category_3_milk extends Fragment {
    private View view;
    private String result;
    private Button btn_move;
    Integer horn, horn_Anesthesia, horn_Painkiller;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_3_milk, container, false);
        ScrollView scrollview_milk_3 = view.findViewById(R.id.scrollview_milk_3);
        TextView milk_slight_Limp_q17 = (TextView) view.findViewById(R.id.milk_slight_Limp_q17);
        TextView milk_slight_Hairloss_q19 = (TextView) view.findViewById(R.id.milk_slight_Hairloss_q19);
        TextView milk_critical_Hairloss_q20 = (TextView) view.findViewById(R.id.milk_critical_Hairloss_q20);
        TextView milk_cough_q21 = (TextView) view.findViewById(R.id.milk_cough_q21);
        TextView milk_runny_Nose_q22 = (TextView) view.findViewById(R.id.milk_runny_Nose_q22);
        TextView milk_ophthalmic_Secretion_q23 = (TextView) view.findViewById(R.id.milk_ophthalmic_Secretion_q23);
        TextView milk_respiratory_Failure_q24 = (TextView) view.findViewById(R.id.milk_respiratory_Failure_q24);
        TextView milk_diarrhea_q25 = (TextView) view.findViewById(R.id.milk_diarrhea_q25);
        TextView milk_out_Genitals_Secretion_q26 = (TextView) view.findViewById(R.id.milk_out_Genitals_Secretion_q26);
        TextView milk_breast_Inflammation_q27 = (TextView) view.findViewById(R.id.milk_breast_Inflammation_q27);
        TextView milk_fall_Dead_q28 = (TextView) view.findViewById(R.id.milk_fall_Dead_q28);
        TextView milk_dystocia_q29 = (TextView) view.findViewById(R.id.milk_dystocia_q29);
        TextView milk_astasia_q30 = (TextView) view.findViewById(R.id.milk_astasia_q30);
        TextView milk_horn_q31 = (TextView) view.findViewById(R.id.milk_horn_q31);
        TextView milk_horn_Anesthesia_q32 = (TextView) view.findViewById(R.id.milk_horn_Anesthesia_q32);
        TextView milk_horn_Painkiller_q33 = (TextView) view.findViewById(R.id.milk_horn_Painkiller_q33);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        final EditText ed_17_slight_Limp = view.findViewById(R.id.milk_slight_Limp_a17);
        final EditText ed_18_critical_Limp = view.findViewById(R.id.milk_critical_Limp_a18);
        final EditText ed_19_slight_Hairloss = view.findViewById(R.id.milk_slight_Hairloss_a19);
        final EditText ed_20_critical_Hairloss = view.findViewById(R.id.milk_critical_Hairloss_a20);
        final EditText ed_21_cought = view.findViewById(R.id.milk_cough_a21);
        final EditText ed_22_runny_Nose = view.findViewById(R.id.milk_runny_Nose_a22);
        final EditText ed_23_ophthalmic_Secretion = view.findViewById(R.id.milk_ophthalmic_Secretion_a23);
        final EditText ed_24_respiratory_Failure = view.findViewById(R.id.milk_respiratory_Failure_a24);
        final EditText ed_25_diarrhea = view.findViewById(R.id.milk_diarrhea_a25);
        final EditText ed_26_out_Genitals_Secretion = view.findViewById(R.id.milk_out_Genitals_Secretion_a26);
        final EditText ed_27_breast_Inflammation = view.findViewById(R.id.milk_breast_Inflammation_a27);
        final EditText ed_28_fall_Dead = view.findViewById(R.id.milk_fall_Dead_a28);
        final EditText ed_29_dystocia = view.findViewById(R.id.milk_dystocia_a29);
        final EditText ed_30_astasia = view.findViewById(R.id.milk_astasia_a30);


        RadioGroup rdiog_31_horn = (RadioGroup) view.findViewById(R.id.milk_horn_rdogrp31); //11번 문항

        rdiog_31_horn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ((MainActivity)MainActivity.mContext).scrollToView(milk_horn_Anesthesia_q32,scrollview_milk_3,0);
                if (checkedId == R.id.milk_horn_a31_1) {
                    horn = 1;
                } else if (checkedId == R.id.milk_horn_a31_2) {
                    horn = 2;
                } else if (checkedId == R.id.milk_horn_a31_3) {
                    horn = 3;
                } else if (checkedId == R.id.milk_horn_a31_4) {
                    horn = 4;
                }
            }
        });

        RadioGroup rdiog_32_horn_anesthesia = (RadioGroup) view.findViewById(R.id.milk_horn_Anesthesia_rdogrp32); //11번 문항

        rdiog_32_horn_anesthesia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ((MainActivity)MainActivity.mContext).scrollToView(milk_horn_Painkiller_q33,scrollview_milk_3,0);
                if (checkedId == R.id.milk_horn_Anesthesia_a32_1) {
                    horn_Anesthesia = 1;
                } else if (checkedId == R.id.milk_horn_Anesthesia_a32_2) {
                    horn_Anesthesia = 2;
                }
            }
        });

        RadioGroup rdiog_33_horn_painkiller = (RadioGroup) view.findViewById(R.id.milk_horn_Painkiller_rdogrp33); //11번 문항

        rdiog_33_horn_painkiller.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.milk_horn_Painkiller_a33_1) {
                    horn_Painkiller = 1;
                } else if (checkedId == R.id.milk_horn_Painkiller_a33_2) {
                    horn_Painkiller = 2;
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
                String slight_limp = ed_17_slight_Limp.getText().toString();
                String critical_limp = ed_18_critical_Limp.getText().toString();
                String slight_hairloss = ed_19_slight_Hairloss.getText().toString();
                String critical_hairloss = ed_20_critical_Hairloss.getText().toString();
                String cought = ed_21_cought.getText().toString();
                String runny_nose = ed_22_runny_Nose.getText().toString();
                String ophthalmic_secretion = ed_23_ophthalmic_Secretion.getText().toString();
                String respiratory_failure = ed_24_respiratory_Failure.getText().toString();
                String diarrhea = ed_25_diarrhea.getText().toString();
                String out_genitals_secretion = ed_26_out_Genitals_Secretion.getText().toString();
                String breast_inflammation = ed_27_breast_Inflammation.getText().toString();
                String fall_dead = ed_28_fall_Dead.getText().toString();
                String dystocia = ed_29_dystocia.getText().toString();
                String astasia = ed_30_astasia.getText().toString();
                String horn_1 = Integer.toString(horn);
                String horn_anesthesia = Integer.toString(horn_Anesthesia);
                String horn_painkiller = Integer.toString(horn_Painkiller);

                String[] protocol3 = {slight_limp, critical_limp, slight_hairloss, critical_hairloss, cought, runny_nose, ophthalmic_secretion, respiratory_failure,
                        diarrhea, out_genitals_secretion, breast_inflammation, fall_dead, dystocia, astasia, horn_1, horn_anesthesia, horn_painkiller};

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                bundle.putString("submit", slight_limp); //id, content 마지막 페이지로 데이터 전달
                bundle.putString("submit", critical_limp);
                bundle.putString("submit", slight_hairloss);
                bundle.putString("submit", critical_hairloss);
                bundle.putString("submit", cought);
                bundle.putString("submit", runny_nose);
                bundle.putString("submit", ophthalmic_secretion);
                bundle.putString("submit", respiratory_failure);
                bundle.putString("submit", diarrhea);
                bundle.putString("submit", out_genitals_secretion);
                bundle.putString("submit", breast_inflammation);
                bundle.putString("submit", fall_dead);
                bundle.putString("submit", dystocia);
                bundle.putString("submit", astasia);
                bundle.putString("submit", horn_1);
                bundle.putString("submit", horn_anesthesia);
                bundle.putString("submit", horn_painkiller);
                bundle.putStringArray("submit", protocol3);

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragment_category_4_milk fragment_category_4_milk = new fragment_category_4_milk();
                fragment_category_4_milk.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_4_milk); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
}
