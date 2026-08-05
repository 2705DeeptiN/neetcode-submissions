class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int cur=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int area=(Math.min(arr[i],arr[j]))*(j-i);
                int max=Math.max(area,cur);
                cur=max;
            }
        }
        return cur;
    }
}
