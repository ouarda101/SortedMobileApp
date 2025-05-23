package com.example.sorted04;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static int  Nswaps =0; // number of the swaping operation

    public static ArrayList<String> steps(Integer[] arr)  {
         ArrayList<String> step_list = new ArrayList<String>();

        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int Ccounter=0; // number of comparisons counter
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;


            for (int j = i+1; j < n; j++) 	{
                Ccounter++;
                String a;
                //System.out.println("----- comparison "+Ccounter +" :  comparing "+ arr[i]+" and "+ arr[j]+"-----");
                step_list.add(" Comparison "+Ccounter +" :  comparer "+ arr[i]+" et "+ arr[j]+" \n ");



                if (arr[j] < arr[min_idx])
                {
                    min_idx = j ;
                    // System.out.println( "("+arr[j]+"<"+arr[i] +") TRUE ,  swap positions");
                    step_list.add( "("+arr[j]+"<"+arr[i] +") Vrais , échanger les positions \n");



                    swap(arr,min_idx, i);

                    // System.out.print("  °° swap " + Nswaps +" : ");
                    // System.out.println(Arrays.toString(arr));

                    step_list.add("  échange " + Nswaps +" : ");
                    step_list.add(Arrays.toString(arr)+"\n");



                }
                else
                    // System.out.println( "("+arr[j]+"<"+ arr[i]+")   FALSE , no swaping ");
                    step_list.add("("+arr[j]+"<"+ arr[i]+")   Faux , pas d'échange \n");


            }
            // Swap the found minimum element with the first
            // element

            swap(arr,min_idx, i);


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
    public static void selectionsort (Integer[] arr)
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


}
