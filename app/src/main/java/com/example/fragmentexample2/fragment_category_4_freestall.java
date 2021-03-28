package com.example.fragmentexample2;

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

public class fragment_category_4_freestall extends Fragment {
    private View view;
    private String result;
    private Button btn_move;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_4_freestall, container, false);

        //fragment에서는 findById가 바로 동작하지 않아서 view를 사용해 써야함.
        final EditText ed_37_head_Butt = view.findViewById(R.id.freestall_head_Butt_a37);
        final EditText ed_38_struggle = view.findViewById(R.id.freestall_struggle_a38);
        final EditText ed_39_touch_Near = view.findViewById(R.id.freestall_touch_Near_a39);
        final EditText ed_40_touch_Far = view.findViewById(R.id.freestall_touch_Far_a40);
        final EditText ed_41_touch_Impossibility = view.findViewById(R.id.freestall_touch_Impossibility_41);

        Button btn_move = ((Button)getActivity().findViewById(R.id.btn_move1));
        btn_move.setText("제출");


        //데이터 받는 곳
//        if(getArguments() != null) { //null
//            result = getArguments().getString("fromFrag1"); //프래그먼트1로부터 setArguments된 데이터를 받아옴.
//            tv_frag1.setText(result);
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

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragment_result_1 fragment_result_1 = new fragment_result_1();
                fragment_result_1.setArguments(bundle);
                transaction.replace(R.id.framelayout, fragment_result_1); //프레임레이아웃은 가만히 있는 상태에서 프래그먼트만 교체, (frame, 교체될 fragment)
                transaction.commit(); // 저장, 저장하지 않으면 바뀌지 않음.
            }
        });

        return view;
    }
}
