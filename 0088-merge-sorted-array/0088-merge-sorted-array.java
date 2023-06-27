class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        if(m==0){
            for(int i = 0;i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int index1 = m-1;
        while(index1!=-1){
            nums1[n+index1] = nums1[index1--];
        }
        int current = 0;
        index1 = n;
        int index2 = 0;
        while(index1!=m+n && index2!=n){
            if(nums1[index1]>nums2[index2]){
                nums1[current++] = nums2[index2++];
            }else{
                nums1[current++] = nums1[index1++];
            }
        }
        while(index2!=n ){
            nums1[current++] = nums2[index2++];
        }
        return;
    }
}