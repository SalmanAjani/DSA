public class LL {

    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // add first
    public void addFirst(String data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print list
    public void printList(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;

        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public int getSize(){
        return size;
    }

    static void main(String[] args) {

        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("This");
        System.out.println(list.getSize());
    }
}
