class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int min=1;
        int max=1;

        for(int ele:nums){
            int temp=max*ele;

            max=Math.max(ele,Math.max((ele*max),ele*min));
            min=Math.min(ele,Math.min(temp,ele*min));

            res=Math.max(res,max);
        }
        return res;
}}
