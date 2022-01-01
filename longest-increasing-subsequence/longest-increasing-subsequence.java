class Solution {
    public int lengthOfLIS(int[] arr) {
        int[] res = new int[arr.length];
        int totalmax = 0;
        for(int i = 0;i<arr.length;i++){
            int max = 1;
            for(int j = i-1;j!=-1;j--){
                if(arr[i]>arr[j] &&res[j]>=max) max = res[j]+1;
            }
            res[i] = max;
            totalmax = Math.max(max,totalmax);
        }
        return totalmax;
    }
}