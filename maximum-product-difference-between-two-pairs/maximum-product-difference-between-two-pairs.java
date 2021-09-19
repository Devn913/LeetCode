class Solution {  
    
    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int partation(int arr[], int si, int ei){
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
    public int maxProductDifference(int[] arr) {
        quickSort(arr,0,arr.length-1);
        return arr[arr.length -1]* arr[arr.length -2] - arr[0] * arr[1];
    }
}