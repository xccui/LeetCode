package grayCode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xccui on 9/11/15.
 */
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new LinkedList<Integer>();
        result.add(0);
        if (0 == n) {
            return result;
        }
        result.add(1);
        int size;
        for (int i = 1; i < n; i++) {
            size = result.size() - 1;
            for (int j = size; j >= 0; j--) {
                result.add(result.get(j) | 1 << i);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.grayCode(6));
    }
}
