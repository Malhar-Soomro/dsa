package com.DataStructures_And_Algorithms;

import java.util.Arrays;

public class SearchAlgorithm {

    public int linearSearch(int arr[] , int element){
        for (int i: arr) {
            if(i == element){
                System.out.println("Element found at:"+i);
                return element;
            }
        }
        return 0;
    }

    public static int binarySearch(int arr[],int target){
        Arrays.sort(arr);
        int first=0;
        int last=arr.length;
        int mid=(first+last)/2;
        while(last!=first){
            if(target==mid){
                return mid;
            }
            else if(target<mid){
                last=mid;
            }
            else if(target>mid){
                first=mid+1;
            }
            mid=(last+first)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
        int index = searchAlgorithm.binarySearch(arr,4);
        System.out.println(index);

    }
}
