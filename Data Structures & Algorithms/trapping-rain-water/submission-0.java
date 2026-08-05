class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        if(arr==null || n==0)return 0;

        int res=0;

        for(int i=0;i<n;i++){
            int lmax=arr[i];
            int rmax=arr[i];

            for(int j=0;j<i;j++){
                lmax=Math.max(lmax,arr[j]);
            }
            for(int j=i+1;j<n;j++){
                rmax=Math.max(rmax,arr[j]);
            }
            res+=Math.min(lmax,rmax)-arr[i];
        }
        return res;
    }
}
