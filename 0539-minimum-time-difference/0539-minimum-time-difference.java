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
        boolean[] minutes = new boolean[1440];
        for(int i =0;i<timePoints.size();i++){
            int hour = Integer.parseInt(timePoints.get(i).substring(0,2));
            int min = Integer.parseInt(timePoints.get(i).substring(3));
            if(minutes[hour*60+min] ==true){
                return 0;
            }
            minutes[hour*60+min] = true;
        }
        int prevIndex = Integer.MAX_VALUE;
        int firstIndex = Integer.MAX_VALUE;
        int lastIndex = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<1440;i++){
            if(minutes[i]){
                if(prevIndex!=Integer.MAX_VALUE){
                    ans = Math.min(ans,i-prevIndex);
                }
                prevIndex = i;
                if(firstIndex == Integer.MAX_VALUE) firstIndex = i;
                lastIndex = i;
            }
        }
        return Math.min(ans,1440 - lastIndex + firstIndex);
    }
}