package com.example.fragmentexample2.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentexample2.R;
import com.example.fragmentexample2.Result;
import com.example.fragmentexample2.category1;

public class fragment_category_4_freestall extends Fragment implements category1.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;
    public String total_cow_count = ((Input_userinfo)Input_userinfo.context_userinfo).total_cow_count;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_4_freestall, container, false);
        ScrollView scrollview_freestall_4 = view.findViewById(R.id.scrollview_freestall_4);
        TextView freestall_head_Butt_q37 = (TextView) view.findViewById(R.id.freestall_head_Butt_q37);
        TextView freestall_struggle_q38 = (TextView) view.findViewById(R.id.freestall_struggle_q38);
        TextView freestall_touch_Near_q39 = (TextView) view.findViewById(R.id.freestall_touch_Near_q39);
        TextView freestall_touch_Far_q40 = (TextView) view.findViewById(R.id.freestall_touch_Far_q40);
        TextView freestall_touch_Impossibility_q41 = (TextView) view.findViewById(R.id.freestall_touch_Impossibility_q41);
<<<<<<< HEAD:app/src/main/java/com/example/fragmentexample2/fragment_category_4_freestall.java
        TextView freestall_struggle_score = (TextView) view.findViewById(R.id.freestall_struggle_score);
        TextView freestall_untouchable_score = (TextView) view.findViewById(R.id.freestall_untouchable_score);

=======
>>>>>>> master:app/src/main/java/com/example/fragmentexample2/Fragment/fragment_category_4_freestall.java
        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        final EditText ed_37_head_Butt = view.findViewById(R.id.freestall_head_Butt_a37);
        final EditText ed_38_struggle = view.findViewById(R.id.freestall_struggle_a38);
        final EditText ed_39_touch_Near = view.findViewById(R.id.freestall_touch_Near_a39);
        final EditText ed_40_touch_Far = view.findViewById(R.id.freestall_touch_Far_a40);
        final EditText ed_41_touch_Impossibility = view.findViewById(R.id.freestall_touch_Impossibility_a41);
