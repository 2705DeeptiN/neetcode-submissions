class Solution {
    public int reverseBits(int n) {

        int result = 0;

        // We have exactly 32 bits in an integer
        for (int i = 0; i < 32; i++) {

            // Shift result left to make space for next bit
            result <<= 1;

            // Get last bit of n and add it to result
            result = result | (n & 1);

            // Shift n right to process the next bit
            n >>= 1;
        }

        return result;
    }
}
