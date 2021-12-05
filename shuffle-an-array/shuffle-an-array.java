class Solution {
    public int[] arr;
    public Solution(int[] nums) {
        arr = nums;
    }
    
    public int[] reset() {
        return arr;
    }
    
    public int[] shuffle() {
        if(arr.length < 2) return arr;
        int[] nums = arr.clone();
        for(int i =0;i<arr.length;i++){
            int random =(int)(Math.random()*(arr.length-0)+0);
            swap(nums, i, random);
        }
        return nums;
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */