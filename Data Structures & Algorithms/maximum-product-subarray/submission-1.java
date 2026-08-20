class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int curmx=1;
        int curmin=1;

        for(int ele:nums){
            int temp=curmx*ele;

            curmx=Math.max(curmx*ele,Math.max(ele,ele*curmin));

            curmin=Math.min(curmin*ele,Math.min(ele,temp));

            res=Math.max(res,curmx);
        }
        return res;

    }
}
