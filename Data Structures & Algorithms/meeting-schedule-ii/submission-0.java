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
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }

        int n = intervals.size();
        int[] endTime = new int[n];
        int[] startTime = new int[n];
        
        for (int i = 0; i < n; i++) {
            Interval curr = intervals.get(i);
            startTime[i] = curr.start;
            endTime[i] = curr.end;
        }

        Arrays.sort(startTime);
        Arrays.sort(endTime);

        int roomsNeeded = 0;
        int endPointer = 0;

        for (int startPointer = 0; startPointer < n; startPointer++) {
            if (startTime[startPointer] < endTime[endPointer]) roomsNeeded++;
            else endPointer++;
        }

        return roomsNeeded;
    }
}
