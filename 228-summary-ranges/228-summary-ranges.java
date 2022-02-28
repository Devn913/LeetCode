class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            int end = nums[i]+1;
            while(i<nums.length-1){
                if(nums[i+1] == end){
                    i++;
                    end++;
                }else{
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(start));
            if(start<end-1){
                sb.append("->");
                sb.append(Integer.toString(end-1));
            }
            list.add(sb.toString());
            i++;            
        }
        return list;
    }
}