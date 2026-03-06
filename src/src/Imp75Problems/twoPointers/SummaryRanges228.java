package Imp75Problems.twoPointers;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if (nums.length==0){
            return result;
        }
        int left=0;
        for (int right=1;right< nums.length;right++){
            if(nums[right]!=nums[right-1]+1){
                if(left==right-1){
                    result.add(String.valueOf(nums[left]));
                }
                else {
                    result.add(nums[left]+"->"+nums[right-1]);
                }
            }
            left=right;
        }
        if(left==nums.length-1){
            result.add(String.valueOf(nums[left]));
        }
        else {
            result.add(nums[left]+"->"+nums[nums.length-1]);
        }

        return result;
    }

    public List<String> summaryRangesSecondMethod(int[] nums){

        List<String> result=new ArrayList<>();

        if(nums.length==0){
            return result;
        }

        int i=0;
        while (i< nums.length){
            int start=i; int end=i;
            while(end+1<nums.length&&nums[end]+1==nums[end+1]){
                end++;
            }
            if (start==end){
                result.add(String.valueOf(nums[start]));
            }
            else {
                result.add(nums[start]+"->"+nums[end]);
            }

            i=end+1;
        }
        return result;
    }
}
