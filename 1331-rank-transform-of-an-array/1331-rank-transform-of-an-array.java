class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int newArr[] = arr.clone(); 
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int counter = 1;
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],counter++);
        }
        for(int i = 0;i<arr.length;i++){
            newArr[i] = map.get(newArr[i]);
        }
        return newArr;
    }
}