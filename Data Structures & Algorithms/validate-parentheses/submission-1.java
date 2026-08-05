class Solution {
    // brute frc
    public boolean isValid(String s) {
        boolean changed = true;

        while (changed) {
            changed = false;
            // if matching braces are preent keep on removing them
            // in the end if u get empty string return true;

            String newStr = s.replace("()", "").replace("{}", "").replace("[]", "");

            // ynre change agidr continue with tht
            // ex [()] becomes [] n this is nt equal to old one ..so now loop with ths one
            
            if (!newStr.equals(s)) {
                changed = true;
                s = newStr;
            }
        }

        return s.isEmpty();
    }
}
