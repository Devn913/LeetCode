class Solution {
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public int partation(int[] arr, int si, int ei){
        int counter = 0;
        for(int i = si+1;i<=ei;i++){
            if(arr[i]<arr[si]){
                counter++;
            }
        }
        swap(arr,si,si+counter);
        int i  =si;
        int j = ei;
        while(i<si+counter && j>si+counter){
            if(arr[i]<arr[si+counter]){
                if(arr[j]>=arr[si+counter]){
                    i++;
                    j--;
                }else{
                    i++;
                }
            }else{
                if(arr[j]>=arr[si+counter]){
                    j--;
                }else{
                    swap(arr,i,j);
                    i++;
                    j--;
                }
            }
        }
        return si+counter;
        
    }
    public void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }else{
            int c = partation(arr,si,ei);
            quickSort(arr,si,c-1);
            quickSort(arr,c+1,ei);
        }
    }
    
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
}