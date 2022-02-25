class Solution {
    private void swap(int [] arr, int i, int j){
        int temp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void flip(int[] arr, int i){
        int start = 0;
        while(start<i){
            swap(arr,i,start);
            i--;
            start++;
        }
    }
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int j = arr.length -1;
        while(j!=0){
            int max = j;
            for(int i = 0;i<=j;i++){
                if(arr[i]>arr[max]) max = i;
            }
            if(max!=j){
                list.add(max+1);
                list.add(j+1);
                flip(arr,max);
                flip(arr,j);
            }
            j--;
        }
        return list;
    }
}