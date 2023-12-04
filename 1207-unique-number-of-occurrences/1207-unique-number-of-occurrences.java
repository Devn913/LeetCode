class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        boolean[] testArray = new boolean[1001];
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            int value = mapElement.getValue();
            if(testArray[value]==true) return false;
            testArray[value] = true;
        }
        return true;
    }
}