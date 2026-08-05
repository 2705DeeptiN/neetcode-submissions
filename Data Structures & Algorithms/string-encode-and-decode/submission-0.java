class Solution {

    public  String encode(List<String> strs) {
         StringBuilder sb=new StringBuilder();
       
        for(String st:strs){
            sb.append(st.length())
            .append("#")
            .append(st);
        }return sb.toString();
    
    }
    public  List<String> decode(String str) {
        List<String> r=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;

//find #
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            String s=str.substring(j+1,j+1+len);
            r.add(s);
            i=len+j+1;
        }
        return r;
    }
}


