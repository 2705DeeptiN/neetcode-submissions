class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);
        // sort in lexi order

        // take first n last elemnt frm given array of strings
        String f = strs[0];
        String l = strs[strs.length - 1];

        // chck characters of both l n f

        int i = 0;

        // incremnt i till size of both length and if their chrctrs r same i++
        while (i < f.length() && i < l.length() && f.charAt(i) == l.charAt(i)) i++;

        // return cmn thng frm strs[0]
        // i is where last same elmnt found

        return strs[0].substring(0, i);
    }
}