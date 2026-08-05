class Solution {
    public int maxProfit(int[] arr) {
        //brute force o(n^2)
        //calculate for all the possible pairs and then return maximun
        int n=arr.length;
        int maxp=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int pro=arr[j]-arr[i];
                maxp=Math.max(pro,maxp);
            }
        }
        return maxp;
    }
}
