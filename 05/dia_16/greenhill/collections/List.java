package greenhill.collections;

abstract public class List<T> extends Sonic 
{
    
    abstract public T get(int index);

    abstract public void set(int index, T value);

    abstract public void add(T value);


}
