package com.example.sorted04;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Intent.getIntent;
import static com.example.sorted04.AlgorithmCode.CODE_BUBBLE_SORT;
import static com.example.sorted04.AlgorithmCode.CODE_INSERTION_SORT;
import static com.example.sorted04.AlgorithmCode.CODE_MERGE_SORT;
import static com.example.sorted04.AlgorithmCode.CODE_QUICKSORT;
import static com.example.sorted04.AlgorithmCode.CODE_SELECTION_SORT;


public class CodeFragment extends Fragment  {
    public TextView codetext;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_code, container, false);
        codetext=view.findViewById(R.id.code);

        Bundle b = getActivity().getIntent().getExtras();//get the intente with all the extras
        if(b != null){
        String sort1 =b.getString("sort");
        System.out.println(sort1);
            if (sort1.equals("selection")) {
                new AlgorithmCode().setCode(codetext, CODE_SELECTION_SORT);
            }else if (sort1.equals("insertion")) {
                new AlgorithmCode().setCode(codetext, CODE_INSERTION_SORT);
            }else if (sort1.equals("merge")) {
                new AlgorithmCode().setCode(codetext, CODE_MERGE_SORT);
            }else if (sort1.equals("quick")) {
                new AlgorithmCode().setCode(codetext, CODE_QUICKSORT);
            }else if (sort1.equals("bubble")) {
                new AlgorithmCode().setCode(codetext, CODE_BUBBLE_SORT);
            }
        }
        /*
        Bundle c = getActivity().getIntent().getExtras();
        String sort2 =c.getString("extras");


        if (sort2 != null) {
            if (sort2.equals("insertion")) {

                new AlgorithmCode().setCode(codetext, CODE_INSERTION_SORT);
            }
        }*/



        return view;
    }

}