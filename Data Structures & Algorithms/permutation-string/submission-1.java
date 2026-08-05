class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>map1=new HashMap<>();
        for(char c:s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        int need=map1.size();
        for(int i=0;i<s2.length();i++){
            Map<Character,Integer>map2=new HashMap<>();
            int cur=0;
            for(int j=i;j<s2.length();j++){
                char c=s2.charAt(j);
                map2.put(c,map2.getOrDefault(c,0)+1);

                if(map1.getOrDefault(c,0)<map2.get(c)) break;
                if(map1.getOrDefault(c,0)==map2.get(c)) cur++;
                if(cur==need)return true;
            }
        }
        return false;
    }
}
