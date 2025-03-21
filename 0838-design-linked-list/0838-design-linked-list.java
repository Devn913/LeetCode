class MyLinkedList {
    // Double Linked List;
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
            next = null;
            prev = null;
        }
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1; // out of index

        Node temp = head;
        int  currentIndex = 0;
        while(currentIndex!=index){
            temp = temp.next;
            currentIndex++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        if(size == 0){
            Node newNode = new Node(val);
            head = newNode;
            tail = newNode;
            size++;
            return;
        }else{
            Node newNode = new Node(val);
            newNode.next = head;
            head.prev    = newNode;
            head = newNode;
            size++;
            return;
        }
    }
    // 1<->2<->3<->null
//     h       t   <>4
    public void addAtTail(int val) {
        if(size == 0){
            addAtHead(val);
        }else{
            Node newNode = new Node(val);
            newNode.prev = tail;
            tail.next    = newNode;
            tail = newNode;
            size++;
        }
    }
    // 1<->2<->3<->4<->null
    // 0  t  1   2   3
    //   t   

    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        int currentIndex = 0;
        Node temp        = head;
        while(currentIndex<index-1){
            temp = temp.next;
            currentIndex++;
        }
        Node next = temp.next;
        newNode.next = next;
        newNode.prev = temp;
        temp.next = newNode;
        next.prev = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;

        if(index == 0) {
            if(size == 1){
                head = tail = null;
                size = 0;
                return;
            }else{
                head = head.next;
                head.prev = null;
                size--;
                return;
            }
        }else if(index == size - 1){
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }else{
            int currentIndex = 0;
            Node temp = head;
            while(currentIndex<index-1){
                temp = temp.next;
                currentIndex++;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;

        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */