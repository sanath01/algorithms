package recurssion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by muppallav on 4/10/16.
 */
public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() throws Exception {
        int result = ClimbingStairs.climbStairs(3);
        assertEquals(result, 3);
        result = ClimbingStairs.climbStairs(5);
        assertEquals(result, 8);
        result = ClimbingStairs.climbStairs(44);
        System.out.println(result);
    }
}