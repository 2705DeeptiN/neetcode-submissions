class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
       
        int maxlen=0;
        
        for(int num:set){
            
            if(!set.contains(num-1)){
                int len=1;
                int c=num;
            
            while(set.contains(c+1)){
                len++;
                c++;
            }
              maxlen=Math.max(len,maxlen);
        }}
        
        return maxlen;
    }
}
