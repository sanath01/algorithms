package arrays;

/**
 * Created by muppallav on 4/5/16.
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    //Moores voting method
    public static int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0)
                majority = num;
            if (num == majority)
                count++;
            else
                count--;
        }
        return majority;
    }
}
