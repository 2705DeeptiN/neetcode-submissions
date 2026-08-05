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

  public boolean issame(TreeNode p, TreeNode q) {
        if(p==null&& q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val)return false;
        if(issame(p.right,q.right) && issame(p.left,q.left)) return true;
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode sub) {
        if (sub == null)
            return true;

        if (root == null)
            return false;

        if (issame(root,sub)) return true;

        return isSubtree(root.right, sub) || isSubtree(root.left, sub);
    }
}
