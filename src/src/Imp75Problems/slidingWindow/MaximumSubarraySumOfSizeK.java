package Imp75Problems.slidingWindow;

public class MaximumSubarraySumOfSizeK {
    public int maxSubArraySum(int[] nums,int k) {

        int windowSum=0;
        for (int i=0;i<k;i++){
            windowSum=windowSum+nums[i];
        }
        int max_sum=windowSum;

        for (int j=k;j<nums.length;j++){
            windowSum=windowSum+nums[j];
            windowSum=windowSum-nums[j-k];

            max_sum=Math.max(windowSum,max_sum);
        }
        return max_sum;

    }
}
