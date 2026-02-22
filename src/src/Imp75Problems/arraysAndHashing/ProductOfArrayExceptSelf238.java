package Imp75Problems.arraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf238 {

    public int[] productExceptSelfBruteForce(int[] nums) {
        int[] output=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int product=1;
            for (int j=0;j<nums.length;j++){

                if (i==j){
                    continue;
                }
                product=product*nums[j];
            }
            output[i]=product;
        }
        return output;
    }

    // here the concept is elements left side * elements rights side
    /**
     example [1,2,3,4]
     left of 1, there is no element so take it as 1,
     left of 2 -- 1
     left of 3 -- 1*2=2
     left of 4 -- 1*2*3=6

     right of 4 -- there is no element on right ,so take as 1;
     right of 3-- 4;
     right of 2 -- 3*4=12;
     right of 1 -- 2*3*4 = 24

     left * right will give the result
     [1,1,2,6] * [24,12,4,1] = [24,12,8,6]
     */

    public int[] productExceptSelfUsingThreeArray(int[] nums){
        int n=nums.length;
        int[] left= new int[n];
        int[] right=new int[n];
        int[] result=new int[n];

        // left array
        left[0]=1; // there is no element on left of first index
        for (int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        //right array
        right[n-1]=1; // there is no element after last element

        for (int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        //multiply left and right

        for (int i=0;i<n;i++){
            result[i]=left[i]*right[i];
        }

        return result;

    }

    public int[] productExceptSelfUsingSameArray(int[] nums){
        int n=nums.length;
        int[] result=new int[n];

        result[0]=1;
        for (int i =1;i<n;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int right=1;

        for (int i=n-1;i>=0;i--){
            result[i]=result[i]*right;
            right=right*nums[i];
        }
        return result;
    }
}
