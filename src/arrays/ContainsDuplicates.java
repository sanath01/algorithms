package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by muppallav on 4/5/16.
 * Given an array of integers, find if the array contains any duplicates. Your function should return true
 * if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        } else if (nums.length <= 1) {
            return false;
        } else {
            Set<Integer> mapSet = new HashSet<Integer>();
            for (int i : nums) {
                if (!mapSet.add(i)) {
                    return true;
                }
            }
            return false;
        }
    }
}
