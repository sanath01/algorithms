package arrays;

import utils.Utils;

/**
 * Created by muppallav on 2/10/16.
 */
public class Sorting {

    static int[] a = null;

    public static void main(String[] args) {
        a = Utils.generateRandamArray(15);
        quickSort(0, a.length - 1);
    }

    public static void quickSort(int start, int end) {
        if (start > end) {
            return;
        }
        Utils.printArray("Before sort", a);
        int j = partition(start, end);
        // System.out.println("partion Index="+j+" a[partition]="+a[j]);
        quickSort(start, j - 1);
        quickSort(j + 1, end);
        Utils.printArray("After Sort", a);
    }


    public static int partition(int start, int end) {
        int pivot = a[start];
        int first = start;
        while (start < end) {
            while (a[start] <= pivot && start < end) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                //start++;
                //end--;
            }
        }
        int temp = a[first];
        a[first] = a[end];
        a[end] = temp;
        // Utils.printArray(" After partition",a);
        return end;

    }


}
