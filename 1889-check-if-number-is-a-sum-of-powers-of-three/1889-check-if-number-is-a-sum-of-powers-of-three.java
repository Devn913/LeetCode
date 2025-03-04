class Solution {
    HashSet<Integer> set = new HashSet<>();
    public void generateAllSubsetSum(ArrayList<Integer> list, int index, int sum){
        if(index == list.size()){
            set.add(sum);
            return;
        }

        generateAllSubsetSum(list,index+1,sum);
        generateAllSubsetSum(list,index+1,sum+list.get(index));

    }
    public boolean checkPowersOfThree(int n) {
        ArrayList<Integer> powerOfThree = new ArrayList<>();
        int currentNum = 1;
        while(currentNum<=10000000){
            powerOfThree.add(currentNum);
            currentNum*=3;
        }
        generateAllSubsetSum(powerOfThree,0,0);
        return set.contains(n);
        
    }
}