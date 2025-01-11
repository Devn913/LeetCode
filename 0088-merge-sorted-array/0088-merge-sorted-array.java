class Solution {
    public void swap(int[] arr, int indx1, int indx2){
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i =0;i<nums2.length;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        if(n==0){
            return;
        }
        int end = nums1.length - 1;
        int start = m-1;
        while(start!=-1){
            swap(nums1,end,start);
            end--;
            start--;
        }
        int currentIndex = 0;
        int indx1 = nums1.length-m;
        int indx2 = 0;
        while(currentIndex<nums1.length){
            if(indx2 == nums2.length){
                nums1[currentIndex++] = nums1[indx1++];
                continue;
            }else if(indx1== nums1.length){
                nums1[currentIndex++] = nums2[indx2++];
                continue;
            }

            if(nums1[indx1]>=nums2[indx2]){
                nums1[currentIndex++] = nums2[indx2++];
            }else{
                nums1[currentIndex++] = nums1[indx1++];
            }
        }

    }
}