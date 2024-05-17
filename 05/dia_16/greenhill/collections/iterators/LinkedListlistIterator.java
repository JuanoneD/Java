package greenhill.collections.iterators;
import greenhill.collections.*;

public class LinkedListlistIterator<E> implements Iterator<E>
{

    // private LinkedList<E> lista;
    
    private Node<E> atual;

    LinkedListlistIterator(LinkedList<E> lista)
    {
    
        atual = (Node<E>) lista.get(0);

    }

    @Override
    public E next() throws ErroEsperado{

        if (atual == null) {

            throw new ErroEsperado("Nao tem proximo!");
        }

        E aux = atual.getData();

        atual = atual.getNext();
        
        return aux;
    }

    @Override
    public boolean hasNext() {
        if ( atual.getNext() == null) {
            return false;
        }
    
        return true;
        
    }


}
