class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] res = new int[len1+len2];
        int c1 =0;
        int c2 = 0;
        for(int i= 0;i<len1+len2;i++){
            int val1 = Integer.MAX_VALUE;
            int val2 = Integer.MAX_VALUE;
            if(c1<len1){
                val1 = nums1[c1];
            }
            if(c2<len2){
                val2 = nums2[c2];
            }
            if(val1>val2){
                res[i] = val2;
                c2++;
            }else{
                res[i] = val1;
                c1++;
            }
        }
        if((len1+len2)%2==0){
            return (double) (res[(len1+len2)/2 ] + res[ (len1+len2)/2 - 1 ])/2;
        
        }else{
            return (double) res[(len1+len2)/2];
        }
        
    }
}