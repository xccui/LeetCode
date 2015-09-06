package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xccui on 9/5/15.
 */
public class Soluction {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        List<Integer> currentList;
        for (int i = 0; i < candidates.length; i++) {
            currentList = new LinkedList<Integer>();
            tryToCombine(resultList, candidates, i, currentList, 0, target);
        }
        return resultList;
    }

    public boolean tryToCombine(List<List<Integer>> resultList, int[] candidates, int index, List<Integer> currentList, int sum, int target) {
        currentList.add(candidates[index]);
        sum += candidates[index];
        //System.out.println(currentList + "\t" + sum);
        if (sum == target) {
            resultList.add(new ArrayList<Integer>(currentList));
        } else if (sum < target) {
            boolean flag = true;
            for (int i = index; i < candidates.length && flag; i++) {
                flag = tryToCombine(resultList, candidates, i, currentList, sum, target);
            }
        }
        currentList.remove(currentList.size() - 1);
        return sum < target;
    }

    public static void main(String args[]) {
       // Solution solution = new Solution();
       // System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
