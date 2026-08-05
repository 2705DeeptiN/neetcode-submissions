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
    public int levels(TreeNode root){
        if(root==null)return 0;
        return Math.max(levels(root.right),levels(root.left))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;

        int diff=Math.abs(levels(root.right)-levels(root.left));
        if(diff>1) return false;
        
        return isBalanced(root.right)&& isBalanced(root.left);

    }
}
