class Solution {
    public int longestOnes(int[] arr, int k) {
        int low  = 0;
        int high = 0;
        int fixK = k;
        int ans  = 0;
        if(k==0){
            for(int i = 0;i<arr.length;i++){
                if(arr[i]==0) continue;
                low = i;
                while(i!=arr.length){
                    if(arr[i]==1) i++;
                    else break;
                }
                ans = Math.max(ans,i-low);
            }
            return ans;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1) high++;
            else if(k!=0){
                k--;
                high++;
            }
            else break;
        }
        ans =high-low;
        while(high!=arr.length){
            while(k!=0 || high!= arr.length){
                if(arr[high]==1) high++;
                else if(k!=0) {
                    k--;
                    high++;
                }else break;
            }
            if(high >= arr.length){
                ans = Math.max(ans,high-low);
                break;
            }
            ans = Math.max(ans,high-low);
            if(arr[low] == 0) k++;
            if(k>fixK) k = fixK;
            low++;
             
        }
        return ans;
    }
}