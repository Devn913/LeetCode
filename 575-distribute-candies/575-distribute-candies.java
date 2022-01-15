class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: candyType){
            set.add(num);
        }
        return Math.min(candyType.length/2,set.size());
    }
}