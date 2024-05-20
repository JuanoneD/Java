package greenhill.collections;

public class DataHash<T>
{

    private T data;
    private int index;

    DataHash(int index,T data)
    {
        this.data = data;
        this.index = index;
    }
    
    public void setData(T data) 
    {
        this.data = data;
    }

    public void setIndex(int index) 
    {
        this.index = index;
    }

    public T getData() 
    {
        return data;
    }

    public int getIndex() 
    {
        return index;
    }
}