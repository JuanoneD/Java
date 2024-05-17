package greenhill.collections;

public class Queue<T> extends Sonic {
    
    private Node<T> head;
    private Node<T> tail;

    Queue(){

        head = null;
        tail = null;

    }

    public void enqueue( T data ){

        Node<T> newNode = new Node<T>(data);

        if ( head == null){

            head = newNode;
            tail = newNode;

            setSize(getSize() +  1);
            
            return;

        }

        tail.setNext(newNode);

        tail = newNode;

        setSize( getSize() + 1);
    }

    public T dequeue(){

        T aux = head.getData();

        head = head.getNext();

        setSize( getSize() - 1);

        return aux;
    }


}
