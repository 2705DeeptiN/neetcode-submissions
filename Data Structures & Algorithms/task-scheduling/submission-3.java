class Solution {
    public int leastInterval(char[] tasks, int n) {
        int maxf=0;
        int[]freq=new int[26];

        for(char c:tasks){
            freq[c-'A']++;
        }

        for(int f:freq){
            maxf=Math.max(f,maxf);
        }
int same=0;
        for(int f:freq){
            if(f==maxf) same++;
        }

        int ans=(maxf-1)*(n+1)+same;

        return Math.max(ans,tasks.length);
    }
}
