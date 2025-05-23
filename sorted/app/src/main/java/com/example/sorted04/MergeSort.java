package com.example.sorted04;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static int  Nswaps =0;
    public static ArrayList<String> steps(Integer[] arr ) {
        ArrayList<String> step_list = new ArrayList<String>();

        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int Ccounter = 0;


        int mid = n / 2;
        step_list.add("mid point is : "+mid+"\n");
        Integer [] l;
        l = new Integer [mid];
        Integer [] r ;
        r = new Integer[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        String str1 = "[";
        for (int i = 0; i < l.length - 1; i++) {
            str1 += l[i];
            str1 += ", ";
        }
        if (l.length > 0) {
            str1 += l[l.length - 1];
            str1 += "]";
        }
        step_list.add("array :" +str1+"\n");

        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        String str2 = "[";
        for (int i = 0; i < r.length - 1; i++) {
            str2 += r[i];
            str2 += ", ";
        }
        if (r.length > 0) {
            str2 += r[r.length - 1];
            str2 += "]";
        }
        step_list.add("array :" +str2+"\n");

        mergeSort(l, mid);
        String str3 = "[";
        for (int i = 0; i < l.length - 1; i++) {
            str3 += l[i];
            str3 += ", ";
        }
        if (l.length > 0) {
            str3 += l[l.length - 1];
            str3 += "]";
        }
        step_list.add("array :" +str3+"\n");
        mergeSort(r, n - mid);
        String str4 = "[";
        for (int i = 0; i < r.length - 1; i++) {
            str4 += r[i];
            str4 += ", ";
        }
        if (l.length > 0) {
            str4 += r[r.length - 1];
            str4 += "]";
        }
        step_list.add("array :" +str4+"\n");

        step_list.add("merging both arrays "+"\n");
        merge(arr, l, r, mid, n - mid);


        System.out.println(Ccounter);
        return step_list;
    }

    public static void mergeSort(Integer [] a , int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;

        Integer [] l;
        l = new Integer [mid];
        Integer [] r ;
        r = new Integer[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, a.length - mid);

        merge(a, l, r, mid, a.length - mid);
    }
    public static void merge(
            Integer [] a, Integer[] l, Integer[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
