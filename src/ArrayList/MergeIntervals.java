package ArrayList;

import java.util.*;

public class MergeIntervals {

    // Interval class to store pairs
    static class Interval {
        int start, end;
        Interval(int s, int e) {
            start = s;
            end = e;
        }
        @Override
        public String toString() {
            return "(" + start + "," + end + ")";
        }
    }

    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        // Sort intervals by start time
        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<Interval> merged = new ArrayList<>();
        Interval current = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);

            if (next.start <= current.end) {
                // Overlap → merge
                current.end = Math.max(current.end, next.end);
            } else {
                // No overlap → add current and move forward
                merged.add(current);
                current = next;
            }
        }
        // Add the last interval
        merged.add(current);

        return merged;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(6, 8));
        intervals.add(new Interval(9, 10));

        List<Interval> merged = mergeIntervals(intervals);
        System.out.println("Merged intervals: " + merged);
    }
}