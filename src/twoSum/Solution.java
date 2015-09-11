package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xccui on 9/7/15.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]) + 1, i + 1};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
    }
}