package greenhill.collections;

import greenhill.collections.iterators.StackIterator;
import greenhill.collections.stream.Stream;
import greenhill.collections.iterators.Iterator;
import greenhill.collections.iterators.Iterable;

public class Stack<T> extends Sonic implements Iterable<T> {

    Node<T> head;

    Stack() {

        head = null;

    }

    public void push(T data) {

        Node<T> newNode = new Node<T>(data);

        newNode.setPrev(head);

        head = newNode;

        setSize(getSize() + 1);

    }

    public T pop() {

        T aux = head.getData();

        head = head.getPrev();

        setSize(getSize() - 1);

        return aux;

    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator<T>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }
}
