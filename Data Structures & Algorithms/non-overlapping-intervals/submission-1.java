class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int n=arr.length;

Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int prev=arr[0][1];
        int c=0;

        for(int i=1;i<n;i++){
            int s=arr[i][0];
            int e=arr[i][1];

            if(s<prev){
                c++;
                prev=Math.min(e,prev);
            }
            else{
                prev=e;
            }
        }
        return c;
    }
}
