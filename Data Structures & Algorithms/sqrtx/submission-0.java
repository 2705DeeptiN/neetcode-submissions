class Solution {
    public int mySqrt(int num) {
          int lo = 0;
        int hi = num;
       
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long sq = (long) mid * mid;

            if (sq == num) {
               return mid;
               
            } else if (sq < num)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return hi;
    }
}