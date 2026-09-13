class Solution {
    public boolean ifZero(int[] f) {
        for (int ele : f) {
            if (ele != 0)
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 > l2)
            return false;
        int[] f1 = new int[26];

        for (char c : s1.toCharArray()) {
            f1[c - 'a']++;
        }

        for (int i = 0; i < l1; i++) {
            f1[s2.charAt(i) - 'a']--;
        }

        if (ifZero(f1))
            return true;

        for (int i = l1; i < l2; i++) {
            f1[s2.charAt(i - l1) - 'a']++;
            f1[s2.charAt(i)-'a']--;
             if (ifZero(f1))
            return true;
        }

        return false;
    }
}
