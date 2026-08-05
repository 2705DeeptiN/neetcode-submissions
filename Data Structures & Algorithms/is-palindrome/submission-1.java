class Solution {
    public boolean isPalindrome(String s) {
        char[]ch=s.toCharArray();
        // int n=ch.length;

        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}

