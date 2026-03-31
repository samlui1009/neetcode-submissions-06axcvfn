/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if (root == nullptr) {
            return root;
            // Base case, do nothing if the root is NULL
        }
        TreeNode* temp = root->left;
        // Create a local variable, where we store the left child
        root->left = root->right;
        // Reassignment
        root->right = temp;
        // Reassignment
        invertTree(root->left);
        // Run the function recursively
        invertTree(root->right);
        // Run the function recursively on the right side of the tree
        return root;
        // Finally, return the root
    }
};
