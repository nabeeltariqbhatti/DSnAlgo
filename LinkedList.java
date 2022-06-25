/**
 * creation date  June 25, 2022
 *
 * @author Nabeel Tariq Bhatti
 */

class Node<T> {

    private Node<T> next;
    private Node<T> pre;
    private T data;
    public Node(Node<T> next,Node<T> pre, T data){
        this.next = next;
        this.pre = pre;
        this.data = data;
    }

    public void setPre(Node<T> pre) {
        this.pre = pre;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPre() {
        return pre;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                " data=" + data +
                '}';
    }
}

public class LinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    public void insert(T data){
        Node<T> node = new Node<>(null,null,data);
        if(head == null){
            head = node;
            tail = head;
        }else {
            node.setPre(tail);
            tail.setNext(node);
            tail = tail.getNext();
            tail.setNext(null);
        }
    }
    public T searchNodeWithValue(T data){
        Node<T> current = head;
        while (current!=null){
            if(current.getData() == data){
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }
    public void insertAtHead(T data){
        Node<T> node  = new Node<>(null,null,data);
        if(head==null){
            insert(data);
        }else if(head!=null){
            head.setPre(node);
            node.setNext(head);
            head = head.getPre();
            head.setPre(null);
        }
    }
    public void print(){
        Node<T> current = head;
        while(current!=null){
            System.out.println(current);
            current = current.getNext();
        }
    }
}
