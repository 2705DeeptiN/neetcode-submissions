class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

List<Integer>ans=new ArrayList<>();
        int minc = 0, minr = 0, maxr = m - 1, maxc = n - 1;

        while (minc <= maxc && minr <= maxr) {
            // left to ryt
            // i const minr
            if (minr <= maxr) {
                for (int j = minc; j <= maxc; j++) {
                    ans.add(arr[minr][j]);
                }
                minr++;
            }

            // top to bottom
            // j const maxc

            if (minc <= maxc) {
                for (int i = minr; i <= maxr; i++) {
                    ans.add(arr[i][maxc]);
                }
                maxc--;
            }

            // ryt to left
            // row const maxr
            if (minr <= maxr && minc <= maxc) {
                for (int j = maxc; j>=minc; j--) {
                    ans.add(arr[maxr][j]);
                }
                maxr--;
            }

            // bottom to up
            // col j const minc
            if (minr <= maxr && minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    ans.add(arr[i][minc]);
                }
                minc++;
            }
        }
        return ans;
    }
    }
