class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, maxFreq = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            // manually update frequency
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

            // update max frequency
            maxFreq = Math.max(maxFreq, map.get(ch));

            // shrink window if invalid
            while ((r - l + 1) - maxFreq > k) {
                char lChar = s.charAt(l);
                map.put(lChar, map.get(lChar) - 1);
                l++;
            }

            // update res
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}