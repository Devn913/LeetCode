class Solution {
    public int BinarySearch(int[] numbers, int target, int low){
        int high = numbers.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            mid = (low+high)/2;
            if(numbers[mid] == target) return mid;
            if(numbers[mid]>target) high = mid -1;
            else low = mid+1;
        
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int value) {
        int[] target = new int[2];
        for(int i =0;i<numbers.length;i++){
            int val = BinarySearch(numbers,value-numbers[i], i+1);
            if(val!=-1){
                target[0] = i+1;
                target[1] = val+1;
                break;
            }
        }
        return target;
    }
}