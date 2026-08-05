class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        if(arr==null || n==0)return 0;
        int[]pre=new int[n];
        int[]suf=new int[n];
        
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],arr[i]);
        }

        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],arr[i]);
        }

          int res=0;
          for(int i=0;i<n;i++){
            res+=Math.min(pre[i],suf[i])-arr[i];
          }
        
        return res;
    }
}
