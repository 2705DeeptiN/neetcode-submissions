class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] s1c = new int[26];
        int[] s2c = new int[26];

        // Build frequency for s1 and first window in s2
        for(int i = 0; i < s1.length(); i++){
            s1c[s1.charAt(i)-'a']++;
            s2c[s2.charAt(i)-'a']++;
        }

        // Initial matches
        int match = 0;
        for(int i=0;i<26;i++){
            if(s1c[i] == s2c[i]) match++;
        }

        int l = 0;

        for(int r = s1.length(); r < s2.length(); r++){

            if(match == 26) return true;

            // Add new character entering window
            int idx = s2.charAt(r)-'a';
            s2c[idx]++;

            if(s1c[idx] == s2c[idx]){
                match++;
            }
            else if(s1c[idx] + 1 == s2c[idx]){
                match--;
            }

            // Remove left character leaving window
            idx = s2.charAt(l)-'a';
            s2c[idx]--;

            if(s1c[idx] == s2c[idx]){
                match++;
            }
            else if(s1c[idx] - 1 == s2c[idx]){   // fixed bug here
                match--;
            }

            l++;
        }

        return match == 26;
    }
}