package utils;

/**
 * Created by muppallav
 */
public class Utils {

    public static int[] swapElementsInArray(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

    public static void printArray(String message, int[] a) {
        System.out.println(message == null ? "" : message);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] generateRandamArray(int size) {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        return a;
    }

}
