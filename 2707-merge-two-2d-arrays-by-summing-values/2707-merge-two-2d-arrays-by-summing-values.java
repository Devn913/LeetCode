class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> result = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while(index1 < nums1.length || index2 < nums2.length){
            int[] temp = new int[2];
            if(index1 == nums1.length){
                
                temp[0] = nums2[index2][0];
                temp[1] = nums2[index2][1];
                index2++;

            }else if(index2 == nums2.length){
                temp[0] = nums1[index1][0];
                temp[1] = nums1[index1][1];
                index1++;
                
            }else if(nums1[index1][0] == nums2[index2][0]){
                temp[0] = nums1[index1][0];
                temp[1] = nums1[index1][1] + nums2[index2][1];
                index1++;
                index2++;
            }else if(nums1[index1][0] > nums2[index2][0]){
                temp[0] = nums2[index2][0];
                temp[1] = nums2[index2][1];
                index2++;
            }else{
                temp[0] = nums1[index1][0];
                temp[1] = nums1[index1][1];
                index1++;
            }
            result.add(temp);
        }
        int[][] ans = new int[result.size()][2];
        for(int i = 0;i<ans.length;i++){
            ans[i][0] = result.get(i)[0];
            ans[i][1] = result.get(i)[1];
        }
        return ans;
    }
}