class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=findmax(piles);

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            long toth=calcu(piles,mid);

            if(toth<=h) hi=mid-1;
            else lo=mid+1;
        }
        return lo;
    }

    public int findmax(int[]arr){
        int maxx=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            maxx=Math.max(maxx,arr[i]);
        }
        return maxx;
    }

    public long calcu(int[]arr,int k){
        long toth=0;

        for(int i=0;i<arr.length;i++){
            toth+=(long)Math.ceil((double)arr[i]/k);
        }
        return toth;
    }
}