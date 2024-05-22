package greenhill.collections.iterators;

import greenhill.collections.Arraylist;

public class ArraylistIterator <E> implements Iterator<E> 
{

    private Arraylist <E> lista;
    private int a = -1;

    public ArraylistIterator(Arraylist<E> lista)
    {
        this.lista = lista;
    }

    @Override
    public E next() throws IteratorException 
    {
        a++;
        if (lista.get(a) == null) 
        {
            throw new IteratorException();
        }

        return (E)lista.get(a);

    }

    @Override
    public boolean hasNext() 
    {
        
        if (a + 1 >= lista.getSize()){
            return false;
        } else {
            return true;
        }
    }

}
