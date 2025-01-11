class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int majority1 = 0;
        int majority2 = 0;
        for(int num: nums){
            if(num == majority1) count1++;
            else if(num == majority2) count2++;
            else if(count1 == 0){
                majority1 = num;
                count1++;
            }else if(count2 == 0){
                majority2 = num;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num: nums){
            if(num == majority1){
                count1++;
            }else if(num == majority2){
                count2++;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        if (count1 > n / 3) {
            res.add(majority1);
        }
        if (count2 > n / 3) {
            res.add(majority2);
        }

        return res;        
    }
}