class Solution {
    public void dfs(int[][] img, int i, int j,int oldcol, int newcol){

        if(i<0|| j<0|| i>=img.length || j>=img[0].length || img[i][j]!=oldcol) return;

        img[i][j]=newcol;

        dfs(img,i-1,j,oldcol,newcol);
         dfs(img,i+1,j,oldcol,newcol);
          dfs(img,i,j-1,oldcol,newcol);
           dfs(img,i,j+1,oldcol,newcol);
    }




    public int[][] floodFill(int[][] img, int sr, int sc, int newcol) {
        int oldcol=img[sr][sc];

        if(oldcol==newcol) return img;

        dfs(img,sr,sc,oldcol,newcol);

        return img;
    }
}