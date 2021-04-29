package com.example.fragmentexample2.Fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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

import com.example.fragmentexample2.Input_userinfo;
import com.example.fragmentexample2.R;
import com.example.fragmentexample2.category1;

public class Fragment_category_3_fatten extends Fragment implements category1.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;
    private EditText  ed_14_Limp, ed_15_slight_Hairloss, ed_16_critical_Hairloss,
            ed_17_cough, ed_18_runny_Nose, ed_19_ophthalmic_Secretion, ed_20_respiratory_Failure, ed_21_diarrhea,
            ed_22_ruminant, ed_23_fall_Dead;
    Integer horn = 0, horn_Anesthesia = 0, horn_Painkiller = 0, castration = 0, castration_Anesthesia = 0,
            castration_Painkiller = 0;
    public String total_cow_count = ((Input_userinfo)Input_userinfo.context_userinfo).total_cow_count;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_3_fatten, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        TextView fatten_limp_ratio = (TextView)view.findViewById(R.id.fatten_limp_ratio);
        TextView fatten_limp_score = (TextView)view.findViewById(R.id.fatten_limp_score);
        TextView fatten_fall_Dead_ratio = (TextView)view.findViewById(R.id.fatten_fall_Dead_ratio);
        TextView fatten_horn_removal_score = (TextView)view.findViewById(R.id.fatten_horn_removal_score);
        TextView fatten_castration_score =(TextView)view.findViewById(R.id.fatten_castration_score);
        ed_14_Limp = (EditText) view.findViewById(R.id.fatten_Limp_a14);
        ed_15_slight_Hairloss = (EditText) view.findViewById(R.id.fatten_slight_Hairloss_a15);
        ed_16_critical_Hairloss = (EditText) view.findViewById(R.id.fatten_critical_Hairloss_a16);
        ed_17_cough = (EditText) view.findViewById(R.id.fatten_cough_a17);
        ed_18_runny_Nose = (EditText) view.findViewById(R.id.fatten_runny_Nose_a18);
        ed_19_ophthalmic_Secretion = (EditText) view.findViewById(R.id.fatten_ophthalmic_Secretion_a19);
        ed_20_respiratory_Failure = (EditText) view.findViewById(R.id.fatten_respiratory_Failure_a20);
        ed_21_diarrhea = (EditText) view.findViewById(R.id.fatten_diarrhea_a21);
        ed_22_ruminant = (EditText) view.findViewById(R.id.fatten_ruminant_a22);
        ed_23_fall_Dead = (EditText) view.findViewById(R.id.fatten_fall_Dead_a23);

        RadioGroup rdiog_24_horn = (RadioGroup) view.findViewById(R.id.fatten_horn_rdogrp24);
        RadioGroup rdiog_25_horn_anesthesia = (RadioGroup) view.findViewById(R.id.fatten_horn_Anesthesia_rdogrp25);
        RadioGroup rdiog_26_horn_painkiller = (RadioGroup) view.findViewById(R.id.fatten_horn_Painkiller_rdogrp26);
        RadioGroup rdiog_27_castration = (RadioGroup) view.findViewById(R.id.fatten_castration_rdogrp27);
        RadioGroup rdiog_28_castration_anesthesia = (RadioGroup) view.findViewById(R.id.fatten_castration_Anesthesia_rdogrp28);
        RadioGroup rdiog_29_castration_painkiller = (RadioGroup) view.findViewById(R.id.fatten_castration_Painkiller_rdogrp29);

        rdiog_24_horn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fatten_horn_a24_1) {
                    horn = 1;
                } else if (checkedId == R.id.fatten_horn_a24_2) {
                    horn = 2;
                } else if (checkedId == R.id.fatten_horn_a24_3) {
                    horn = 3;
                } else if (checkedId == R.id.fatten_horn_a24_4) {
                    horn = 4;
                }
                fatten_horn_removal_score.setText(Integer.toString(getHornRemovalScore(horn,horn_Anesthesia,horn_Painkiller)));
            }
        });

        rdiog_25_horn_anesthesia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fatten_horn_Anesthesia_a25_1) {
                    horn_Anesthesia = 1;
                } else if (checkedId == R.id.fatten_horn_Anesthesia_a25_2) {
                    horn_Anesthesia = 2;
                }
                fatten_horn_removal_score.setText(Integer.toString(getHornRemovalScore(horn,horn_Anesthesia,horn_Painkiller)));
            }
        });

        rdiog_26_horn_painkiller.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fatten_horn_Painkiller_a26_1) {
                    horn_Painkiller = 1;
                } else if (checkedId == R.id.fatten_horn_Painkiller_a26_2) {
                    horn_Painkiller = 2;
                }
                fatten_horn_removal_score.setText(Integer.toString(getHornRemovalScore(horn,horn_Anesthesia,horn_Painkiller)));
            }
        });

        rdiog_27_castration.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fatten_castration_a27_1) {
                    castration = 1;
                } else if (checkedId == R.id.fatten_castration_a27_2) {
                    castration = 2;
                } else if (checkedId == R.id.fatten_castration_a27_3) {
                    castration = 3;
                } else if (checkedId == R.id.fatten_castration_a27_4) {
                    castration = 4;
                }
                fatten_castration_score.setText(Integer.toString(getCastrationScore(castration,
                        castration_Anesthesia,castration_Painkiller)));
            }
        });

        rdiog_28_castration_anesthesia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fatten_castration_Anesthesia_a28_1) {
                    castration_Anesthesia = 1;
                } else if (checkedId == R.id.fatten_castration_Anesthesia_a28_2) {
                    castration_Anesthesia = 2;
                }
                fatten_castration_score.setText(Integer.toString(getCastrationScore(castration,
                        castration_Anesthesia,castration_Painkiller)));
            }
        });

        rdiog_29_castration_painkiller.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.fatten_castration_Painkiller_a29_1) {
                    castration_Painkiller = 1;
                } else if (checkedId == R.id.fatten_castration_Painkiller_a29_2) {
                    castration_Painkiller = 2;
                }
                fatten_castration_score.setText(Integer.toString(getCastrationScore(castration,
                        castration_Anesthesia,castration_Painkiller)));
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

                String limp = ed_14_Limp.getText().toString();
                String slight_hairloss = ed_15_slight_Hairloss.getText().toString();
                String critical_hairloss = ed_16_critical_Hairloss.getText().toString();
                String cought = ed_17_cough.getText().toString();
                String runny_nose = ed_18_runny_Nose.getText().toString();
                String ophthalmic_secretion = ed_19_ophthalmic_Secretion.getText().toString();
                String respiratory_failure = ed_20_respiratory_Failure.getText().toString();
                String diarrhea = ed_21_diarrhea.getText().toString();
                String ruminant = ed_22_ruminant.getText().toString();
                String fall_dead = ed_23_fall_Dead.getText().toString();

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
                Fragment_category_4_fatten fragment_category_4_fatten = new Fragment_category_4_fatten();
                fragment_category_4_fatten.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_category_4_fatten); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });
        // 14번(다리절음) 자동으로 비율, 점수 계산
        ed_14_Limp.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                if(TextUtils.isEmpty(ed_14_Limp.getText().toString())) {
                    fatten_limp_ratio.setText("값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if(Integer.parseInt(total_cow_count) < Integer.parseInt(ed_14_Limp.getText().toString())){
                    fatten_limp_ratio.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
                    String total_cow = getFattenLimpRatio(total_cow_count, ed_14_Limp.getText().toString());
                    fatten_limp_ratio.setText(total_cow + "%");

                    fatten_limp_score.setText(getLimpScore(total_cow));
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        // 23번(다리절음) 자동으로 비율, 점수 계산
        ed_23_fall_Dead.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                if(TextUtils.isEmpty(ed_23_fall_Dead.getText().toString())) {
                    fatten_fall_Dead_ratio.setText("값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if(Integer.parseInt(total_cow_count) < Integer.parseInt(ed_23_fall_Dead.getText().toString())){
                    fatten_fall_Dead_ratio.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
                    String total_cow = getFattenFallDeadRatio(total_cow_count, ed_23_fall_Dead.getText().toString());
                    fatten_fall_Dead_ratio.setText(total_cow + "%");

                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        return view;

    }
    @Override
    public void onBackKey() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.framelayout, new Fragment_category_2_fatten())
                .addToBackStack(null)
                .commit();
    }
    public String getFattenLimpRatio(String total, String rate){
        Float totalFloat = Float.parseFloat(total);
        Float rateFloat = Float.parseFloat(rate);
        double result = (rateFloat / totalFloat) * 100;
        return String.format("%.2f",result);
    }
    public String getFattenFallDeadRatio(String total, String rate){
        Float totalFloat = Float.parseFloat(total);
        Float rateFloat = Float.parseFloat(rate);
        double result = (rateFloat / totalFloat) * 100;
        return String.format("%.2f",result);
    }

    public String getLimpScore(String limpStr)
    {
        int limpScore = 0;
        Float limp = Float.parseFloat(limpStr);
        if (limp == 0) {
            limpScore = 100;
        } else if (limp <= 1.5) {
        limpScore = 90;
    } else if (limp <= 3) {
        limpScore = 80;
    } else if (limp <= 5) {
        limpScore = 70;
    } else if (limp <= 7) {
        limpScore = 60;
    } else if (limp <= 10) {
        limpScore = 50;
    } else if (limp <= 13) {
        limpScore = 40;
    } else if (limp <= 20) {
        limpScore = 30;
    } else if (limp <= 31) {
        limpScore = 20;
    } else if (limp <= 49) {
        limpScore = 10;
    } else {
        limpScore = 0;
    }
        return Integer.toString(limpScore);
    }
    public int getHornRemovalScore(int horn, int hornAnesthesia, int hornPainkiller)
    {
        int hornRemovalScore = 0;
        // 제각안함
        if (horn == 1) {
            hornRemovalScore = 100;
        } // 송아지 제각 가열 방식
        else if (horn == 2) {
        // 마취제 사용
        if (hornAnesthesia == 1) {
            // 사후진통제 사용
            if (hornPainkiller == 1) {
                hornRemovalScore = 75;
            } else {
                hornRemovalScore = 52;
            }
        }
        // 마취제 미사용
        else {
            if (hornPainkiller == 1) {
                // 사후 진통제만 사용했을 경우 (누락 부분)
                hornRemovalScore = 49;
            }
            // 처치 없음
            else {
                hornRemovalScore = 28;
            }
        }
    }
        // 송아지 제각 화학적 방식
        else if (horn == 3) {
        // 마취제 사용
        if (hornAnesthesia == 1) {
            // 사후진통제 사용
            if (hornPainkiller == 1) {
                hornRemovalScore = 58;
            } else {
                hornRemovalScore = 39;
            }
        }
        // 마취제 미사용
        else {
            // 사후 진통제만 사용했을 경우 (누락 부분)
            if (hornPainkiller == 1) {
                hornRemovalScore = 41;
            } else {
                hornRemovalScore = 20;
            }
        }
    }
        // 성우 제각
        // 송아지는 사후진통제만 했을 때 점수가 마취제 점수보다 높은데 왜 성우는 더 높지 마취제가
    else {
        if (hornAnesthesia == 1) {
            if (hornPainkiller == 1) {
                hornRemovalScore = 27;
            } else {
                hornRemovalScore = 17;
            }
        } else {
            if (hornPainkiller == 1) {
                hornRemovalScore = 16;
            } else {
                hornRemovalScore = 2;
            }
        }
    }
        return hornRemovalScore;
    }
    public int getCastrationScore(int castration,int castrationAnesthesia, int castrationPainkiller)
    {
        int castrationScore = 0;
        // 거세 안함
        if (castration == 1) {
            castrationScore  = 100;
        }
        // 외과적 수술
        else if (castration == 2) {
            if (castrationAnesthesia == 1) {
                if (castrationPainkiller == 1) {
                    castrationScore = 34;
                } else {
                    castrationScore = 21;
                }
            } else {
                //"사후진통제"만 사용했을 경우 (누락 부분)
                if (castrationPainkiller == 1) {
                    castrationScore = 20;
                } else {
                    castrationScore = 0;
                }
            }
        }
        // 고무링
        else if (castration == 3) {
            if (castrationAnesthesia == 1) {
                if (castrationPainkiller == 1) {
                    castrationScore = 21;
                } else {
                    castrationScore = 17;
                }
            } else {
                //"사후진통제"만 사용했을 경우 (누락 부분)
                if (castrationPainkiller == 1) {
                    castrationScore = 17;
                } else {
                    castrationScore = 2;
                }
            }
        }
        // Burdizzo
        else if (castration == 4) {
            if (castrationAnesthesia == 1) {
                if (castrationPainkiller == 1) {
                    castrationScore = 35;
                } else {
                    castrationScore = 21;
                }
            } else {
                //"사후진통제"만 사용했을 경우 (누락 부분)
                if (castrationPainkiller == 1) {
                    castrationScore = 19;
                } else {
                    castrationScore = 0;
                }
            }
        }
        return castrationScore;
    }
}

