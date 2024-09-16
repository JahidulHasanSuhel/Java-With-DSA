
public class AllBasics {
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
    public static int size;

    public void AddFirst(int data){
        Node newNode = new Node( data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    } 
    public void AddAtPosition(int indx, int data){

        if(indx == 0){
            AddFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while( i < indx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void Print(){
        // if(head == null){
        //     System.out.println("ll is empty ");
        //     return;
        // }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int RemoveFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public static void main(String[] args) {

        AllBasics ll = new AllBasics();
        // ll.Print();
        // ll.AddFirst(2);
        // ll.Print();
        // ll.AddFirst(1);
        // ll.Print();
        // ll.AddLast(3);
        // ll.Print();
        // ll.AddLast(4);
        // ll.Print();

        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(4);
        ll.AddLast(5);

        ll.AddAtPosition(2, 3 );

        ll.Print();
        System.out.println(ll.size);
        ll.RemoveFirst();
        
        ll.Print();
        System.out.println(ll.size);

    }
}
 