class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        List<Integer> list = new ArrayList<>();

        for (int currDay = 0; currDay < n; currDay++) {
            while (!list.isEmpty() && temperatures[currDay] > temperatures[list.getLast()]) {
                int prevDay = list.removeLast();
                result[prevDay] = currDay - prevDay;
            }

            list.add(currDay);
        }

        return result;
    }
}
