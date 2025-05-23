package com.example.sorted04;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import com.example.sorted04.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;



public class StepsFragment extends Fragment  {


    private OnFragmentInteractionListener mListener;

    private static TextView inputEntred  ;
    private static TextView hint  ;
    private static RecyclerView RV ;
    private Handler mhandler = new Handler();


    public StepsFragment() {
        // Required empty public constructor
    }

    public void setTextView(String textentered){
        inputEntred.setText(textentered);
        hint.setVisibility(View.GONE);

        //Set  recyclerView Here.
        String[] numberList = inputEntred.getText().toString().split(",");
        final Integer[] numbers = new Integer[numberList.length];

        if(numberList.length !=0){
            // converting the strig array to an array of integers
            for (int i = 0; i < numberList.length; i++) {
                try {
                    numbers[i] = Integer.parseInt(numberList[i]);
                }
                catch (NumberFormatException e){
                    System.out.println("error is"+e);
                }
            }
            SelectionSort m1 = new SelectionSort();
            ArrayList<String> mystepsList = m1.steps(numbers);// returns the steps numbers
            if(mystepsList.isEmpty()){
                System.out.println("empty list");
            }else {
                for (int i = 0; i < mystepsList.size(); i++)
                {
                    System.out.println(mystepsList.get(i));
                }
            }



            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            RV.setLayoutManager(llm);
            StepListAdapter adapter = new StepListAdapter() ;
            RV.setAdapter(adapter);

            adapter.setList(mystepsList);
            RV.getViewTreeObserver().addOnPreDrawListener(
                    new ViewTreeObserver.OnPreDrawListener() {

                        @Override
                        public boolean onPreDraw() {
                            RV.getViewTreeObserver().removeOnPreDrawListener(this);

                            for (int i = 0; i < RV.getChildCount(); i++) {
                                View v = RV.getChildAt(i);
                                v.setAlpha(0.0f);
                                v.animate().alpha(1.0f)
                                        .setDuration(300)
                                        .setStartDelay(i * 50)
                                        .start();
                            }

                            return true;
                        }
                    });
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view =inflater.inflate(R.layout.fragment_steps, container, false);
          inputEntred  =view.findViewById(R.id.inputEntred);
           RV =view.findViewById(R.id.RV);
           hint= view.findViewById(R.id.execution);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            //   mListener = (OnFragmentInteractionListener) context;

        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }}
