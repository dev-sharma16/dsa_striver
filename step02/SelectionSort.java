package step02;

import java.util.Arrays;

public class SelectionSort {
    void selectionSort(int[] arr) {
        
        int n = arr.length;
        
        for(int i = 0 ;i<n-1; i++){
        
            int min = i;
            for(int j = i; j<n ; j++){
                
                if(arr[j]<arr[min]){
                    min = j;
                }
                
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        
    }


    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        
        int[] arr = {4, 1, 3, 9, 7};
        
        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        sorter.selectionSort(arr);
        
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
