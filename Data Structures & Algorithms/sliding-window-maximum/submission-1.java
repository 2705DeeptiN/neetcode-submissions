
class Solution {

    // Pair stores value and index
    class Pair {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        // Max heap based on value
        PriorityQueue<Pair> heap = new PriorityQueue<>(
            new Comparator<Pair>() {
                public int compare(Pair a, Pair b) {
                    return b.val - a.val; // larger value first
                }
            }
        );

        int[] ans = new int[nums.length-k+1];
        int out = 0;

        for(int i=0; i<nums.length; i++){

            // add current element
            heap.add(new Pair(nums[i], i));

            if(i >= k-1){

                // remove elements outside window
                while(heap.peek().idx <= i-k){
                    heap.poll();
                }

                // top is maximum
                ans[out++] = heap.peek().val;
            }
        }

        return ans;
    }
}