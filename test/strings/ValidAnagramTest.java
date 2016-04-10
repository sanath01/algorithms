package strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by muppallav on 4/5/16.
 */
public class ValidAnagramTest {

    @Test
    public void testIsAnagram() throws Exception {
        assertTrue(ValidAnagram.isAnagram("", ""));
        assertTrue(ValidAnagram.isAnagram("abcd", "cdba"));
        assertFalse(ValidAnagram.isAnagram("abc", ""));
        assertFalse(ValidAnagram.isAnagram("abc", "aaa"));
    }

}