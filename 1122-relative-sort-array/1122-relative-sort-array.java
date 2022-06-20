class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for(int ele: arr1)
            freq[ele]++;
        int index = 0;
        for(int ele: arr2){
            while(freq[ele]>0){
                arr1[index++] = ele;
                freq[ele]--;
            }
        }
        for(int i = 0;i<1001;i++){
            while(freq[i]>0){
                arr1[index++] = i;
                freq[i]--;
            }
        }
        return arr1;
    }
}