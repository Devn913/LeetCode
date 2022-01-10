class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        int prev = 1;
        int next = 1;
        int curr = next+prev;
        list.add(prev);
        list.add(next);
        int index = 1;
        while(curr<=k){
            list.add(curr);
            prev = next;
            next = curr;
            curr = next+prev;
            index++;
        }
        if(curr == k) return 1;
        int counter = 0;
        while(k!=0){
            int val = list.get(index);
            if(val>k){
                list.remove(index);
                index--;
            }
            else{
                k-=val;
                counter++;
            }
        }
        return counter;
    }
}