
public class LList {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {

        LList ll = new LList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        
    }
}
