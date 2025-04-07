package step02;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int arr[]) {
        
        int n = arr.length;
        
        for(int i = 0; i<=n-1; i++){
            
            int j = i;
            
            while(j>0 && arr[j-1] > arr[j]){
                
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                
                j--;
                
            }
            
        }
        
    }

    public static void main(String[] args){
         
        InsertionSort sorter = new InsertionSort();

        int[] arr = {4, 1, 3, 9, 7};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        sorter.insertionSort(arr);
        
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
    
}
