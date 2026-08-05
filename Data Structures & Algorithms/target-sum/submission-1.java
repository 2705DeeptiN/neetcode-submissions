class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        //idx,target,sum,nums
        return solve(0,target,0,nums);
    }

    public int solve(int i,int target,int sum,int[]nums){
        if(i==nums.length) {
            if(sum==target) return 1;
        return 0;
        }

        int plus=solve(i+1,target,sum+nums[i],nums);
        int dif=solve(i+1,target,sum-nums[i],nums);

        return plus+dif;

    }
}
