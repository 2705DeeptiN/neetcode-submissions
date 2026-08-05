class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
       // List<List<Integer>> list = new ArrayList<>();

        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                       List<Integer>temp=Arrays.asList(arr[i],arr[j],arr[k]);
                       res.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
