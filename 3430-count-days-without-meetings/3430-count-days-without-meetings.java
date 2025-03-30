class Solution {

    public int countDays(int days, int[][] meetings) {
        
        // Sort meetings based on starting times
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int lastDay = 0;
        int totalMeetings = 0;
        for(int i = 0;i<meetings.length;i++){
            int temp      = meetings[i][1] - Math.max(meetings[i][0],lastDay) + 1;
            totalMeetings += temp>0 ? temp: 0;
            lastDay = Math.max(meetings[i][1]+1,lastDay);
        }
        return (int) (days-totalMeetings); 


    }
}