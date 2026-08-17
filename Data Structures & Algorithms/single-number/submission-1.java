class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer>set=new HashSet<>();

        for(int ele:nums){
            if(set.contains(ele)) set.remove(ele);
            else set.add(ele);
        }
        
        for(int x:set){
            return x;
        }
        return -1;
    }
}
