package arraylinkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        int n = 0;
        Node current = this.head;
        while (current != null) {
            n++;
            current = current.next;
        }
        return n;
    }
    
    public Object get(int idx) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        int n = 0;
        Node current = this.head;
        while (current != null) {
            if (n == idx) {
                return current.val;
            }
            n++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public void set(int idx, Object o) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        int n = 0;
        Node current = this.head;
        while (current != null) {
            if (n == idx) {
                current.val = o;
                return;
            }
            n++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public void insert(int idx, Object o) {
        Node newNode = new Node();
        newNode.val = o;
        if(idx == 0) {
            newNode.next = head; //point the new node towards the existing head
            head = newNode; //assign new node as head
            
        }
        Node current = this.head;
        for(int i = 0; i < idx; i++) {
            current = current.next;
        } newNode.next = current.next;
        current.next = newNode;
    }
    
    public void remove(int idx) {
        Node current = this.head;
        for(int i = 0; i < idx; i++) {
            current = current.next;
        } current.next = (current.next).next;
    }
    
    public int append(Object o) {
        if (this.head == null) {
            this.head = new Node();
            this.head.val = o;
            return 1;
        }
        int n = 1;
        Node current = this.head;
        Node prev = null;
        while (current != null) {
            n++;
            prev = current;
            current = current.next;
        }
        prev.next = new Node();
        prev.next.val = o;
        return n;
    }
    
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.append("hi");
        list.append("yo");
        list.append("bye");
        list.set(1, "au revoir");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

}

class Node {
    public Object val;
    public Node next;
    

}