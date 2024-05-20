package greenhill.collections;

import greenhill.collections.iterators.Iterable;
import greenhill.collections.stream.Stream;
import greenhill.collections.iterators.*;


public class LinkedList<T> extends List<T>  implements Iterable<T> 
{

    private Node<T> head;
    private Node<T> tail;

    LinkedList() 
    {

        head = null;
        tail = null;

    }

    @Override
    public void add(Object value) 
    {

        Node newNode = new Node<T>((T) value);

        if (head == null) 
        {

            head = newNode;
            tail = newNode;

            setSize(getSize() + 1);

            return;

        }

        tail.setNext(newNode);
        newNode.setPrev(tail);

        tail = newNode;

        setSize(getSize() + 1);

    }

    @Override
    public T get(int index) 
    {

        Node<T> current = head;

        if (index < 0 || index >= getSize())
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < index; i++) 
        {

            current = current.getNext();
        }

        return current.getData();
    }

    @Override
    public void set(int index, Object value) 
    {

        Node<T> current = head;

        if (index < 0 || index >= getSize())
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < index; i++)
            current = current.getNext();

        current.setData((T) value);
    }

    public Node<T> getHead() 
    {
        return head;
    }

    @Override
    public Iterator<T> iterator() 
    {
        return new LinkedListIterator<T>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }

}
