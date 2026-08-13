class Solution {
    public int[][] insert(int[][] old, int[] neww) {
        int n=old.length;

        List<int[]>ans=new ArrayList<>();
int i=0;
        while(i<n && old[i][1]<neww[0]){
            ans.add(old[i]);
            i++;
        }
        while(i<n && old[i][0]<=neww[1]){
            neww[0]=Math.min(neww[0],old[i][0]);
            neww[1]=Math.max(neww[1],old[i][1]);
            i++;
        }
        ans.add(neww);

        while(i<n){
            ans.add(old[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
