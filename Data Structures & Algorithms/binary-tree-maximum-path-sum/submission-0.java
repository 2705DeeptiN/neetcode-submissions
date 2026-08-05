class Solution {
    int maxx=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxx;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        
        int left=Math.max(0,dfs(root.left));
        int ryt=Math.max(0,dfs(root.right));

        maxx=Math.max(maxx,root.val+left+ryt);

        return root.val+Math.max(left,ryt);
    }
}
