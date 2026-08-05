class Solution {
    public String longestCommonPrefix(String[] strs) {
        // first word initialze to prfix to compare with ok
        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // check if next word equals prfix word
            while (!strs[i].startsWith(pre)) {
                // if not equals andr prefix elemnt sanuuud maad

                // ex: pre:flower and strs[i]=flowe
                //  strs[i] doesnt strt with flower so make pre as flowe
                // tht is reduce 1 thng frm last

                pre = pre.substring(0, pre.length() - 1);
            
            if (pre == "")
                return "";
        }}
        return pre;
    }
}