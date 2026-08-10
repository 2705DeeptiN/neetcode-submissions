
class Solution {
    public boolean palindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        List<String> li = new ArrayList<>();

        solve(0, s, li, ans);
        return ans;
    }
    public void solve(int strt, String s, List<String> li, List<List<String>> ans) {
        if (strt == s.length()) {
            ans.add(new ArrayList<>(li));
            return;
        }

        for (int i = strt; i < s.length(); i++) {
            String part = s.substring(strt, i +1);

            if (palindrome(part)) {
                li.add(part);
                solve(i + 1, s, li, ans);
                li.remove(li.size() - 1);
            }
        }
    }
}
