import array.LongestCommonPrefix;
import array.RemoveElement;
import array.TwoSum;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] twoSumIndexArray= TwoSum.twoSum(new int[]{2,11,7,15},9);
        System.out.println("Two sum : "+Arrays.toString(twoSumIndexArray));

        String longestCommonPrefix= LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println("Longest common prefix : "+longestCommonPrefix);

        String longestCommonPrefixUsingStartsWith= LongestCommonPrefix.longestPrefixUsingStartsWith(new String[]{"flower","flight","flow"});
        System.out.println("Longest common prefix : "+longestCommonPrefixUsingStartsWith);

        int unRemovedElement= RemoveElement.removeElement(new int[]{3,2,2,3},3);
        System.out.println("Unremoved element : "+unRemovedElement);


    }
}