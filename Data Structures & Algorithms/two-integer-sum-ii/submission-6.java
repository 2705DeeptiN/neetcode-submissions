class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int temp=target-arr[i];
            if(map.containsKey(temp))return new int[]{ map.get(temp),i+1};
            else map.put(arr[i],i+1);
        }
        return new int[0];
    }
}
