package greenhill.collections;

import greenhill.collections.iterators.HashIterator;
import greenhill.collections.iterators.Iterable;
import greenhill.collections.iterators.Iterator;
import greenhill.collections.stream.Stream;

public class Hash<T>  extends Sonic  implements Iterable<T> 
{
    
    private Arraylist<LinkedList<DataHash<T>>> array;
    private int capacity;

    public Hash(int size){

        capacity = size;

        array = new Arraylist<>(capacity);

        for (int i = 0;i < capacity;i++){

            array.add(null);

        }
        
    }

    public Hash()
    {

        capacity = 8;
        array = new Arraylist<>(capacity);

        for (int i = 0;i < capacity;i++){

            array.add(null);

        }

    }

    public void add(int index, T data)
    {

        int j;
        
        DataHash<T> dataHash = new DataHash<T>(index, data);
        LinkedList<DataHash<T>> list;
        

        if ( array.get( index % capacity ) == null)
        {
        
            list = new LinkedList<>();
            
            list.add(dataHash);

            array.set(index % capacity, list);

            setSize(getSize() + 1);

            return;
        }

        list = array.get(index % capacity);

        if( list.getSize() > capacity)
        { 

            capacity *= 2;

            Hash<T> copy = new Hash<>(capacity);

            for(int i = 0; i < capacity; i ++)
            {

                list = array.get(i);

                if ( list.get(i) != null)
                {
                    j = 0;

                    while ( list.get(j) != null) 
                    {

                        copy.add(list.get(j).getIndex(), list.get(j).getData());

                        j++;

                    }

                }
 
            }

            array = copy.getArray();

            list = array.get(index % capacity);

        }

        list.add(dataHash);

        setSize( getSize() + 1);

    }

    public T get(int index)
    {

        LinkedList<DataHash<T>> list;

        int j;

        list = array.get(index % capacity );

        if ( list != null)
        {

            j = 0;

            while ( list.get(j) != null) 
            {
                if ( list.get(j).getIndex() == index)
                {

                    return list.get(j).getData();

                }

                j++;

            }

        }

        return null;

    }

    private Arraylist<LinkedList<DataHash<T>>> getArray() 
    {

        return array;

    }
    public LinkedList<DataHash<T>> getList(int index)
    {

        return array.get(index);

    }

    
    public int getCapacity() 
    {
        return capacity;
    }


    @Override
    public Iterator<T> iterator() {

        return new HashIterator<T>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }
}