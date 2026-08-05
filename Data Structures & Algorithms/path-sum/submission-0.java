class Solution {
    public boolean hasPathSum(TreeNode root, int target) {
        if (root == null)
            return false;

        return dfs(root, target);
    }

    public boolean dfs(TreeNode root, int target) {
        if (root == null)
            return false;


    target -= root.val;
    
        if (root.left == null && root.right == null)
            return target == 0;
    

        return dfs(root.left, target) || dfs(root.right, target);
    }
}