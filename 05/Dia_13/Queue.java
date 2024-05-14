

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;


    Queue(){

        this.head = null;
        this.tail = null;
        size = 0;

    }


    public void enqueue(T data){

        Node<T> newNode =  new Node<T>(data);

        size++;

        if(head == null){

            this.head = newNode;
            this.tail = newNode;

            return;
        }

        this.tail.setNext(newNode);
        newNode.setPrev(this.tail);
        this.tail = newNode;

    }

    public T dequeue(){

        if(head == null){

            return null;

        }

        T data = (T) this.head.getData();


        this.head = head.getNext();

        // head.setPrev(null);

        this.size --;
        return data;

    }

    public T peek(){

        T data = (T) this.head.getData();

        return data;

    }

    public int getSize() {
        return size;
    }

}
