class Solution {
    public String minWindow(String s, String t) {
        //brute force
        if(t.isEmpty()) return "";

        Map<Character,Integer>ct=new HashMap<>();

    //storing them in map with freq count
        for(char c:t.toCharArray()){
            ct.put(c,ct.getOrDefault(c,0)+1);
        }

        int[]res={-1,-1};
        int resl=Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            Map<Character,Integer>st=new HashMap<>();

            for(int j=i;j<s.length();j++){
                st.put(s.charAt(j),st.getOrDefault(s.charAt(j),0)+1);
                boolean flag=true;

                for(char c:ct.keySet()){
                    if(st.getOrDefault(c,0)<ct.get(c)){
                        flag=false;
                        break;
                    }
                }

                if(flag && (j-i+1)<resl){
                    resl=j-i+1;
                    res[0]=i;
                    res[1]=j;
                }
            }
        }

        return resl==Integer.MAX_VALUE ? "":s.substring(res[0],res[1]+1);

    }
}
