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
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>li=new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode rm=null;
            int qlen=q.size();
            for(int i=0;i<qlen;i++){
            TreeNode n=q.poll();
            if(root!=null){rm=n;
            if(n.left!=null)q.add(n.left);
            if(n.right!=null)q.add(n.right);
            }}
            if(rm!=null){
            li.add(rm.val);
        }
        }
        return li;        

    }
}
