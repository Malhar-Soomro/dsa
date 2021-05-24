package com.DataStructures_And_Algorithms;
// swapping of array
public class Array {
    static public void swap(int arr[], int x , int y){
        // 0 th index element 1
        // 2 index element 3
        int i = arr[x]; // 1
        int j = arr[y]; // 3

        arr[x] = j; // 0 index 1 and now 3
        arr[y] = i; // 2 index 3 and now 1
    }

    static public void print(int arr[]){
        for (int i: arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
    int arr[] = {1,2,3,4};
        System.out.println("Before swapping");
    print(arr);
        System.out.println("after swapping");
        swap(arr, 0,2);
        print(arr);


    }
}
