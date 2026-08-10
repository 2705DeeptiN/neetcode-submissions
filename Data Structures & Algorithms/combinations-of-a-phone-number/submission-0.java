class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve(0, digits, "", map, ans);

        return ans;
    }

    public void solve(int index, String digits, String curr,
                      String[] map, List<String> ans) {

        if (index == digits.length()) {
            ans.add(curr);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {

            // choose
            curr = curr + ch;

            // recurse
            solve(index + 1, digits, curr, map, ans);

            // backtrack
            curr = curr.substring(0, curr.length() - 1);
        }
    }
}