package com.example.sorted04;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static ArrayList<String> steps(Integer[] arr) {
        ArrayList<String> step_list = new ArrayList<String>();
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int Ccounter=0;
        step_list.add("1st element is sorted "+arr[0] + "\n ");
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            step_list.add("key slected is : "+ key + "\n ");
            int j = i - 1;
            step_list.add("----- comparison "+Ccounter +" :  comparing "+ arr[j]+" and "+ key+"----- \n ");
            while (j >= 0 && arr[j] > key) {
                step_list.add( "("+arr[j]+">"+key +") TRUE ,  swaping " + arr[j+1] + "and" + arr[j]+ "\n");
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }
        /*public static void swap(Integer[] arr, int i, int j) {
            int e = arr[i];
            arr[i] = arr[j];
            arr[j] = e;
            Nswaps++ ;
        }*/
        System.out.println(Ccounter);


        return step_list;
    }



    public static void insertionSortImperative(Integer [] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
    }

}
