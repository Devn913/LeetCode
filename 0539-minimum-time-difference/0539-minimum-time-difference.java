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
        int[] nums = new int[timePoints.size()];
        for(int i =0;i<timePoints.size();i++){
            int hour = Integer.parseInt(timePoints.get(i).substring(0,2));
            int minutes = Integer.parseInt(timePoints.get(i).substring(3));
            nums[i] = hour*60+minutes;
        }
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<nums.length-1 && ans!=0;i++){
            ans = Math.min(ans,nums[i+1]-nums[i]);
        }
        ans = Math.min(ans,1440-nums[nums.length-1]+nums[0]); // total number of minutes in a day = 24*60 = 1440
        return ans;
    }
}