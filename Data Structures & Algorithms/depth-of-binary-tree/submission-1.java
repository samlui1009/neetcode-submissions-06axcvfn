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
    public int maxDepth(TreeNode root) {
        // Notably, we are going to be returning an Integer value here 
        // Again, with trees, also consider the edge case that the root is 
        // Going to be null 
        int res = 0;
        if (root == null) {
            return res;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
