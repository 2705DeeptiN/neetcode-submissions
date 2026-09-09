class Solution {
    public int strStr(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();

        for(int i=0;i<=l1-l2;i++){
            int j=0;

            while(j<l2 && s1.charAt(i+j)==s2.charAt(j)) j++;

            if(j==l2) return i;
        }
        return -1;
    }
}