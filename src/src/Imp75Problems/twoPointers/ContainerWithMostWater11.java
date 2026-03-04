package Imp75Problems.twoPointers;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {

        int maxArea=0;

        int left=0;
        int right=height.length-1;

        while (left<=right){
            int min_height=Math.min(height[left],height[right]);
            int width=right-left;

            int area=width*min_height;
            maxArea=Math.max(maxArea,area);

            if (height[left]<=height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
