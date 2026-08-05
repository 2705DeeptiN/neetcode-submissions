class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //brute force

        int n=nums.length;
        int[]out=new int[n-k+1];

        for(int i=0;i<=n-k;i++){
            int maxi=nums[i];
            for(int j=i;j<i+k;j++){
                maxi=Math.max(maxi,nums[j]);
            }
            out[i]=maxi;
        }
        return out;
    }
}
