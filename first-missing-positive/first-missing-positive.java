class Solution {
    public int firstMissingPositive(int[] arr) {
        int len = arr.length;
        boolean  one = false;
        for(int i =0;i<len;i++){
            if(arr[i]==1) one = true;
            else if(arr[i]<=0  || arr[i]>len) arr[i] = 1;
        }
        if(!one) return 1;
        for(int i =0;i<len;i++){
            int index = Math.abs(arr[i]) - 1;
            arr[index] = -Math.abs(arr[index]);
        }
        for(int i = 0;i<len;i++){
            if(arr[i]>0) return i+1;
        }
        return len+1;
    }
}