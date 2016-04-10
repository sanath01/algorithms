package arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by muppallav on 4/5/16.
 */
public class ContainsDuplicatesTest {

    @Test
    public void testContainsDuplicate() throws Exception {
        int[] a = {1, 2, 3, 4, 5};
        boolean result = ContainsDuplicates.containsDuplicate(a);
        assertTrue(result);
    }
}