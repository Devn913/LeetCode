class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min_diff = Math.min(Math.abs(arr[i]-arr[i+1]),min_diff);
        }
        List<List<Integer>> list =new ArrayList<>();
        for(int i =0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==min_diff){
                List<Integer> dupes = new ArrayList<>(2);
                dupes.add(arr[i]);
                dupes.add(arr[i+1]);
                list.add(dupes);
            }
        }
        
        return list;
    }
}