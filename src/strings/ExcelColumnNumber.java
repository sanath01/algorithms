package strings;

/**
 * Created by muppallav on 4/5/16.
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class ExcelColumnNumber {

    public static int titleToNumber(String s) {
        int result = 0;
        if (s == null) {
            return -1;
        } else {
            s = s.toUpperCase();
            int len = s.length();
            int val = 1;
            for (int i = len - 1; i >= 0; i--) {
                result = val * getCharValue(s.charAt(i)) + result;
                val = val * 26;

            }
        }
        return result;
    }

    private static int getCharValue(char c) {
        return c - 'A' + 1;
    }
}
