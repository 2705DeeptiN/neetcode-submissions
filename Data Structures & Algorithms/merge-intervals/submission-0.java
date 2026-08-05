class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ans.add(intervals[0]);
        for (int[] inter : intervals) {
            int s = inter[0];
            int l = inter[1];
            int lend = ans.get(ans.size() - 1)[1]; // fetched last elent of merged interval

            if (s <= lend) {
                ans.get(ans.size() - 1)[1] = Math.max(l, lend);
            } else {
                ans.add(new int[] {s, l});
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
