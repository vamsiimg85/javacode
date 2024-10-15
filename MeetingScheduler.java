/* Problem 1: Meeting Room Scheduling
You are given an ArrayList of intervals representing the start and end times of meetings.
 Determine if a person can attend all meetings without overlap.
Input: [(1, 3), (2, 4), (5, 6)]
Output: false
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingScheduler {
    public static boolean canAttendMeetings(ArrayList<Interval> intervals) {
        // Sort intervals based on the starting time
        intervals.sort(Comparator.comparingInt(a -> a.start));
        
        // Check for overlap
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < intervals.get(i - 1).end) {
                return false;  // Overlap detected
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Interval> meetings = new ArrayList<>();
        meetings.add(new Interval(1, 3));
        meetings.add(new Interval(2, 4));
        meetings.add(new Interval(5, 6));

        boolean result = canAttendMeetings(meetings);
        System.out.println(result);  // Output: false
    }
}
