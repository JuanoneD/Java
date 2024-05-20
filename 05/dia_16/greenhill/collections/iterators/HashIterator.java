package greenhill.collections.iterators;
import greenhill.collections.*;

public class HashIterator<E> implements Iterator<E> 
{

    private Hash<E> hash;

    private int positionArray;
    private Node<DataHash<E>> current;

    public HashIterator(Hash<E> hash)
    {

        this.hash = hash;
        positionArray = -1;

    }

    @Override
    public E next() throws IteratorException 
    {

        if ( current == null )
        {

            if ( positionArray < hash.getCapacity())
            {

                positionArray ++;

                current = hash.getList(positionArray).getHead();

            }else{

                throw new IteratorException();

            }  
            
        }

        E aux = current.getData().getData();

        current = current.getNext();

        return aux;
  
    }


    @Override
    public boolean hasNext() 
    {

        if ( current == null )
        {

            if ( positionArray < hash.getCapacity())
            {

                return true;

            }else{

                return false;

            }  
            
        }
        
        return true;
        
    }
    
}
