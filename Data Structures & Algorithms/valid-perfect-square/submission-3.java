class Solution {
    public boolean isPerfectSquare(int num) {
        
        int lo=0;
        int hi=num;
boolean f=false;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
             long sq = (long) mid * mid;


            if(sq==num){
                f=true;
                break;
            }
            else if(sq<num) lo=mid+1;
            else hi=mid-1;
        }
        return f;
    }
}