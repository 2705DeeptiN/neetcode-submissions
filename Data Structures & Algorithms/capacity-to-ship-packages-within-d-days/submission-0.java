class Solution {
    public int shipWithinDays(int[] arr, int d) {
        int lo = 0;
        int hi = 0;

        for (int ele : arr) {
            lo = Math.max(lo, ele);
            hi += ele;
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            int days=finddays(arr,mid);

            if(days<=d){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
    public int finddays(int[] arr,int capacity){
        int d=1;
        int load=0;

        for(int ele:arr){
            if(load+ele>capacity){
                d=d+1;
                load=ele;
            }
            else load+=ele;
        }
        return d;
    }
}