class Solution {
    public int leastInterval(char[] tasks, int n) {
        // freq array to store the frequency of each task
        int[] freq = new int[26];  
        int maxCount = 0;

        // Count the frequency of each task and find the maximum frequency
        for (char task : tasks) {
            freq[task - 'A']++;
            maxCount = Math.max(maxCount, freq[task - 'A']);
        }

        // Calculate the total time needed for execution
        int time = (maxCount - 1) * (n + 1);
        for (int f : freq) {
            if (f == maxCount) {
                time++;
            }
        }

        // Return the maximum of total time needed and the length of the task list
        return Math.max(tasks.length, time);
    }
}