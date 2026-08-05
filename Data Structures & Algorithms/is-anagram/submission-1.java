class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();

        if(m!=n)return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        char[]ss=s.toCharArray();
        for(int i=0;i<ss.length;i++){
            if(!map1.containsKey(ss[i]))map1.put(ss[i],0);
            int freq=map1.get(ss[i]);
            map1.put(ss[i],freq+1);
        }

        char[]st=t.toCharArray();
        for(int i=0;i<st.length;i++){
            if(!map2.containsKey(st[i]))map2.put(st[i],0);
            int freq=map2.get(st[i]);
            map2.put(st[i],freq+1);
        }

        if(map1.equals(map2))return true;

        return false;

    }
}
