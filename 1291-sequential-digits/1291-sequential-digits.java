class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>(36);
        int to_ADD = 11;
        int currentNum = 12;
        int last_to_ADD = 12;
        while(currentNum<=high){
            if(currentNum%10!=0){
                if(currentNum>=low){
                    list.add(currentNum);
                }
            }else{
                to_ADD = to_ADD*10+1;
                currentNum = last_to_ADD;
                last_to_ADD =currentNum + to_ADD;
            }

            currentNum+=to_ADD;
        }
        return list;
    }
}