class MinStack {
    class Node{
        int min;
        int val;
        Node next;
        Node(){}
        Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    Node head;
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if(head == null){
            head = new Node(val,val,null);
        }else{
            Node temp = new Node(val,Math.min(val,head.min),head);
            head = temp;    
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */