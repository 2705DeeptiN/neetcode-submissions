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
    public boolean isSubtree(TreeNode root, TreeNode subr) {
        if(subr==null) return true;
        if(root==null)return false;

        if(sametree(root,subr))return true;

        return isSubtree(root.left,subr) || isSubtree(root.right,subr);
    }
    public boolean sametree(TreeNode p,TreeNode q){
        
        if(p==null && q==null) return true;
        

        if(p!=null && q!=null && p.val==q.val){
       return  sametree(p.left,q.left) && sametree(p.right,q.right);
        }
        return false;


    }
}
