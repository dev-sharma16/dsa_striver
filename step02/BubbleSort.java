package step02;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
       
        int n = arr.length;
        
        for(int i = n-1; i>=1; i--){
            
            for(int j=0; j<=i-1; j++){
                
                if(arr[j]>arr[j+1]){
                    
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    
                }
                
            }
            
        }
        
    }

    public static void main(String[] args){
         
        // BubbleSort sorter = new BubbleSort();

        int[] arr = {4, 1, 3, 9, 7};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        BubbleSort.bubbleSort(arr);
        
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
    
}
