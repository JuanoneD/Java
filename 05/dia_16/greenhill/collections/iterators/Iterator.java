package greenhill.collections.iterators;

public interface Iterator<E> 
{

    public E next() throws IteratorException;

    public boolean hasNext();
    
}