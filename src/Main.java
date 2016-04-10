import java.util.Calendar;

public class Main {

    private static long endTimeStamp, currentTimeStamp;
    private static Long longVal;
    private static int bucketIndex, hashVal;

    public static void main(String[] args) {
        calculateHashCode(19);
    }

    public static void calculateHashCode(int bucketSize) {
        int[] hashBucket = new int[bucketSize];
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, 24);
        endTimeStamp = cal.getTimeInMillis();
        currentTimeStamp = System.currentTimeMillis();
        while (currentTimeStamp < endTimeStamp) {
            longVal = currentTimeStamp;
            hashVal = longVal.intValue();
            bucketIndex = (hashVal < 0 ? -hashVal : hashVal) % bucketSize;
            printCurrentVals();
            hashBucket[bucketIndex]++;
            currentTimeStamp++;
        }
        for (int i = 0; i < bucketSize; i++) {
            System.out.println(String.format("bucket[%d]=%d", i, hashBucket[i]));
        }
    }

    public static void printCurrentVals() {
        // System.out.println("hashCode= "+hashVal +", bucketIndex= " + bucketIndex );
    }
}
