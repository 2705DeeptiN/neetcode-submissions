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
    public boolean canAttendMeetings(List<Interval> arr) {
        arr.sort((a, b) -> a.start - b.start);
        int n = arr.size();

        if (n <= 1)
            return true;

        int prev = arr.get(0).end;
        for (int i = 1; i < n; i++)
            if (arr.get(i).start < prev)
                return false;
            else {
                prev = arr.get(i).end;
            }

        return true;
    }
}
