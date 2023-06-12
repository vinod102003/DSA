import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeInterval {
    public static int[][] merge(int[][] intervals)
    {
        // 1. Sort the intervals based on the start value
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

       // add non overlapping interval
        LinkedList<int[]> merged = new LinkedList<>();

        // 2. Look for overlapping intervals
        for (int[] interval : intervals) {
            // If the merged list is empty or the current interval does not overlap with the previous one, add it to the merged list
                    // lastEnd < currStart no overlap
            // [0] -> start  , [1] -> last
            if(merged.isEmpty() || merged.getLast()[1] < interval[0])
            {
                merged.add(interval);
            }
            else
            {
                // If the current interval overlaps with the previous one, merge them by updating the end value
               // currStart <= lastEnd   over lap   so  max(lastEnd , currEnd)
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);

            }
        }

        // Convert the list of merged intervals to an array and return it
        return merged.toArray(new int[merged.size()][]);

    }

    public static void main(String[] args)
    {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] mergedIntervals = merge(intervals);

        // Print the merged intervals
        for (int[] interval : mergedIntervals)
        {
            System.out.println(Arrays.toString(interval));
        }
    }
}

