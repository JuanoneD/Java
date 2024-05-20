package greenhill.collections.iterators;
import greenhill.collections.*;

public class StackIterator<E> implements Iterator<E> 
{

    private Stack<E> lista;

    public StackIterator(Stack<E> lista) 
    {
        this.lista = lista;
    }

    @Override
    public E next() throws IteratorException 
    {

        if (lista.getSize() == 0) 
        {
            throw new IteratorException();
        }

        return lista.pop();

    }

    @Override
    public boolean hasNext() 
    {
        if (lista.getSize() == 0) 
        {
            return false;
        } else {
            return true;
        }
    }

}
