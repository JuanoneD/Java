package greenhill.collections.iterators;
import greenhill.collections.*;

public class LinkedListIterator<E> implements Iterator<E>
{
    
    private Node<E> atual;

    public LinkedListIterator(LinkedList<E> lista)
    {
    
        atual = (Node<E>) lista.get(0);

    }

    @Override
    public E next() throws IteratorException
    {

        if (atual == null) 
        {

            throw new IteratorException();
        }

        E aux = atual.getData();

        atual = atual.getNext();
        
        return aux;
    }

    @Override
    public boolean hasNext() 
    {
        if ( atual.getNext() == null) 
        {
            return false;
        }
    
        return true;
        
    }


}
