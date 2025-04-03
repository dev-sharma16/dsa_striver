import java.util.Arrays;

public class FreqOfMstFreqElement {
    public int maxFrequency(int[] nums, int k) {
        
       Arrays.sort(nums); 
        int left = 0; 
        int totalOperations = 0; 
        int maxFreq = 1; 

        for (int right = 1; right < nums.length; right++) {
            
            totalOperations += (nums[right] - nums[right - 1]) * (right - left);

            
            while (totalOperations > k) {
                totalOperations -= (nums[right] - nums[left]);
                left++; 
            }

            
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;

    }

    public static void main(String[] args) {
        FreqOfMstFreqElement sol = new FreqOfMstFreqElement();
        int[] arr = {1,4,8,13};
        int k = 5;
        System.out.println(sol.maxFrequency(arr, k));

    }
}