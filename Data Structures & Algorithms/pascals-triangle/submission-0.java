class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> li = new ArrayList<>();
            li.add(1);
            int val = 1;
            for (int j = 1; j <= i; j++) {
                val = val * (i - j + 1) / j;
                li.add(val);
            }
        
        ans.add(li);
        }
        return ans;
    }
}