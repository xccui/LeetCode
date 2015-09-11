package majorityElement;

/**
 * Created by xccui on 9/7/15.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int element = 0, num = 0;
        for (int i : nums) {
            if (num == 0) {
                element = i;
            }
            if (element == i) {
                num++;
            } else {
                num--;
            }
        }
        return element;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3,3,4}));
    }
}
