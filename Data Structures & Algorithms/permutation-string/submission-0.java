class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[]a1=s1.toCharArray();
        Arrays.sort(a1);
        String sorts1=new String(a1);

        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                char[]subs=s2.substring(i,j+1).toCharArray();
                Arrays.sort(subs);
                
                String sorts2=new String(subs);
                if(sorts1.equals(sorts2)){return true;}

            }
    }
    return false;
}}
