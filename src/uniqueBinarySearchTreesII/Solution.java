package uniqueBinarySearchTreesII;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xccui on 9/6/15.
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[][] nodes = new LinkedList[n + 2][];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new LinkedList[n + 2];
        }
        generate(nodes, 1, n);
        if (nodes[1][n].size() == 0) {
            nodes[1][n].add(null);
        }
        return nodes[1][n];
    }

    public void generate(List<TreeNode>[][] nodes, int a, int b) {
        nodes[a][b] = new LinkedList<TreeNode>();
        if (a == b) {
            nodes[a][b].add(new TreeNode(a));
        } else {
            for (int k = a; k <= b; k++) {
                if (null == nodes[a][k - 1]) {
                    generate(nodes, a, k - 1);
                }
                if (null == nodes[k + 1][b]) {
                    generate(nodes, k + 1, b);
                }
                if (nodes[a][k - 1].size() == 0) {
                    for (TreeNode r : nodes[k + 1][b]) {
                        TreeNode node = new TreeNode(k);
                        node.right = r;
                        nodes[a][b].add(node);
                    }
                } else if (nodes[k + 1][b].size() == 0) {
                    for (TreeNode l : nodes[a][k - 1]) {
                        TreeNode node = new TreeNode(k);
                        node.left = l;
                        nodes[a][b].add(node);
                    }
                } else {
                    for (TreeNode l : nodes[a][k - 1]) {
                        for (TreeNode r : nodes[k + 1][b]) {
                            TreeNode node = new TreeNode(k);
                            node.left = l;
                            node.right = r;
                            nodes[a][b].add(node);
                        }
                    }
                }
            }
        }
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.generateTrees(5));
    }

}
