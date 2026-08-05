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
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();

        if(root==null)return ans;

        q.add(root);
        while(!q.isEmpty()){
            TreeNode ryt=null;
            int s=q.size();

            for(int i=0;i<s;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                ryt=cur;

            }
            ans.add(ryt.val);
        }
        return ans;
    }
}
