class Solution {
    public int hammingWeight(int n) {
        int res = 0;

        while (n != 0) {
            n &= n - 1; // and it with n-1 whch removes the ryt most elemnt each tym
            res += 1;
        }
        return res;
    }
}
