package greenhill.collections;

import greenhill.collections.iterators.Iterable;
import greenhill.collections.iterators.Iterator;
import greenhill.collections.stream.Stream;
import greenhill.collections.iterators.ArraylistIterator;

public class Arraylist<T>  extends List<T> implements Iterable<T> 
{

    private T [] array;

    public Arraylist(int size)
    {

        array = ( T[] ) ( new Object[size] );

    }

    public Arraylist()
    {

        array = ( T[] ) ( new Object[10] );

    }


    @Override
    public void add(T value) 
    {
        if(getSize() == array.length )
        {
            T[] copy = (T[])(new Object[ array.length * 2]);

            for( int i = 0; i < array.length ; i ++) {
                copy[i] = array[i];
            }

            array = copy;
        }

        array[getSize()] = ( T ) (value);

        setSize(getSize() + 1);

    }


    @Override
    public T get(int index) 
    {

        if (index < 0 || index >= getSize())
            throw new ArrayIndexOutOfBoundsException();

        return array[index];

    }

    @Override
    public void set(int index, Object value) 
    {
        
        if (index < 0 || index >= getSize())
            throw new ArrayIndexOutOfBoundsException(); 

        array[index] = ( T ) (value);

    }



    @Override
    public Iterator<T> iterator() 
    {
        return new ArraylistIterator<T>(this);
    }

    @Override
    public Stream<T> stream() {
        return new Stream<>(this);
    }

}
