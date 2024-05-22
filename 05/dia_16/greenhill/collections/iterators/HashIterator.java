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
        current = null;

    }

    @Override
    public E next() throws IteratorException 
    {

        if ( current == null )
        {
                do{
                    positionArray ++;
                    current = hash.getList(positionArray).getHead();

                }while (current == null &&  positionArray < hash.getCapacity());


                if (current == null)
                    throw new IteratorException();
                
                

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

            if ( positionArray < hash.getCapacity()-1)
            {
                int i = positionArray;
                do{

                    i ++;

                }while ( hash.getList(i) == null &&  i < hash.getCapacity()-1);

                if (hash.getList(i) == null){

                    return false;
                }
                    

            }else{

                return false;

            }  
            
        }
        
        return true;
        
    }
    
}
