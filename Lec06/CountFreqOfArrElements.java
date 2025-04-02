import java.util.*;

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        
        List<Integer> freq = new ArrayList<>();
        for( int i=0 ; i<n ; i++){
            freq.add(0);
        }
        
        for(int num : arr){
            if(num >= 1 && num <= n){
                freq.set(num-1,freq.get(num-1)+1);
            }
        }
        
        return freq;
        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 3, 2, 3, 5};
        System.out.println(sol.frequencyCount(arr)); 
    }
}

