package com.example.sorted04;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static ArrayList<String> steps(Integer[] arr) {
        ArrayList<String> step_list = new ArrayList<String>();
        System.out.println(Arrays.toString(arr));
        int Ccounter=0;
        int low = 0;
        int high =  arr.length-1  ;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        step_list.add("pivot element  selected is : "+ pivot + "\n ");
        int i = low;
        int j = high;
        step_list.add("right pivot element  selected is : "+ i + "\n ");
        step_list.add(" left pivot element  selected is : "+ j + "\n ");

        while (i <= j)
        {
            //step_list.add("----- comparison " +Ccounter +" :  comparing "+ i +" and "+ j+"----- \n ");
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                step_list.add( "("+arr[i]+"<"+pivot +") TRUE ,  "+"\n");
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot)
            {
                step_list.add( "("+arr[j]+">"+pivot +") TRUE ,  "+"\n");
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                step_list.add( "("+i+"<"+j +") TRUE ,  swaping " + arr[i] + "and" + arr[j] + "\n");
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            step_list.add( "("+low+"<"+j +") TRUE ,  swaping " + arr[low] + "and" + arr[j] + "\n");
            quickSort(arr, low, j);
        }
        if (high > i){
            step_list.add( "("+high+">"+i +") TRUE ,  swaping " + arr[high] + "and" + arr[i] + "\n");
            quickSort(arr, i, high);
        }


        return step_list;
    }


    public static void quickSort(Integer[] arr, int low, int high)
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }

        if (low >= high){
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
    }
    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }


}
