class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
String cur="";
        solve(0,0,n,cur,ans);
        return ans;
    }
    public void solve(int i,int j,int n,String cur,List<String>ans){
        if(i==n && j==n) {
            ans.add(cur);
            return;
        }
        
        if(i<n){
            cur=cur+'(';
            solve(i+1,j,n,cur,ans);
            cur=cur.substring(0,cur.length()-1);
        }
         if(j<i){
            cur+=')';
            solve(i,j+1,n,cur,ans);
            cur=cur.substring(0,cur.length()-1);
        }

    }
}
