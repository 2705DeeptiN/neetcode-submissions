class Solution {
    public List<Integer> partitionLabels(String s) {
        // to store last occurence of each character
        int[] last = new int[26];

        // keep updating last occurence
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();

        // strt is begining of current partition
        int strt = 0, end = 0;

        // extend end
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            // if i reached end then v need to break
            if (i == end) {
                ans.add(end - strt + 1); // add substring size
                strt = i + 1;
                // start new parition
            }
        }
        return ans;
    }
}
