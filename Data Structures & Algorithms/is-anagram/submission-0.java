class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n)return false;

        char[]cs=s.toCharArray();
        char[]ts=t.toCharArray();

        Arrays.sort(cs);
        Arrays.sort(ts);

        if(Arrays.equals(cs,ts))return true;

        return false;
    }
}
