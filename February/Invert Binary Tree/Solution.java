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
        recursive(root);
        return root;
    }
    public void recursive(TreeNode root){
        if(root == null){
            return;
        }else{
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
        recursive(root.left);
        recursive(root.right);

    }
}