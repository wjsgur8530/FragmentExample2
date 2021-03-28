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

public class fragment_category_3_freestall extends Fragment {
    private View view;
    private String result;
    private Button btn_move;
    Integer horn, horn_Anesthesia, horn_Painkiller;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_3_freestall, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        final EditText ed_20_slight_Limp = view.findViewById(R.id.freestall_slight_Limp_a20);
        final EditText ed_21_critical_Limp = view.findViewById(R.id.freestall_critical_Limp_a21);
        final EditText ed_22_slight_Hairloss = view.findViewById(R.id.freestall_slight_Hairloss_a22);
        final EditText ed_23_critical_Hairloss = view.findViewById(R.id.freestall_critical_Hairloss_a23);
        final EditText ed_24_cought = view.findViewById(R.id.freestall_cough_a24);
        final EditText ed_25_runny_Nose = view.findViewById(R.id.freestall_runny_Nose_a25);
        final EditText ed_26_ophthalmic_Secretion = view.findViewById(R.id.freestall_ophthalmic_Secretion_a26);
        final EditText ed_27_respiratory_Failure = view.findViewById(R.id.freestall_respiratory_Failure_a27);
        final EditText ed_28_diarrhea = view.findViewById(R.id.freestall_diarrhea_a28);
        final EditText ed_29_out_Genitals_Secretion = view.findViewById(R.id.freestall_out_Genitals_Secretion_a29);
        final EditText ed_30_breast_Inflammation = view.findViewById(R.id.freestall_breast_Inflammation_a30);
        final EditText ed_31_fall_Dead = view.findViewById(R.id.freestall_fall_Dead_a31);
        final EditText ed_32_dystocia = view.findViewById(R.id.freestall_dystocia_a32);
        final EditText ed_33_astasia = view.findViewById(R.id.freestall_astasia_a33);


        RadioGroup rdiog_34_horn = (RadioGroup) view.findViewById(R.id.freestall_horn_rdogrp34); //11번 문항

        rdiog_34_horn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.freestall_horn_a34_1) {
                    horn = 1;
                } else if (checkedId == R.id.freestall_horn_a34_2) {
                    horn = 2;
                } else if (checkedId == R.id.freestall_horn_a34_3) {
                    horn = 3;
                } else if (checkedId == R.id.freestall_horn_a34_4) {
                    horn = 4;
                }
            }
        });

        RadioGroup rdiog_35_horn_anesthesia = (RadioGroup) view.findViewById(R.id.freestall_horn_Anesthesia_rdogrp35); //11번 문항

        rdiog_35_horn_anesthesia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.freestall_horn_Anesthesia_a35_1) {
                    horn_Anesthesia = 1;
                } else if (checkedId == R.id.freestall_horn_Anesthesia_a35_2) {
                    horn_Anesthesia = 2;
                }
            }
        });

        RadioGroup rdiog_36_horn_painkiller = (RadioGroup) view.findViewById(R.id.freestall_horn_Painkiller_rdogrp36); //11번 문항

        rdiog_36_horn_painkiller.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.freestall_horn_Painkiller_a36_1) {
                    horn_Painkiller = 1;
                } else if (checkedId == R.id.freestall_horn_Painkiller_a36_2) {
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
                String slight_limp = ed_20_slight_Limp.getText().toString();
                String critical_limp = ed_21_critical_Limp.getText().toString();
                String slight_hairloss = ed_22_slight_Hairloss.getText().toString();
                String critical_hairloss = ed_23_critical_Hairloss.getText().toString();
                String cought = ed_24_cought.getText().toString();
                String runny_nose = ed_25_runny_Nose.getText().toString();
                String ophthalmic_secretion = ed_26_ophthalmic_Secretion.getText().toString();
                String respiratory_failure = ed_27_respiratory_Failure.getText().toString();
                String diarrhea = ed_28_diarrhea.getText().toString();
                String out_genitals_secretion = ed_29_out_Genitals_Secretion.getText().toString();
                String breast_inflammation = ed_30_breast_Inflammation.getText().toString();
                String fall_dead = ed_31_fall_Dead.getText().toString();
                String dystocia = ed_32_dystocia.getText().toString();
                String astasia = ed_33_astasia.getText().toString();
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
                fragment_category_4_freestall fragment_category_4_freestall = new fragment_category_4_freestall();
                fragment_category_4_freestall.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_4_freestall); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
}
