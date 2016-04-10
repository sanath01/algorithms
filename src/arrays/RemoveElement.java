package arrays;

/**
 * Created by muppallav on 4/10/16.
 * <p>
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i : nums) {
            if (i != val) {
                nums[count] = i;
                count = count + 1;
            }
        }
        return count;
    }
}
