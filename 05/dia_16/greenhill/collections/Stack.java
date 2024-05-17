package greenhill.collections;

public class Stack<T> extends Sonic {
    
    Node<T> head;

    Stack(){

        head = null;

    }

    public void push(T data){

        Node<T> newNode = new Node<T>(data);

        newNode.setPrev(head);

        head = newNode;

        setSize(getSize() +  1);

    }

    public T pop(){

        T aux = head.getData();

        head = head.getPrev();

        setSize(getSize() - 1);

        return aux;

    }
}
