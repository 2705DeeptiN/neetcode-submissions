class Solution {
    public int maxProfit(int[] arr) {
        int l=0;
        int r=1;
        int maxp=0;
        int n=arr.length;

        while(r<n){
        if(arr[r]>arr[l]){
            maxp=Math.max(maxp,arr[r]-arr[l]);
        }
        else{
            l=r;
          }  r++;
        }
        return maxp;
    }
}
