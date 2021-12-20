class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list =new ArrayList<>();
        int min_diff = Integer.MAX_VALUE;
        for(int i =1;i<arr.length;i++){
            int diff = arr[i] - arr[i-1];
            if(diff == min_diff){
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }else if(diff<min_diff){
                list.clear();
                list.add(Arrays.asList(arr[i-1],arr[i]));
                min_diff = diff;
            }
        }
        return list;
    }
}