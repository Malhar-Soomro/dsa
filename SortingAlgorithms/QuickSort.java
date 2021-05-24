package com.DataStructures_And_Algorithms.SortingAlgorithms;

public class QuickSort {
    public void quickSort(int []arr, int start, int end){
        int partIndex;
        if(start < end)
        {

            partIndex = partition(arr, start, end);
            quickSort(arr, start, partIndex - 1);
            quickSort(arr, partIndex + 1, end);
        }
    }

    public int partition(int [] arr, int start, int end){


        return 0;
}

}
