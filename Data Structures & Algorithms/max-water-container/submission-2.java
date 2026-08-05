class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=n-1;
        int cur=0;
       while(l<r){
                int area=(Math.min(arr[l],arr[r]))*(r-l);
                cur=Math.max(area,cur);
                
//if left side small bar then go to next one because it can give more area
                if(arr[l]<=arr[r]){
                    l++;
                }else r--;
            }
        
        return cur;
    }
}
