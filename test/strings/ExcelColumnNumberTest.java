package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by muppallav on 4/5/16.
 */
public class ExcelColumnNumberTest {

    @Test
    public void testTitleToNumber() throws Exception {
        int val = ExcelColumnNumber.titleToNumber("AA");
        assertEquals(val, 27);
        val = ExcelColumnNumber.titleToNumber("CAB");
        assertEquals(val, 2056);
        val = ExcelColumnNumber.titleToNumber("Z");
        assertEquals(val, 26);
        val = ExcelColumnNumber.titleToNumber("");
        assertEquals(val, 0);
    }
}