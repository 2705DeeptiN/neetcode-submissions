class Solution {
    public int[][] merge(int[][] arr) {
        
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int last = arr[0][1];
List<int[]>li=new ArrayList<>();
        int strt=arr[0][0];

        for (int i = 1; i < n; i++) {
            if (arr[i][0] <= last) {
                last = Math.max(last, arr[i][1]);
                
            }
            else {
             
                li.add(new int[]{strt,last});
                strt=arr[i][0];
                   last=arr[i][1];
            }
        }
        li.add(new int[]{strt,last});

         return li.toArray(new int[li.size()][]);
    }
}
        
    