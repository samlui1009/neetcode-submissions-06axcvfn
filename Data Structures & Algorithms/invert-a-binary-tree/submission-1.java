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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        // This is our edge case - If the root is null itself, then we can simply return
        // the root 
        // The rest of the code will be the actual logic 
        // As mentioned, we need to invert the binary tree and return the root
        // This means that, if we had a three-node binary tree
        // The left subtrees' root should now be the right subtrees' root
        // And vice versa 
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        // This is where the logic for switching the position of the nodes will occur 
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
