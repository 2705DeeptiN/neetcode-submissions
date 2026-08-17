class Solution {
    public int missingNumber(int[] nums) {
        //hashset o(n)/o(n)
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();

        for(int ele:nums) set.add(ele);

        for(int i=0;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
