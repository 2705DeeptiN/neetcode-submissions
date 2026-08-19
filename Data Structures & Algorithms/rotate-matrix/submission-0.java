class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        int[][]rot=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rot[j][n-1-i]=arr[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=rot[i][j];
            }
        }
    }
}
