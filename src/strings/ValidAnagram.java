package strings;

/**
 * Created by muppallav on 4/5/16.
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        } else if (s.length() != t.length()) {
            return false;
        } else {
            int[] count = new int[256];
            for (int i = 0; i < s.length(); i++) {
                count[Character.getNumericValue(s.charAt(i))]++;
            }
            for (int i = 0; i < t.length(); i++) {
                count[Character.getNumericValue(t.charAt(i))]--;
                if (count[Character.getNumericValue(t.charAt(i))] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
