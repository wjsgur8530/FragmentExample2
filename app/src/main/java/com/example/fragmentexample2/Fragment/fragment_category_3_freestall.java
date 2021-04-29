package com.example.fragmentexample2.Fragment;

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

import com.example.fragmentexample2.MainActivity;
import com.example.fragmentexample2.R;
import com.example.fragmentexample2.category1;

public class fragment_category_3_freestall extends Fragment implements category1.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;
    Integer horn = 0, horn_Anesthesia = 0, horn_Painkiller = 0;
    private EditText ed_20_slight_Limp;
    private EditText ed_21_critical_Limp;
    private EditText ed_22_slight_Hairloss;
    private EditText ed_23_critical_Hairloss;
    private EditText ed_24_cought;
    private EditText ed_25_runny_Nose;
    private EditText ed_26_ophthalmic_Secretion;
    private EditText ed_27_respiratory_Failure;
    private EditText ed_28_diarrhea;
    private EditText ed_29_out_Genitals_Secretion;
    private EditText ed_30_breast_Inflammation;
    private EditText ed_31_fall_Dead;
    private EditText ed_32_dystocia;
    private EditText ed_33_astasia;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_3_freestall, container, false);
        ScrollView scrollview_freestall_3 = view.findViewById(R.id.scrollview_freestall_3);
        TextView freestall_slight_Limp_q20 = (TextView) view.findViewById(R.id.freestall_slight_Limp_q20);
        TextView freestall_critical_Limp_q21 = (TextView) view.findViewById(R.id.freestall_critical_Limp_q21);
        TextView freestall_slight_Hairloss_q22 = (TextView) view.findViewById(R.id.freestall_slight_Hairloss_q22);
        TextView freestall_critical_Hairloss_q23 = (TextView) view.findViewById(R.id.freestall_critical_Hairloss_q23);
        TextView freestall_cough_q24 = (TextView) view.findViewById(R.id.freestall_cough_q24);
        TextView freestall_runny_Nose_q25 = (TextView) view.findViewById(R.id.freestall_runny_Nose_q25);
        TextView freestall_ophthalmic_Secretion_q26 = (TextView) view.findViewById(R.id.freestall_ophthalmic_Secretion_q26);
        TextView freestall_respiratory_Failure_q27 = (TextView) view.findViewById(R.id.freestall_respiratory_Failure_q27);
        TextView freestall_diarrhea_q28 = (TextView) view.findViewById(R.id.freestall_diarrhea_q28);
        TextView freestall_out_Genitals_Secretion_q29 = (TextView) view.findViewById(R.id.freestall_out_Genitals_Secretion_q29);
        TextView freestall_breast_Inflammation_q30 = (TextView) view.findViewById(R.id.freestall_breast_Inflammation_q30);
        TextView freestall_fall_Dead_q31 = (TextView) view.findViewById(R.id.freestall_fall_Dead_q31);
        TextView freestall_dystocia_q32 = (TextView) view.findViewById(R.id.freestall_dystocia_q32);
        TextView freestall_astasia_q33 = (TextView) view.findViewById(R.id.freestall_astasia_q33);
        TextView freestall_horn_q34 = (TextView) view.findViewById(R.id.freestall_horn_q34);
        TextView freestall_horn_Anesthesia_q35 = (TextView) view.findViewById(R.id.freestall_horn_Anesthesia_q35);
        TextView freestall_horn_Painkiller_q36 = (TextView) view.findViewById(R.id.freestall_horn_Painkiller_q36);


        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        ed_20_slight_Limp = (EditText) view.findViewById(R.id.freestall_slight_Limp_a20);
        ed_21_critical_Limp = (EditText) view.findViewById(R.id.freestall_critical_Limp_a21);
        ed_22_slight_Hairloss =(EditText)  view.findViewById(R.id.freestall_slight_Hairloss_a22);
        ed_23_critical_Hairloss = (EditText) view.findViewById(R.id.freestall_critical_Hairloss_a23);
        ed_24_cought = (EditText) view.findViewById(R.id.freestall_cough_a24);
        ed_25_runny_Nose = (EditText) view.findViewById(R.id.freestall_runny_Nose_a25);
        ed_26_ophthalmic_Secretion = (EditText) view.findViewById(R.id.freestall_ophthalmic_Secretion_a26);
        ed_27_respiratory_Failure = (EditText) view.findViewById(R.id.freestall_respiratory_Failure_a27);
        ed_28_diarrhea =(EditText)  view.findViewById(R.id.freestall_diarrhea_a28);
        ed_29_out_Genitals_Secretion = (EditText) view.findViewById(R.id.freestall_out_Genitals_Secretion_a29);
        ed_30_breast_Inflammation = (EditText) view.findViewById(R.id.freestall_breast_Inflammation_a30);
        ed_31_fall_Dead = (EditText) view.findViewById(R.id.freestall_fall_Dead_a31);
        ed_32_dystocia = (EditText) view.findViewById(R.id.freestall_dystocia_a32);
        ed_33_astasia =(EditText)  view.findViewById(R.id.freestall_astasia_a33);

