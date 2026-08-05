class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            
            // v need to shift by k positions so i+k
            // so tht new index wil bcm i+k % n

            temp[(i + k) % (nums.length)] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            // temp inda vapas make it num
            nums[i] = temp[i];
        }
    }
}