package com.example.fragmentexample2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class fragment_category_4_milk extends Fragment implements MainActivity.onKeyBackPressedListener {
    private View view;
    private String result;
    private Button btn_move;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_4_milk, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        final EditText ed_34_head_Butt = view.findViewById(R.id.milk_head_Butt_a34);
        final EditText ed_35_struggle = view.findViewById(R.id.milk_struggle_a35);
        final EditText ed_36_touch_Near = view.findViewById(R.id.milk_touch_Near_a36);
        final EditText ed_37_touch_Far = view.findViewById(R.id.milk_touch_Far_a37);
        final EditText ed_38_touch_Impossibility = view.findViewById(R.id.milk_touch_Impossibility_a38);

        Button btn_move = ((Button)getActivity().findViewById(R.id.btn_move1));
        btn_move.setText("제출");
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
                String head_butt = ed_34_head_Butt.getText().toString();
                String struggle = ed_35_struggle.getText().toString();
                String touch_near = ed_36_touch_Near.getText().toString();
                String touch_far = ed_37_touch_Far.getText().toString();
                String touch_impossibility = ed_38_touch_Impossibility.getText().toString();

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
                .replace(R.id.framelayout, new fragment_category_3_milk())
                .addToBackStack(null)
                .commit();
    }
}
