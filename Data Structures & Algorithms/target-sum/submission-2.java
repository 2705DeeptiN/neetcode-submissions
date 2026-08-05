class Solution {
    HashMap<String,Integer>map=new HashMap<>();

    public int findTargetSumWays(int[] nums, int target) {
        //nums,trgt,idx,sum
        return solve(nums,target,0,0);
    }

    public int solve(int[]nums,int target,int i,int sum){
        if(i==nums.length){
            return sum==target?1:0;
        }
        //in key v store wt is current idex and sum fr tht 
        String key= i+","+sum;

        if(map.containsKey(key))return map.get(key);

        int plus=solve(nums,target,i+1,sum+nums[i]);
        int minus=solve(nums,target,i+1,sum-nums[i]);

        map.put(key,plus+minus);

        return map.get(key);

    }
}
