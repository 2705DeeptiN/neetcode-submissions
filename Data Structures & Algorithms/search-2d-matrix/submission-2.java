class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
         int n = arr.length;
        int m = arr[0].length;

        int l=0;
        int r=n*m-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            int row=mid/m;
            int col=mid%m;

            if(arr[row][col]<target)l=mid+1;
            else if(arr[row][col]>target) r=mid-1;
            else return true;
        }
        return false;
    }
}
