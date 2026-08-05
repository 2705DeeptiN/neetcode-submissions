class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length && i!=j;j++){
               
                    if(nums[i]+nums[j]==target){
                        ans[0]=Math.min(i,j);
                        ans[1]=Math.max(i,j);
                                }
        }
    }
    return ans;
}
}