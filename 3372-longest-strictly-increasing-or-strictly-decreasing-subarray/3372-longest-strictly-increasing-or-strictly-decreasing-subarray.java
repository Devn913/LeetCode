class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int min_till_now = 1;
        int max_till_now = 1;
        int curr_min_streak = 1;
        int curr_max_streak = 1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                curr_min_streak++;
                max_till_now = Math.max(curr_max_streak,max_till_now);
                curr_max_streak = 1;
            }else if(arr[i]<arr[i+1]){
                curr_max_streak++;
                min_till_now = Math.max(curr_min_streak,min_till_now);
                curr_min_streak = 1;

            }   
            else{
                max_till_now = Math.max(curr_max_streak,max_till_now);
                min_till_now = Math.max(curr_min_streak,min_till_now);
                curr_max_streak = 1;
                curr_min_streak = 1;
            }
        }
        max_till_now = Math.max(curr_max_streak,max_till_now);
        min_till_now = Math.max(curr_min_streak,min_till_now);
        return Math.max(max_till_now,min_till_now);
    }
}