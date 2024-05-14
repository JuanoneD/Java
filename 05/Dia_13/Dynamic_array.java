
public class Dynamic_array<T> {
    private T[] array;
    private int size = 0;

    Dynamic_array(int size){

        this.size = size;

        array = ( T[] ) ( new Object[size] );

        for( int i = 0; i < size; i ++){

            array[i] = null;

        }
    }


    void add(T value, int index){

        if(index >= array.length){

            T[] arraycpy = ( T[] ) ( new Object[2* array.length] );

            for(int i = 0; i < array.length; i ++){

                arraycpy[i] = array[i];
            }

            array = arraycpy;
        }

        size ++;
        array[index] = value;

    }

    public T getvalue(int index){

        if(index >= size){
            return null;
        }

        return array[index];

    }
    

    public int getSize() {
        return size;
    }
}
