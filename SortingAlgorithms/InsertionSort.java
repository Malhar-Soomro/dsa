package com.DataStructures_And_Algorithms.SortingAlgorithms;

public class InsertionSort {
    public void insertionSort(int size, int[] arr){
        for (int i = 0; i < size - 1; i++){
            for (int j = i; j >= 0; j--){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int[] arr){
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] array = {3, 2, 5, 9 , 1};
        sort.print(array);
        sort.insertionSort(array.length,array);
        sort.print(array);

    }
}
