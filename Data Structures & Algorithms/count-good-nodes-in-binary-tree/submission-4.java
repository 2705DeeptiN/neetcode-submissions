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
    public int goodNodes(TreeNode root) {
        int c=0;
        Queue<Pair<TreeNode,Integer>>q=new LinkedList<>();
        q.add(new Pair<> (root,Integer.MIN_VALUE));

        while(!q.isEmpty()){
            Pair<TreeNode,Integer> p=q.poll();
            TreeNode n=p.getKey();
            int maxval=p.getValue();
            
            if(n.val>=maxval)c++;

           if(n.left!=null)q.add(new Pair<>(n.left,Math.max(n.val,maxval)));
           if(n.right!=null)q.add(new Pair<>(n.right,Math.max(maxval,n.val)));
        }
          return c;
        
    }
}
