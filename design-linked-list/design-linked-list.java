class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int value){
            val = value;
            next = null;
        }
    }
    
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp = head;
        int counter = 0;
        while(counter<index){
            temp  =temp.next;
            counter++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(size == 0){
            head = tail = temp;
        }else{
        temp.next = head;
        head = temp;
        }
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(size==0){
            head = tail = temp;
        }else{
        tail.next = temp;
        tail = temp;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index == size) addAtTail(val);
        else if(index==0) addAtHead(val);
        else if(index<0 || index>size) return;
        else{
            Node temp = head;
            int counter = 0;
            while(counter<index-1){
                counter++;
                temp = temp.next;
            }
            Node temp2 = new Node(val);
            temp2.next = temp.next;
            temp.next = temp2;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size) return;
        else if(index==0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        int counter = 0;
        while(counter<index-1){
            temp = temp.next;
            counter++;
        }
        if(index ==size-1){
            temp.next = null;
            tail =temp;
            size--;
        }else{
            temp.next = (temp.next).next;
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