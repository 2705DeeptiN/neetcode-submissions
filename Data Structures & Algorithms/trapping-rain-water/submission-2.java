class Solution {
    public int trap(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int lmax=arr[l];
        int rmax=arr[r];
        int res=0;

        while(l<r){
          if(lmax<rmax){
            l++;
            lmax=Math.max(lmax,arr[l]);
            res+=lmax-arr[l];
          }
          else{
            r--;
            rmax=Math.max(rmax,arr[r]);
            res+=rmax-arr[r];
          }
        }
        return res;
    }
}
