class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int[]res=new int[nums.length];
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zero++;
        }
        if(zero>=2){
        Arrays.fill(res,0);
        return res;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)pro*=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
        if(zero==1){
            if(nums[i]==0) res[i]=pro;
            else res[i]=0;
        } else {
            res[i]=pro/nums[i];
        }
    }
        return res;
    }

}  
