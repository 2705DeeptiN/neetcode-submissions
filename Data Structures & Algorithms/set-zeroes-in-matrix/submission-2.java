class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        boolean frstrow = false;
        boolean frstcol = false;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                frstcol = true;
                break;
            }
        }

        for (int j = 0; j<m; j++) {
            if (arr[0][j] == 0) {
                frstrow = true;
                break;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            if(arr[i][0]==0){
                for(int j=1;j<m;j++){
                arr[i][j]=0;
            }
        }
        }

        for(int j=1;j<m;j++){
            if(arr[0][j]==0){
                for(int i=1;i<n;i++)
               { arr[i][j]=0;}
            }
        }

        if(frstrow){
            for(int j=0;j<m;j++){
                arr[0][j]=0;
            }
        }

        if(frstcol){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }




    }
}
