class Solution {
  public void swap(int i,int j,int[]arr){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
    public void moveZeroes(int[] arr) {
        int n = arr.length;

        int i = 0;
        int j = 1;
        while (j<n && i<n) {
            if (arr[i] == 0 && arr[j] != 0) {
                swap(i, j,arr);
                i++;
                j++;
            } else if (arr[i] == 0)
                j++;
            else
               { i++;
                j++;}
        }
    }
}
