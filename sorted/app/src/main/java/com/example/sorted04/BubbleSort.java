package com.example.sorted04;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static int  Nswaps =0;
    public static ArrayList<String> steps(Integer[] arr) {
        ArrayList<String> step_list = new ArrayList<String>();
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int Ccounter=0;
        for (int i = (n - 1); i >= 0; i--)
        {


            for (int j = 1; j <= i; j++) {
                Ccounter++;
                step_list.add("----- comparison "+Ccounter +" :  comparing "+ arr[j-1]+" and "+ arr[j]+"----- \n ");
                if (arr[j - 1] > arr[j]) {
                    step_list.add( "("+arr[j-1]+">"+arr[j] +") TRUE ,  swap positions \n");
                    swap(arr,j-1,j);
                    /*int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;*/
                    step_list.add("  °° swap " + Nswaps +" : ");
                    step_list.add(Arrays.toString(arr)+"\n");
                }
                else {

                    step_list.add("(" + arr[j-1] + ">" + arr[j] + ")   FALSE , no swaping \n");
                }
            }
        }
        System.out.println(Ccounter);
        return step_list;

    }
    public static void swap(Integer[] a, int i, int j) {
        int e = a[i];
        a[i] = a[j];
        a[j] = e;
        Nswaps++ ;
    }

    void bubbleSort(Integer ar[]) {
        int i, j;
        for (i = (ar.length - 1); i >= 0; i--) {
            for (j = 1; j <= i; j++) {
                if (ar[j - 1] > ar[j]) {
                    int temp = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}
