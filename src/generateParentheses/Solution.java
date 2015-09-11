package generateParentheses;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xccui on 9/9/15.
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        generate(result, "(", 1, n - 1, n * 2);
        return result;
    }

    public void generate(List<String> result, String str, int m, int n, int size) {
        if (str.length() == size) {
            result.add(str);
        } else {
            if (n > 0) {
                generate(result, str + "(", m + 1, n - 1, size);
            }
            if (m > 0) {
                generate(result, str + ")", m - 1, n, size);
            }
        }
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(4));
    }
}
