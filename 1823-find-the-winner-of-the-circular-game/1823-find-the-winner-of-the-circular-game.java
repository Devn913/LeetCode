class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=n;i++) q.add(i);
        int counter = 0;
        while(q.size()!=1){
            while(counter!=k-1){
                q.add(q.remove());
                counter++;
            }
            q.remove();
            counter = 0;
        }
        return q.peek();
    }
}