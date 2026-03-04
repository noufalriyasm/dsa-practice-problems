package Imp75Problems.slidingWindow;

public class MaximumConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;

        for (int num:nums){
            if (num==1){
                count++;
            }
            else {
                maxCount=Math.max(count,maxCount);
                count=0;

            }
        }
        return Math.max(count,maxCount);
    }
}
