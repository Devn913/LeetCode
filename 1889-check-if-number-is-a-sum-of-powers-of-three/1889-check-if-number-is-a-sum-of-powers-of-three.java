class Solution {

    // Approach 1: Pre-computation all possible sum of power of three
    
    HashSet<Integer> set = new HashSet<>(); 
    // function to generate sum of all subset of an array.
    public void generateAllSubsetSum(ArrayList<Integer> list, int index, int sum){
        if(index == list.size()){
            set.add(sum);
            return;
        }

        generateAllSubsetSum(list,index+1,sum);
        generateAllSubsetSum(list,index+1,sum+list.get(index));

    }
    public boolean checkPowersOfThree(int n) {
        // array to save all powers of three.
        ArrayList<Integer> powerOfThree = new ArrayList<>();
        
        int currentNum = 1;
        
        while(currentNum<=10000000){
            powerOfThree.add(currentNum);
            currentNum*=3;
        }
        // generate all subset sum of powers of three.
        generateAllSubsetSum(powerOfThree,0,0);
        return set.contains(n);
        
    }
}