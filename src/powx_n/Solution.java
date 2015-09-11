package powx_n;

/**
 * Created by xccui on 9/8/15.
 */
public class Solution {
    public double myPow(double x, int n) {
        if (x == 1) {
            return 1;
        } else if (x == -1) {
            return n % 2 == 0 ? 1 : -1;
        } else if (n == 1) {
            return x;
        } else if (n == -1) {
            return 1 / x;
        } else if (n == 0) {
            return 1;
        }
        int m = n > 0 ? n : -n;
        double result = 1;
        while (m >= 1) {
            result *= (m % 2 == 1 ? x : 1);
            x = x * x;
            m >>= 1;
        }
        return (n > 0 ? result : 1 / result);
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(8.88023, 3));
    }

}
