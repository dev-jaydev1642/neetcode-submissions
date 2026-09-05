class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int[] currInterval = intervals[0];
        result.add(currInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            if (currInterval[1] >= nextInterval[0]) {
                currInterval[1] = Math.max(currInterval[1], nextInterval[1]);
            } else {
                currInterval = nextInterval;
                result.add(currInterval);
            }
            
        }

        return result.toArray(new int[result.size()][]);
    }
}
