class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;

        while(i<n-1){
            if(nums[i]==nums[i+1]) i+=2;
            else return nums[i];
        }
    return nums[i];
    }
}
