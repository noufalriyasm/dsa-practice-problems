package Imp75Problems.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueElements=new HashSet<>();

        for (int num:nums){
            if (uniqueElements.contains(num)){
                return true;
            }
            uniqueElements.add(num);
        }
        return false;
    }

    public boolean containsDuplicateSolution2(int[] nums){
        Set<Integer> uniqueElements=new HashSet<>();
        for (int num:nums){
            if (!uniqueElements.add(num)){   // beacuse set.add() return boolean,so we can avoid one step
                return true;
            }
        }
        return false;
    }
}
