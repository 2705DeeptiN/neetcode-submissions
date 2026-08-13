/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> arr) {
        int n = arr.size();
        arr.sort((a, b) -> a.start- b.start);
        if(n==0) return 0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(arr.get(0).end);

        for(int i=1;i<n;i++){
            if(arr.get(i).start>=pq.peek()){
                pq.poll();
            }
            pq.add(arr.get(i).end);
        }
        return pq.size();
    }
}
