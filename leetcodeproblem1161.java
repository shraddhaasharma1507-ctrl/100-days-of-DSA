/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        List<Integer> sums = new ArrayList<>();
        dfs(root, 1, sums);

        int max = Integer.MIN_VALUE;
        int res = 1;

        for (int i = 0; i < sums.size(); i++) {
            if (sums.get(i) > max) {
                max = sums.get(i);
                res = i + 1;
            }
        }

        return res;
    }

    private void dfs(TreeNode node, int lvl, List<Integer> sums) {
        if (node == null) {
            return;
        }

        if (lvl > sums.size()) {
            sums.add(node.val);
        } else {
            sums.set(lvl - 1, sums.get(lvl - 1) + node.val);
        }

        dfs(node.left, lvl + 1, sums);
        dfs(node.right, lvl + 1, sums);
    }
}