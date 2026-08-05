class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int l=0;
      for(int r=0;r<n;r++){
        if(arr[r]!=0)
       { int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;}
       }
       
    }
}