class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=1;
        int maxlen=1;
        if(n==0) return 0;
        for(int i=0;i<n-1;i++){
           
            if(nums[i]+1==nums[i+1])c++;
            else if(nums[i]==nums[i+1])continue;
            else c=1;
        
        maxlen=Math.max(c,maxlen);
        }
        return maxlen;
    }
}
