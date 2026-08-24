class Solution {
    public int leastInterval(char[] tasks, int n) {
        int m = tasks.length;
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }
        int maxf = 0;
        for (int f : freq) {
            maxf = Math.max(f, maxf);
        }
        int samenum = 0;
        for (int f : freq) {
            if (f == maxf)
                samenum++;
        }
        int ans = (maxf - 1)*(n+1)+samenum;

        return Math.max(ans,tasks.length);
    }
}
