class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }

        int streak = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int currentStreak = 1;
                int currentNum = num;
                while(set.contains(currentNum+1)){
                    currentStreak++;
                    currentNum++;
                }
                streak = Math.max(streak,currentStreak);
            }
        }
        return streak;
    }
}