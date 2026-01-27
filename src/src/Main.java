import array.Array;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] twoSumIndexArray= Array.twoSum(new int[]{2,11,7,15},9);
        System.out.println(Arrays.toString(twoSumIndexArray));
    }
}