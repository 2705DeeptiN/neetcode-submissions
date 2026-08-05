class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];

        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    pro*=nums[j];
                }
            }
            res[i]=pro;
        }
        return res;
    }
}  
