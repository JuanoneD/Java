

public class Node<T> {
    private Node next = null;
    private Node prev = null;
    private T data;

    Node(T data){
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getNext() {
        return next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return prev;
    }

    public T getData() {
        return data;
    }
    

}
