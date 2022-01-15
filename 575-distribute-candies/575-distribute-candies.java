class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: candyType){
            set.add(num);
        }
        if(set.size()>candyType.length/2) return candyType.length/2;
        return set.size();
    }
}