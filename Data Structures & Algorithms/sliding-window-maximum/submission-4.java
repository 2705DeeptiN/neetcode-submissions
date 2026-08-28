class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[]ans=new int[n-k+1];

       // idx tells us where to put the next answer.
        int idx=0;
        Deque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //if put of bounds remove tht
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }

            //if smaller than current they cant be max and so remove them
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            //add
            q.offer(i);

            //We cannot calculate a window maximum until we've seen k elements.
            if(i>=k-1){
                ans[idx++]=nums[q.peek()];
            }
        }
        return ans;
    }
}
