package validParentheses;

import java.util.LinkedList;

/**
 * Created by xccui on 9/7/15.
 */
public class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> list = new LinkedList<Character>();
        char ch = ' ';
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                list.push(c);
            } else {
                switch (c) {
                    case ')':
                        ch = '(';
                        break;
                    case ']':
                        ch = '[';
                        break;
                    case '}':
                        ch = '{';
                        break;
                }
                if (list.isEmpty() || list.peek().charValue() != ch) {
                    return false;
                }
                list.pop();
            }
        }
        return list.isEmpty();
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{}([])"));
    }
}
