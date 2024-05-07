

public class Node<T> {
    private Node<T> next = null;
    private Node<T> prev = null;
    private T data;

    Node(T data){
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public Node<T> getNext() {
        return next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public T getData() {
        return data;
    }
    

}
