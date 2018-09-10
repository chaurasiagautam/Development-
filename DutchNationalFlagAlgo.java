package com.gautam.algo;

import java.util.Arrays;

public class DutchNationalFlagAlgo {
    public DutchNationalFlagAlgo() {
        super();
    }

    public static void main(String[] args) {
        DutchNationalFlagAlgo dutchNationalFlagAlgo = new DutchNationalFlagAlgo();
        int[] arr = {1,2,0,0,2,0,1};
        dutchNationalFlagAlgo.sortArray(arr);
        String[] arrStr = {"G", "B", "R", "R", "B", "R", "G"};
//        dutchNationalFlagAlgo.sortArray(arrStr);
    }

    public void sortArray(int[] arr) {
        int len = arr.length;
        int low = 0, mid = 0;
        int high = len - 1;
        while (mid <= high) {
            System.out.println("Element "+arr[mid]);
            int temp = 0;
            switch (arr[mid]) {
            case 0:
                {
                System.out.println("Case0 "+mid);
               
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                break;
                }
            case 1:
                {
                System.out.println("Case1 "+mid);
                mid++;
                break;
                }
            case 2:
                {
                System.out.println("Case2 "+mid);
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high]  = temp;
                high--;
                mid++;
                break;
                }
            }
        }
        
        for(int i =0;i<len;i++){
            System.out.print(" "+arr[i]);
            }
        System.out.println("\n");
    }
    
    public void sortArray(String[] arr) {
        int len = arr.length;
        int low = 0, mid = 0;
        int high = len - 1;
        while (mid <= high) {
            System.out.println("Element "+arr[mid]);
            String temp = null;
            switch (arr[mid]) {
            case "R":
                {
                System.out.println("Case0 "+mid);
               
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                break;
                }
            case "G":
                {
                System.out.println("Case1 "+mid);
                mid++;
                break;
                }
            case "B":
                {
                System.out.println("Case2 "+mid);
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high]  = temp;
                high--;
                mid++;
                break;
                }
            }
        }
        
        for(int i =0;i<len;i++){
            System.out.print(" "+arr[i]);
            }
        System.out.println("\n");
    }
}
