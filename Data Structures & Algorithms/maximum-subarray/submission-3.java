class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int[] prefix = new int[n];

        prefix[0]=nums[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                int sum;

                if(i==0)
                    sum=prefix[j];
                else
                    sum=prefix[j]-prefix[i-1];

                ans=Math.max(ans,sum);
            }
        }

        return ans;
    }
}