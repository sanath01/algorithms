package recurssion;

/**
 * Created by muppallav on 4/10/16.
 * <p>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    /**
     * My initail solution rejected because of exceeded time limit
     * <p>
     * public static int climbStairs(int n) {
     * int num1=0;
     * int num2=0;
     * if(n<0){
     * return 0;
     * }else if(n==0){
     * return 0;
     * }else if(n ==1){
     * return 1;
     * }else{
     * if(n-1==0) {
     * num1 = 1+ climbStairs(n - 1);
     * }else{
     * num1= climbStairs(n - 1);
     * }
     * if(n>=2) {
     * if(n-2==0) {
     * num2 = 1 + climbStairs(n - 2);
     * }else {
     * num2 = climbStairs(n - 2);
     * }
     * }
     * return  num1+num2;
     * }
     * }
     */

    public static int climbStairs(int n) {
        if (n <= 2 && n >= 0) return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
