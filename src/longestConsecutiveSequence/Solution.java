package longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xccui on 9/12/15.
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            set.add(i);
        }
        int max = 1;
        int l = set.iterator().next();
        int r = l;
        int n = 1;
        set.remove(l);
        while (!set.isEmpty()) {
            if (set.remove(l - 1)) {
                l--;
                n++;
            } else if (set.remove(r + 1)) {
                r++;
                n++;
            } else {
                max = Math.max(max, n);
                l = set.iterator().next();
                r = l;
                set.remove(r);
                n = 1;
            }
        }
        return Math.max(max, n);
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(new int[] {1, 100, 200, 3, 2}));
    }
}
