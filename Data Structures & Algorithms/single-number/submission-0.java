class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = true; // assuming that its unique

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    flag = false;
                    // is same found make false

                    // meaning its different
                    break;
                }
            }
            if (flag)
                return arr[i];
        }
        return -1;
    }
}
