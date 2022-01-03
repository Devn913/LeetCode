class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = m + n -1;
        while(counter>=0){
            if(m!=0 && n!=0 && nums1[m-1]>=nums2[n-1]){
                swap(nums1,counter,m-1);
                m--;
            }else if(n!=0){
                nums1[counter] = nums2[n-1];
                n--;
            }
            counter--;
            
        }
    }
}