class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length;
        int m=arr[0].length;

        int r=0;
        int c=m-1;

        while(r<n && c>=0){
            if(arr[r][c]==target) return true;
            else if (arr[r][c]>target) c-=1;
            else r+=1;
        }
        return false;
    }
}
