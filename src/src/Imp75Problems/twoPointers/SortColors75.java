package Imp75Problems.twoPointers;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int low=0;
        int med=0;
        int high=nums.length-1;

        while (med<= high){
            if (nums[med]==0){
                nums[med]=nums[low];
                nums[low]=0;

                low++;
                med++;

            }

            else if (nums[med]==1){
                med++;
            }
            else {
                nums[med]=nums[high];
                nums[high]=2;
                high--;
            }
        }

    }

}
