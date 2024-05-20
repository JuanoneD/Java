package greenhill.collections;

public class Node<T>
{
    
    private Node<T> next;
    private Node<T> prev;
    private T data;

    Node(T data,Node<T> next,Node<T> prev)
    {

        this.data = data;
        this.next = next;
        this.prev = prev;

    }

    Node(T data)
    {

        this.data = data;
        this.next = null;
        this.prev = null;

    }

    public T getData() 
    {
        return data;
    }

    public Node<T> getNext() 
    {
        return next;
    }

    public Node<T> getPrev() 
    {
        return prev;
    }

    public void setData(T data) 
    {
        this.data = data;
    }

    public void setNext(Node<T> next) 
    {
        this.next = next;
    }

    public void setPrev(Node<T> prev) 
    {
        this.prev = prev;
    }

    
}
