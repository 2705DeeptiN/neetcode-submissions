class Solution {

    // Optimized Sliding Window
    public String minWindow(String s, String t) {

        // If target is empty, return nothing
        if(t.isEmpty()) return "";

        // ct = frequency map for target string t
        // Example t = "AABC" -> {A=2, B=1, C=1}
        Map<Character,Integer> ct = new HashMap<>();

        // st = frequency map for current window in s
        Map<Character,Integer> st = new HashMap<>();


        // Fill target frequency map
        for(char c : t.toCharArray()){
            ct.put(c, ct.getOrDefault(c,0) + 1);
        }

        // have = how many unique characters currently satisfy required frequency
        // need = total unique characters that must be satisfied
        int have = 0;
        int need = ct.size();

        // To store answer window indices
        int[] res = {-1,-1};

        // Length of smallest valid window found
        int resl = Integer.MAX_VALUE;

        // Left pointer of sliding window
        int l = 0;


        // Expand window using right pointer
        for(int r=0; r<s.length(); r++){

            char c = s.charAt(r);

            // Add current right character into window count
            st.put(c, st.getOrDefault(c,0)+1);


            // If this character now exactly meets required count,
            // one more condition is satisfied
            if(ct.containsKey(c) && st.get(c).equals(ct.get(c))){
                have++;
            }


            // If all required characters are satisfied,
            // try shrinking from left
            while(have == need){

                // Update result if this window is smaller
                if((r-l+1) < resl){
                    resl = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }


                // Remove leftmost character as we shrink window
                char leftchar = s.charAt(l);

                st.put(leftchar, st.get(leftchar)-1);


                // If removing it breaks a required frequency,
                // window becomes invalid
                if(ct.containsKey(leftchar) &&
                   st.get(leftchar) < ct.get(leftchar)){

                    have--;
                }

                // Move left pointer forward
                l++;
            }
        }

        // If no valid window found return ""
        // Else return smallest substring
        return resl == Integer.MAX_VALUE
                ? ""
                : s.substring(res[0], res[1]+1);
    }
}