package greenhill.collections.iterators;
import greenhill.collections.*;

public class QueueIteratorr<E> implements Iterator<E> 
{

    private Queue<E> lista;

    public QueueIteratorr(Queue<E> lista) 
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

        return (E) lista.dequeue();

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
