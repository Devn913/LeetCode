class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[2051];
        for(int[] entry: logs){
            arr[entry[0]]++;
            arr[entry[1]]--;
        }
        int max = 0;
        int year = 1950;
        int temp = 0;
        for(int i = 1950;i<2051;i++){
            temp+=arr[i];
            if(temp>max){
                max = temp;
                year = i;
            }
        }
        return year;

    }
}