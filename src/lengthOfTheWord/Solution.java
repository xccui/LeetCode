package lengthOfTheWord;

/**
 * Created by xccui on 9/7/15.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        String ss = s.trim();
        int position = ss.lastIndexOf(" ");
        if (position >= 0) {
            return ss.length() - (position + 1);
        } else {
            return ss.length();
        }
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("word ww "));
    }
}
