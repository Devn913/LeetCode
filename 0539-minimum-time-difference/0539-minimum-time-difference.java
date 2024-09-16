class Solution {
//     public class Time implements Comparable<Time>{
//         int hour;
//         int minute;
//         Time(int hour, int minute){
//             this.hour = hour;
//             this.minute = minute;
//         }
//         public int compareTo(Time T){  
//             return (T.minutes+(T.hour*60))  - (this.minutes+(this.hour*60));

//         }       
//     }
    public int findMinDifference(List<String> timePoints) {
        int res = Integer.MAX_VALUE;
        int N = timePoints.size();
        int[] times = new int[1441];
        int curr = 0;

        for (int i = 0; i < N; i++) {
            String s = timePoints.get(i);
            curr = Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3, 5));
            if (Integer.parseInt(s.substring(0, 2)) == 0 && Integer.parseInt(s.substring(3, 5)) == 0) {
                System.out.println("zero" + times[1440]);
                ++times[1440];
                times[0]++;
            } else {
                ++times[curr];
            }
        }
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 1; i <= 1440; i++) {
            if (times[i] == 0) {
                continue;
            }
            
            if(firstIndex==-1) firstIndex = i;
            if(lastIndex==-1) lastIndex = i;   
            if (times[i] > 1) {
                return 0;
            }

            int next = i + 1;
            // 1439 1440
            // 1    1
            while (next <= 1440 && times[next] == 0) {
                next++;
                
            }
            if(next <= 1440)
            {
                res = Math.min(res, next - i);
                lastIndex = next;
            }
        
            i = next-1;
            
        }
        return Math.min(res,1440-lastIndex+firstIndex);
    }
}