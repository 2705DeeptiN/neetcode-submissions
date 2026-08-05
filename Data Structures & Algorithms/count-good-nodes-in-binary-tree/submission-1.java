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

class Solution 
{int c=0;
    void dfs(TreeNode node,int maxsofar){
       if(node==null)return;
       
       if(node.val>=maxsofar)c++;

        
        maxsofar=Math.max(maxsofar,node.val);
        dfs(node.left,maxsofar);
        dfs(node.right,maxsofar);

    }
    public int goodNodes(TreeNode root) {
        if (root==null)return 0;
        dfs(root,root.val);
        return c;
    }
}
