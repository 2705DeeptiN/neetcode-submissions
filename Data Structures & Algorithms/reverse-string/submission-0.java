class Solution {

    //brute force using temp
    
    public void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int n = s.length;
        for (int i = 0; i < s.length; i++) {
            temp[i] = s[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }
}