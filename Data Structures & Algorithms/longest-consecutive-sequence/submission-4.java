class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int res=0;
        for(int num:nums){
        if(map.containsKey(num))continue;
        int l=0;
        int r=0;

        if(map.containsKey(num-1)){
            l=map.get(num-1);
        }
        if(map.containsKey(num+1)){
            r=map.get(num+1);
        }

        int len=l+r+1;

        map.put(num,len);

        map.put(num-l,len);
        map.put(num+r,len);

        res=Math.max(res,len);
    }
    return  res;
}
}