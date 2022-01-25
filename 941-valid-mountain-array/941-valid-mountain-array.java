class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int increasing = 0;
        int decreasing = arr.length -1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]) break;
            increasing++;
        }
        for(int j = arr.length-1;j!=0;j--){
            if(arr[j]>=arr[j-1]) break;
            decreasing--;
        }
        if(increasing == 0 || decreasing == arr.length - 1) return false;
        return increasing==decreasing;
        
    }
}