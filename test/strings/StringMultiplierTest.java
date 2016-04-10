package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by muppallav on 3/21/16.
 */
public class StringMultiplierTest {

    @Test
    public void testMultiply() throws Exception {
        String result = StringMultiplier.multiply("123456789", "987654321");
        assertEquals(result, "121932631112635269");
        result = StringMultiplier.multiply("9", "9");
        assertEquals(result, "81");
    }
}