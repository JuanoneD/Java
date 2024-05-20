package greenhill.collections.iterators;

import greenhill.collections.stream.Stream;

public interface Iterable<E> 
{
    public Iterator<E> iterator();
    public Stream<E> stream();
}
