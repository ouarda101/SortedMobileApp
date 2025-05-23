package com.example.sorted04;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.sorted04.TheorySort.THEORY_BUBBLE_SORT;
import static com.example.sorted04.TheorySort.THEORY_INSERTION_SORT;
import static com.example.sorted04.TheorySort.THEORY_MERGE_SORT;
import static com.example.sorted04.TheorySort.THEORY_QUICK_SORT;
import static com.example.sorted04.TheorySort.THEORY_SELECTION_SORT;



public class TheoryFragment extends Fragment {
    public TextView theorytext;

    /*// TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER*/
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TheoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TheoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TheoryFragment newInstance(String param1, String param2) {
        TheoryFragment fragment = new TheoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_theory, container, false);
        View view = inflater.inflate(R.layout.fragment_theory, container, false);
        theorytext=view.findViewById(R.id.theory);

        Bundle b = getActivity().getIntent().getExtras();//get the intente with all the extras
        if(b != null){
            String sort1 =b.getString("sort");
            System.out.println(sort1);
            if (sort1.equals("selection")) {
                new TheorySort().setTheory(theorytext, THEORY_SELECTION_SORT);
            }else if (sort1.equals("insertion")) {
                new TheorySort().setTheory(theorytext, THEORY_INSERTION_SORT);
            }else if (sort1.equals("merge")) {
                new TheorySort().setTheory(theorytext, THEORY_MERGE_SORT);
            }else if (sort1.equals("quick")) {
                new TheorySort().setTheory(theorytext, THEORY_QUICK_SORT);
            }else if (sort1.equals("bubble")) {
                new TheorySort().setTheory(theorytext, THEORY_BUBBLE_SORT);
            }
        }
        return view;
    }
}