class Solution {
    public int[] twoSum(int[] arr, int target) {
        //int[]ans=new int[2];
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                   return new int[]{i + 1, j + 1}; 
                }
            }
        }
        return new int[]{-1,-1};
    }
}
