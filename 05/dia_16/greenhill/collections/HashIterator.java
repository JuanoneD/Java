package greenhill.collections.iterators;
import greenhill.collections.*;

public class HashIterator<E> implements Iterator<E> {

    private Hash<E> hash;

    private int positionArray;
    private Node<DataHash<E>> current;

    HashIterator(Hash<E> hash){

        this.hash = hash;
        positionArray = -1;

    }

    

    @Override
    public E next() throws ErroEsperado {

        if ( current == null ){

            if ( positionArray < hash.getCapacity()){

                positionArray ++;

                current = hash.getList(positionArray).getHead();;

            }else{

                throw new ErroEsperado("Nao tem proximo!");

            }  
            
        }

        E aux = current.getData().getData();

        current = current.getNext();

        return aux;
  
    }

    public boolean hasNext(){

        if ( current.getNext() == null ){

            if ( positionArray >= hash.getCapacity() ){

                return false;

            }

        }

        return true;

    }

    
    
}
