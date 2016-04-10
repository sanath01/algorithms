package arrays;

/**
 * Created by muppallav on 4/5/16.
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0]
 */
public class MoveZeros {
    public static int[] moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
        return nums;
    }
}
