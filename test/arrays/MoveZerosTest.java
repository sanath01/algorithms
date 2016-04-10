package arrays;

import org.junit.Test;
import utils.Utils;

/**
 * Created by muppallav on 4/5/16.
 */
public class MoveZerosTest {

    @Test
    public void testMoveZeroes1() throws Exception {
        int[] a = {1, 2, 0, 4, 0, 8};
        Utils.printArray("before moving:", a);
        a = MoveZeros.moveZeroes(a);
        Utils.printArray("before moving:", a);
    }

    @Test
    public void testMoveZeroes2() throws Exception {
        int[] a = {1, 0, 0, 4, 5, 8};
        Utils.printArray("before moving:", a);
        a = MoveZeros.moveZeroes(a);
        Utils.printArray("before moving:", a);
    }
}