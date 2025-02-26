class Solution {
    public int jump(int[] arr) {
        if(arr.length == 1) return 0;
        int totalJump = 0;
        int index = 0;
        while(index<=arr.length){
            int maxRange = index + arr[index];
            totalJump++;
            if(maxRange>=arr.length-1) return totalJump;
            int maxJumpIndex = index+1;
            for(int i = index+1;i<=maxRange;i++){
                if(i+arr[i]>=maxJumpIndex + arr[maxJumpIndex]) maxJumpIndex = i;
            }
            index = maxJumpIndex;
        }
        return totalJump;
    }
}