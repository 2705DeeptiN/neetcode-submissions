class Solution {
    public int jump(int[] nums) {
     int n=nums.length;
     int end=0;
     int far=0;
     int jumps=0;

     for(int i=0;i<n;i++){
        far = Math.max(far, i + nums[i]);
        if (i == end && i < n - 1){
            jumps++;
            end=far;
        }
        
     } 
     return jumps;  
    }
}
