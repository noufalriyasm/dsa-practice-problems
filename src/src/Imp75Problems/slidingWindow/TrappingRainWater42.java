package Imp75Problems.slidingWindow;

public class TrappingRainWater42 {
    public int trapBruteForce(int[] height) {
        int total_water=0;
        for (int i=0;i<height.length;i++){

            int left_max=0;
            int right_max=0;

            for (int j=0;j<=i;j++){
                left_max=Math.max(left_max,height[j]);
            }
            for (int k=i;k<height.length;k++){
                right_max=Math.max(right_max,height[k]);
            }

            int min_height=Math.min(left_max,right_max);

            total_water +=min_height-height[i];
        }
        return total_water;
    }

    public int trap(int[] height){
        int total_water=0;
        int left=0;
        int right=height.length-1;

        int leftMax=height[left];
        int rightMax=height[right];

        while (left<rightMax){
            if (leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,height[left]);
                total_water +=leftMax - height[left];
            }
            else {
                right--;
                rightMax=Math.max(rightMax,height[right]);
                total_water += rightMax-height[right];
            }
        }
        return total_water;
    }
}
