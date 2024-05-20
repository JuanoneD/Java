package greenhill.collections.stream;

import greenhill.collections.Arraylist;
import greenhill.collections.List;
import greenhill.collections.iterators.Iterable;
import greenhill.collections.iterators.Iterator;

import java.util.function.Function;

public class Stream<E>
{
    private Iterable<E> iterable;

    public Stream(Iterable<E> iterable) 
    {   
        this.iterable = iterable;
    }

    public <R> Stream<R> map(Function<E, R> func)
    {
        Iterator<E> it = iterable.iterator();
        Arraylist<R> result = new Arraylist<>();
         
        while (it.hasNext()) 
        {
            E value = it.next();
            R data = func.apply(value);
            result.add(data);
        }
        return result.stream();
    }

    public Stream<E> filter(Function<E, Boolean> func)
    {

        Iterator<E> it = iterable.iterator();

        while (it.hasNext()) {

            
            
        }
        

    }

    public List<E> collect()
    {
        
    }
}