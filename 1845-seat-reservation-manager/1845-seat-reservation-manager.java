class SeatManager {
    PriorityQueue<Integer> pq;
    public SeatManager(int n) {
        pq = new PriorityQueue<>(n);
        for(int i = 1;i<=n;i++){
            pq.add(i);
        }
    }
    
    public int reserve() {
        int min = pq.peek();
        pq.remove(min);
        return min;
    }
    
    public void unreserve(int seatNumber) {    
        pq.add(seatNumber);

    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */