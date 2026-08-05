class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        while (k > 0) {
            //store last elemnt frm array
            int temp = nums[n - 1];

            //last inda replace with 1 elemnt b4 tht

            for (int i = n - 1; i > 0; i--) {
                //last d value atar hindind le replace maad

                nums[i] = nums[i - 1];
            }

            //last elemnt value idid get to frst
            nums[0] = temp;
            k--;
        }
    }
}