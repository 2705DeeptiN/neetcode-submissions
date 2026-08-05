class Solution {
    public int maxProfit(int[] arr) {

        //this is using dp - o(n)

        int maxp=0;
        int minbuy=arr[0];

        for(int ele:arr){
            maxp=Math.max(maxp,ele-minbuy);
            minbuy=Math.min(minbuy,ele);
        }
        return maxp;
    }
}
