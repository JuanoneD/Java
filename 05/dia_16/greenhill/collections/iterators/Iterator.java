package greenhill.collections.iterators;

public interface Iterator<E> {

    public E next() throws ErroEsperado;

    public boolean hasNext();
    
}