<<<<<<< HEAD:app/src/main/java/com/example/fragmentexample2/fragment_category_4_freestall.java

        ed_37_head_Butt.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                Log.d("37번 머리박치기", "현재값은: " + ed_37_head_Butt.getText().toString());
                if(TextUtils.isEmpty(ed_37_head_Butt.getText().toString())) {
                    freestall_struggle_score.setText("37번 값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if(TextUtils.isEmpty(ed_38_struggle.getText().toString())) {
                    freestall_struggle_score.setText("38번 값을 입력해주세요");
                } else if(Integer.parseInt(total_cow_count) < Double.parseDouble(ed_37_head_Butt.getText().toString())){
                    freestall_struggle_score.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
//                    freestall_struggle_score.setText(getStruggleScore(ed_37_head_Butt.getText().toString(), ed_38_struggle.getText().toString()));
                    freestall_struggle_score.setText(((Milk_cow)Milk_cow.context).getStruggleScore(ed_37_head_Butt.getText().toString(), ed_38_struggle.getText().toString()));
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        ed_38_struggle.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                Log.d("38번 머리박치기", "현재값은: " + ed_38_struggle.getText().toString());
                if(TextUtils.isEmpty(ed_37_head_Butt.getText().toString())) {
                    freestall_struggle_score.setText("37번 값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if(TextUtils.isEmpty(ed_38_struggle.getText().toString())) {
                    freestall_struggle_score.setText("38번 값을 입력해주세요");
                } else if(Integer.parseInt(total_cow_count) < Double.parseDouble(ed_38_struggle.getText().toString())){
                    freestall_struggle_score.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
//                    freestall_struggle_score.setText(getStruggleScore(ed_37_head_Butt.getText().toString(), ed_38_struggle.getText().toString()));
                    freestall_struggle_score.setText(((Milk_cow)Milk_cow.context).getStruggleScore(ed_37_head_Butt.getText().toString(), ed_38_struggle.getText().toString()));
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        ed_39_touch_Near.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                Log.d("39번 가까이", "현재값은: " + ed_39_touch_Near.getText().toString());
                if(TextUtils.isEmpty(ed_39_touch_Near.getText().toString())) {
                    freestall_untouchable_score.setText("39번 값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if(TextUtils.isEmpty(ed_40_touch_Far.getText().toString())) {
                    freestall_untouchable_score.setText("40번 값을 입력해주세요");
                } else if(TextUtils.isEmpty(ed_41_touch_Impossibility.getText().toString())) {
                    freestall_untouchable_score.setText("41번 값을 입력해주세요");
                } else if(Integer.parseInt(total_cow_count) < Double.parseDouble(ed_39_touch_Near.getText().toString())){
                    freestall_untouchable_score.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
                    freestall_untouchable_score.setText(((Milk_cow)Milk_cow.context).getUntouchableCowScore(ed_39_touch_Near.getText().toString(), ed_40_touch_Far.getText().toString(), ed_41_touch_Impossibility.getText().toString()));
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        ed_40_touch_Far.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                Log.d("40번 중간", "현재값은: " + ed_40_touch_Far.getText().toString());
                if(TextUtils.isEmpty(ed_39_touch_Near.getText().toString())) {
                    freestall_untouchable_score.setText("39번 값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if(TextUtils.isEmpty(ed_40_touch_Far.getText().toString())) {
                    freestall_untouchable_score.setText("40번 값을 입력해주세요");
                } else if(TextUtils.isEmpty(ed_41_touch_Impossibility.getText().toString())) {
                    freestall_untouchable_score.setText("41번 값을 입력해주세요");
                } else if(Integer.parseInt(total_cow_count) < Double.parseDouble(ed_40_touch_Far.getText().toString())){
                    freestall_untouchable_score.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
                    freestall_untouchable_score.setText(((Milk_cow)Milk_cow.context).getUntouchableCowScore(ed_39_touch_Near.getText().toString(), ed_40_touch_Far.getText().toString(), ed_41_touch_Impossibility.getText().toString()));
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
        ed_41_touch_Impossibility.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                Log.d("41번 못만지는", "현재값은: " + ed_41_touch_Impossibility.getText().toString());
                if(TextUtils.isEmpty(ed_39_touch_Near.getText().toString())) {
                    freestall_untouchable_score.setText("39번 값을 입력해주세요");
                    // 총 두수 보다 입력한 값이 클 때
                } else if(TextUtils.isEmpty(ed_40_touch_Far.getText().toString())) {
                    freestall_untouchable_score.setText("40번 값을 입력해주세요");
                } else if(TextUtils.isEmpty(ed_41_touch_Impossibility.getText().toString())) {
                    freestall_untouchable_score.setText("41번 값을 입력해주세요");
                } else if(Integer.parseInt(total_cow_count) < Integer.parseInt(ed_41_touch_Impossibility.getText().toString())){
                    freestall_untouchable_score.setText("총 두수보다 큰 값을 입력할 수 없습니다.");
                } else {
                    freestall_untouchable_score.setText(((Milk_cow)Milk_cow.context).getUntouchableCowScore(ed_39_touch_Near.getText().toString(), ed_40_touch_Far.getText().toString(), ed_41_touch_Impossibility.getText().toString()));
                }
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
=======
>>>>>>> master:app/src/main/java/com/example/fragmentexample2/Fragment/fragment_category_4_freestall.java

        Button btn_move = ((Button)getActivity().findViewById(R.id.btn_move1));
        btn_move.setText("제출");
        Button btn_back = ((Button)getActivity().findViewById(R.id.btn_back));

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackKey();
            }
        });
        //뒤로갈때 제출로 바뀜.


        //데이터 받는 곳
//        if(getArguments() != null) { //null
//            result = getArguments().getString("submit"); //프래그먼트1로부터 setArguments된 데이터를 받아옴.
//            tv_1.setText(result);
//        }

        btn_move.setOnClickListener(new View.OnClickListener() { //fragment1로 이동
            @Override
            public void onClick(View v) {
                String head_butt = ed_37_head_Butt.getText().toString();
                String struggle = ed_38_struggle.getText().toString();
                String touch_near = ed_39_touch_Near.getText().toString();
                String touch_far = ed_40_touch_Far.getText().toString();
                String touch_impossibility = ed_41_touch_Impossibility.getText().toString();

                String[] protocol4 = {head_butt, struggle, touch_near, touch_far, touch_impossibility};

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                bundle.putString("submit", head_butt); //id, content 마지막 페이지로 데이터 전달
                bundle.putString("submit", struggle);
                bundle.putString("submit", touch_near);
                bundle.putString("submit", touch_far);
                bundle.putString("submit", touch_impossibility);
                bundle.putStringArray("submit", protocol4);

                Intent intent = new Intent(getActivity(), Result.class);
                startActivity(intent);
            }
        });

        return view;
    }
    @Override
    public void onBackKey() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.framelayout, new fragment_category_3_freestall())
                .addToBackStack(null)
                .commit();
    }
}