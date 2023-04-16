class Node{
    String data;
    Node next;
    Node prev;
    Node(String data){
        this.data = data;
    }
}
public class DoublyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public String removeFirst(){
        if (head == null){
            throw new RuntimeException("List is Empty");
        }else if (head == tail){
            Node data = head;
            head = tail = null;
            size--;
            return data.data;
        }
        else {
            Node data = head;
            head = head.next;
            head.prev = null;
            size--;
            return data.data;
        }
    }
    public void print(){
        Node curr = head;
        System.out.print(head.data.charAt(0) + " => ");
        while (curr != null){
            if (curr.next != null){
                System.out.print(curr.data.substring(1) + ", ");
            }else {
                System.out.print(curr.data.substring(1));
            }
            curr = curr.next;
        }
        System.out.println();
    }
}
