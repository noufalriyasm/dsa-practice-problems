package Imp75Problems.slidingWindow;

public class MinimumSizeSubarraySum209 {
    public int minimumSizeSubArrayBruteForce(int[] nums,int target){

        int count=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            int sum=0;
            for (int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if (sum>=target){
                    count=Math.min(count,j-i+1);
                    break;
                }
            }
        }
        return count==Integer.MAX_VALUE ?0:count;
    }

    public int minSubArrayLen(int target, int[] nums){
        int left=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;

        for (int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                minLength=Math.min(minLength,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
