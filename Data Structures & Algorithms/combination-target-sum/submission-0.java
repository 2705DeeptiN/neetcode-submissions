class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        dfs(0,target,nums,res,temp);
        return res;

    }

    public void dfs(int i,int t,int[]nums, List<List<Integer>>res, List<Integer>temp){
        if(i==nums.length){
            if(t==0) {
                res.add(new ArrayList<>(temp));
             } return;
        }

        if(t<0) return;

        //pick
        temp.add(nums[i]);
        dfs(i,t-nums[i],nums,res,temp);
        temp.remove(temp.size()-1);

        dfs(i+1,t,nums,res,temp);
    }
}

