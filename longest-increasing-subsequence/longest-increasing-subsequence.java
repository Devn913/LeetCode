class Solution {
    public int lengthOfLIS(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        for(int i = 0;i<len;i++){
            int max = 1;
            for(int j = i-1;j!=-1;j--){
                if(arr[i]>arr[j] &&res[j]>=max) max = res[j]+1;
            }
            res[i] = max;
        }
        int max = res[0];
        for(int i =1;i<len;i++){
            if(max<res[i]) max = res[i];
        }
        return max;
    }
}