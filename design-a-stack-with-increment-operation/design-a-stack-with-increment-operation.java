class CustomStack {
    private int[] arr;
    private int nextIndex;
    private int fixSize;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        nextIndex = 0;
        fixSize = maxSize;
    }
    
    public void push(int x) {
        if(nextIndex ==fixSize ){
            return;
        }
        arr[nextIndex] = x;
        nextIndex++;
    }
    
    public int pop() {
        if(nextIndex==0) return -1;
        nextIndex--;
        return arr[nextIndex];
    }
    
    public void increment(int k, int val) {
        int counter = 0;
        while(counter<k && counter<nextIndex){
            arr[counter] = arr[counter] + val;
            counter++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */