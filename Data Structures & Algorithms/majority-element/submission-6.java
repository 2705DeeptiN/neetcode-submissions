class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int candi=nums[0];

        for(int ele:nums){
            if(c==0) candi=ele;
            if(candi==ele)c++;
            else c--;
        }
        return candi;
    }
}
