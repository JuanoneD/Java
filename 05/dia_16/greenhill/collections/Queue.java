package greenhill.collections;

import greenhill.collections.iterators.QueueIteratorr;
import greenhill.collections.stream.Stream;
import greenhill.collections.iterators.Iterable;
import greenhill.collections.iterators.Iterator;


public class Queue<T> extends Sonic implements Iterable<T>
{

    private Node<T> head;
    private Node<T> tail;

    Queue() 
    {

        head = null;
        tail = null;

    }

    public void enqueue(T data) 
    {

        Node<T> newNode = new Node<T>(data);

        if (head == null) 
        {

            head = newNode;
            tail = newNode;

            setSize(getSize() + 1);

            return;

        }

        tail.setNext(newNode);

        tail = newNode;

        setSize(getSize() + 1);
    }

    public T dequeue() 
    {

        T aux = head.getData();

        head = head.getNext();

        setSize(getSize() - 1);

        return aux;
    }

    @Override
    public Iterator<T> iterator() 
    {
        return new QueueIteratorr<T>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }

}
