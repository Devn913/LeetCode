class Solution {
    public boolean check(ArrayList<Integer> list){
        int low = 0;
        int high = list.size()-1;
        while(low<high){
            if(list.get(low) != list.get(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        ArrayList<Integer> list = new ArrayList<>();
        while(x!=0){
            list.add(x%10);
            x = x/10;
        }
        return check(list);
    }
}