class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public int partation(int arr[], int si, int ei){
        int counter = 0;
        for(int i = si+1;i<=ei;i++){
            if(arr[si]>arr[i]){
                counter++;
            }
        }
        swap(arr,si,si+counter);
        int i = si;
        int j = ei;
        while(i<si+counter && si+counter<j){
            if(arr[i]>=arr[si+counter]){
                if(arr[j]<arr[si+counter]){
                    swap(arr,i,j);
                    i++;
                }
                j--;
            }else{
                if(arr[j]>=arr[si+counter]){
                    j--;
                }
                i++;
            }
        }
        return si+counter;
    }
    public void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int c = partation(arr,si,ei);
        quickSort(arr,si,c-1);
        quickSort(arr,c+1,ei);
    }
    
        
    public int minPairSum(int[] arr) {
        quickSort(arr,0,arr.length-1);
        int result = 0;
        int min =0;
        int max = arr.length -1;
        while(min<=max){
            if(result<arr[min] + arr[max]){
                result = arr[min] + arr[max];
            }
            min++;
            max --;
        }
        return result;
        
    }
}