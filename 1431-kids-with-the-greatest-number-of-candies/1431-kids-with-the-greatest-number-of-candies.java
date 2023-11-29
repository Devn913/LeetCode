class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int num: candies){
            max = Math.max(max,num);
        }
        List<Boolean> list = new ArrayList<>();
        for(int num: candies){
            if(num+extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}