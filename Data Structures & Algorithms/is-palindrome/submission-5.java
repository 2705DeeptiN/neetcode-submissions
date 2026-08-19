class Solution {
    public boolean isPalindrome(String s) {
       s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

       char[]ch=s.toCharArray();
       int l=0;
       int r=ch.length-1;

       while(l<=r){
        if(ch[l]!=ch[r]) return false;
        l++;
        r--;
       }
       return true;
    }
}