// 버튼 이용할 때
  /*      Button freestall_slight_Limp_btn = view.findViewById(R.id.freestall_slight_Limp_btn);
        Button freestall_critical_Limp_btn = view.findViewById(R.id.freestall_critical_Limp_btn);
        Button freestall_slight_Hairloss_btn = view.findViewById(R.id.freestall_slight_Hairloss_btn);
        Button freestall_critical_Hairloss_btn = view.findViewById(R.id.freestall_critical_Hairloss_btn);
        Button freestall_cough_btn = view.findViewById(R.id.freestall_cough_btn);
        Button freestall_runny_Nose_btn = view.findViewById(R.id.freestall_runny_Nose_btn);
        Button freestall_ophthalmic_Secretion_btn = view.findViewById(R.id.freestall_ophthalmic_Secretion_btn);
        Button freestall_respiratory_Failure_btn = view.findViewById(R.id.freestall_respiratory_Failure_btn);
        Button freestall_diarrhea_btn = view.findViewById(R.id.freestall_diarrhea_btn);
        Button freestall_out_Genitals_Secretion_btn = view.findViewById(R.id.freestall_out_Genitals_Secretion_btn);
        Button freestall_breast_Inflammation_btn = view.findViewById(R.id.freestall_breast_Inflammation_btn);
        Button freestall_fall_Dead_btn = view.findViewById(R.id.freestall_fall_Dead_btn);
        Button freestall_dystocia_btn = view.findViewById(R.id.freestall_dystocia_btn);
        Button freestall_astasia_btn = view.findViewById(R.id.freestall_astasia_btn);*/


     /*   ((MainActivity)MainActivity.mContext).addButtonScroll(ed_20_slight_Limp,freestall_slight_Limp_btn,scrollview_freestall_3,freestall_critical_Limp_q21);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_21_critical_Limp,freestall_critical_Limp_btn,scrollview_freestall_3,freestall_slight_Hairloss_q22);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_22_slight_Hairloss,freestall_slight_Hairloss_btn,scrollview_freestall_3,freestall_critical_Hairloss_q23);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_23_critical_Hairloss,freestall_critical_Hairloss_btn,scrollview_freestall_3,freestall_cough_q24);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_24_cought,freestall_cough_btn,scrollview_freestall_3,freestall_runny_Nose_q25);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_25_runny_Nose,freestall_runny_Nose_btn,scrollview_freestall_3,freestall_ophthalmic_Secretion_q26);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_26_ophthalmic_Secretion,freestall_ophthalmic_Secretion_btn,scrollview_freestall_3,freestall_respiratory_Failure_q27);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_27_respiratory_Failure,freestall_respiratory_Failure_btn,scrollview_freestall_3,freestall_diarrhea_q28);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_28_diarrhea,freestall_diarrhea_btn,scrollview_freestall_3,freestall_out_Genitals_Secretion_q29);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_29_out_Genitals_Secretion,freestall_out_Genitals_Secretion_btn,scrollview_freestall_3,freestall_breast_Inflammation_q30);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_30_breast_Inflammation,freestall_breast_Inflammation_btn,scrollview_freestall_3,freestall_fall_Dead_q31);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_31_fall_Dead,freestall_fall_Dead_btn,scrollview_freestall_3,freestall_dystocia_q32);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_32_dystocia,freestall_dystocia_btn,scrollview_freestall_3,freestall_astasia_q33);
        ((MainActivity)MainActivity.mContext).addButtonScroll(ed_33_astasia,freestall_astasia_btn,scrollview_freestall_3,freestall_horn_q34);
*/
        RadioGroup rdiog_34_horn = (RadioGroup) view.findViewById(R.id.freestall_horn_rdogrp34); //11번 문항

        rdiog_34_horn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ((MainActivity)MainActivity.mContext).scrollToView(freestall_horn_Anesthesia_q35,scrollview_freestall_3,0);
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
                ((MainActivity)MainActivity.mContext).scrollToView(freestall_horn_Painkiller_q36,scrollview_freestall_3,0);
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
    @Override
    public void onBackKey() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.framelayout, new fragment_category_2_freestall())
                .addToBackStack(null)
                .commit();
    }
}
