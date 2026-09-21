class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int[26];
        for (char task : tasks) {
            frequencies[task - 'A']++;
        } 

        int maxFrequency = 0;
        for (int freq : frequencies) {
            if (freq > maxFrequency) maxFrequency = freq;
        }

        int cntMaxTasks = 0;
        for (int freq : frequencies) {
            if (freq == maxFrequency) cntMaxTasks++;
        }

        int calculateSlots = (maxFrequency - 1) * (n + 1) + cntMaxTasks;

        return Math.max(calculateSlots, tasks.length);
    }
}
