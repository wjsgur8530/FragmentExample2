package com.example.fragmentexample2.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentexample2.R;
import com.example.fragmentexample2.Result;
import com.example.fragmentexample2.category1;

public class Fragment_category_4_breed_batch extends Fragment implements category1.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;
    private EditText ed_33_struggle, ed_34_harmony, ed_35_touch_Near, ed_36_touch_Far, ed_37_touch_Impossibility;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_category_4_breed_batch, container, false);


        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        ed_33_struggle = view.findViewById(R.id.breed_batch_struggle_a33);
        ed_34_harmony = view.findViewById(R.id.breed_batch_harmony_a34);
        ed_35_touch_Near = view.findViewById(R.id.breed_batch_touch_Near_a35);
        ed_36_touch_Far = view.findViewById(R.id.breed_batch_touch_Far_a36);
        ed_37_touch_Impossibility = view.findViewById(R.id.breed_batch_touch_Impossibility_a37);

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
                String struggle = ed_33_struggle.getText().toString();
                String harmony = ed_34_harmony.getText().toString();
                String touch_near = ed_35_touch_Near.getText().toString();
                String touch_far = ed_36_touch_Far.getText().toString();
                String touch_impossibility = ed_37_touch_Impossibility.getText().toString();

                String[] protocol4 = {struggle, harmony, touch_near, touch_far, touch_impossibility};

                Bundle bundle = new Bundle(); // 무언가를 담는 공간
                bundle.putString("submit", struggle);
                bundle.putString("submit", harmony);
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
                .replace(R.id.framelayout, new Fragment_category_3_breed_batch())
                .addToBackStack(null)
                .commit();
    }
}
