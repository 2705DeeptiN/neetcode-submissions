class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            int l = s.length();
            sb.append(l);
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> li = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int len = 0;
            while (Character.isDigit(str.charAt(i))) {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;

            String s = str.substring(i, i + len);

            li.add(s);
            i += len;
        }
        return li;
    }
}
