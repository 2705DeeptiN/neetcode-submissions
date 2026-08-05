class Solution {
    public boolean isPalindrome(String s) {
        // removing evrythng other than alphabts n nums
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // check by reversing the string using strignbuilder
        StringBuilder sb = new StringBuilder(s);

        if (s.equals(sb.reverse().toString()))
            return true;

        return false;
    }
}
