class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean[] found = new boolean[3];

        for (int[] nums : triplets) {
            boolean valid = true;

            for (int i = 0; i < 3; i++) {
                if (nums[i] > target[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (int i = 0; i < 3; i++) {
                    if (nums[i] == target[i]) {
                        found[i] = true;
                    }
                }
            }
        }
        return found[0] && found[1] && found[2];
    }
}
