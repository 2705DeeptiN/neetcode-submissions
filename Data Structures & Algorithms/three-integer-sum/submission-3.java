class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ans = new ArrayList<>();

        // first sort array
        Arrays.sort(num);
        int n = num.length;

        // tk 3 pointers ijk
        // i wil mark start of each ans list
        // j is 1 next to i and k always last

        // calculate sum and if sum <0 move i forwrd
        // if greater thn 0 move k backward

        // if equal addin ans directly
        // and whevere the pointers hav same value continue or ignre
        for (int i = 0; i < n; i++) {
            if (i > 0 && num[i] == num[i - 1])
                continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = num[i] + num[j] + num[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(num[i], num[j], num[k]));

                    j++;
                    k--;

                    while (j < k && num[j] == num[j - 1]) j++;

                    while (j < k && num[k] == num[k + 1]) k--;
                }
            }
        }

        return ans;
    }
}
