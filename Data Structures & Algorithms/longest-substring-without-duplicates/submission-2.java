class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  n =s.length();
        int maxx=0;

        for(int i=0;i<n;i++){
            HashSet<Character>set=new HashSet<>();

            for(int j=i;j<n;j++){
                if(set.contains(s.charAt(j))) break;

                set.add(s.charAt((j)));
                maxx=Math.max(maxx,set.size());
            }
        }
        return maxx;
    }
}
