class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int[] entry: logs){
            arr[entry[0]-1950]++;
            arr[entry[1]-1950]--;
        }
        int max = 0;
        int year = 0;
        int temp = 0;
        for(int i = 0;i<101;i++){
            temp+=arr[i];
            if(temp>max){
                max = temp;
                year = i;
            }
        }
        return year+1950;

    }
}