package Imp75Problems.slidingWindow;

public class SubarrayProductLessthanK713 {
    public int subArray(int[] nums,int k){
        int left=0;
        int product=1;
        int count=0;

        if (k<=1){
            return 0;
        }

        for (int right=0;right<nums.length;right++){

            product *=nums[right];

            while (product>=k){
                product /=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }

    public int subArrayBruteForce(int[] nums,int k){
        int product=1;
        int count=0;

        if (k<=1){
            return 0;
        }

        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                product*=nums[j];

                if (product<100){
                    count +=1;

                }
                else {
                    break;
                }
            }
        }
        return count;

    }
}
