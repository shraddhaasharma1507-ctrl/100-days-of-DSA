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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        int maxWidth = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();
        
        nodeQueue.offer(root);
        indexQueue.offer(0);
        
        while (!nodeQueue.isEmpty()) {
            int levelSize = nodeQueue.size();
            int firstIndex = indexQueue.peek();
            int lastIndex = firstIndex;
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = nodeQueue.poll();
                int index = indexQueue.poll() - firstIndex;
                lastIndex = index;
                
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    indexQueue.offer(2 * index);
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    indexQueue.offer(2 * index + 1);
                }
            }
            
            maxWidth = Math.max(maxWidth, lastIndex + 1);
        }
        
        return maxWidth;
    }
}