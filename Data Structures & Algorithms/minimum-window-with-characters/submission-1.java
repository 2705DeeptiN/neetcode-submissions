class Solution {
    //brute force
    
    public String minWindow(String s, String t) {
        
        // If target string is empty, no window needed
        if(t.isEmpty()) return "";

        // Map to store frequency of characters in t
        // Example: t = "AABC" -> {A=2, B=1, C=1}
        Map<Character,Integer> ct = new HashMap<>();

        // Fill target frequency map
        for(char c : t.toCharArray()){
            ct.put(c, ct.getOrDefault(c,0) + 1);
        }

        // Stores starting and ending index of smallest valid window
        int[] res = {-1,-1};

        // Stores length of smallest window found
        int resl = Integer.MAX_VALUE;


        // Try every possible starting point i
        for(int i=0; i<s.length(); i++){

            // New map to track character counts in current window
            Map<Character,Integer> st = new HashMap<>();

            // Expand window from i to j
            for(int j=i; j<s.length(); j++){

                // Add current character into window frequency map
                st.put(s.charAt(j), st.getOrDefault(s.charAt(j),0)+1);

                // Assume current window is valid
                boolean flag = true;

                // Check if current window contains all chars
                // required by t with correct frequency
                for(char c : ct.keySet()){

                    // If window has less than required count
                    // then window is invalid
                    if(st.getOrDefault(c,0) < ct.get(c)){
                        flag = false;
                        break;
                    }
                }

                // If valid window found and it is smaller
                // than previous best window
                if(flag && (j-i+1) < resl){

                    // Update minimum length
                    resl = j-i+1;

                    // Store indices of best window
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        // If no valid window found return ""
        // Otherwise return substring using saved indices
        return resl == Integer.MAX_VALUE
                ? ""
                : s.substring(res[0], res[1]+1);
    }
}