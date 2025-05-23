package com.example.sorted04;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class TriFragment extends Fragment {
    private EditText input;
    private TextView output;
    private Button sort;
    private TriFragmentListner listner;
    public TriFragment() {
        // Required empty public constructor
    }
    public interface TriFragmentListner{
        void onInputsent(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View view= inflater.inflate(R.layout.fragment_tri, container, false);
         input =view.findViewById(R.id.input);
         output =view.findViewById(R.id.output);
         sort = (Button) view.findViewById(R.id.sort);


        sort.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Perform action on click
                if(input.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(), "Please insert numbers", Toast.LENGTH_SHORT).show();

                }
                else {

                    // sending the input to StepsFragment
                      String inputt = input.getText().toString();
                      listner.onInputsent(inputt);
                    // returns array of numbers separated with "," , but in string format
                    String[] numberList = input.getText().toString().split(",");
                    Integer[] numbers = new Integer[numberList.length];

                    // converting the strig array to an array of integers
                    for (int i = 0; i < numberList.length; i++) {

                        numbers[i] = Integer.parseInt(numberList[i]);
                    }
                    Bundle b = getActivity().getIntent().getExtras();//get the intente with all the extras
                    if(b != null){
                        String sort1 =b.getString("sort");
                        System.out.println(sort1);
                        if (sort1.equals("selection")) {
                            new SelectionSort().selectionsort(numbers);
                        }else if (sort1.equals("insertion")) {
                            new InsertionSort().insertionSortImperative(numbers);
                        }else if (sort1.equals("merge")) {
                            new MergeSort().mergeSort(numbers,numbers.length);
                        }else if (sort1.equals("quick")) {
                            new QuickSort().quickSort(numbers,0,numbers.length-1);
                        }else if (sort1.equals("bubble")) {
                            new BubbleSort().bubbleSort(numbers);
                        }
                    }
                    //SelectionSort.selectionsort(numbers);  // returns the sorted numbers
                    // assing the sorted numbers to the textVeiw with id=output
                    output.setText(Arrays.toString(numbers));
                    output.setVisibility(View.VISIBLE);
                    // sending the input to StepsFragment

                }
            }

        });

       return view ;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof TriFragmentListner){
            listner = (TriFragmentListner) context ;
        }else{
            throw new RuntimeException(context.toString()
            +"must implement TriFragmentListner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listner=null;
    }
}
