
public class Dynamic_array<T> {
    private T[] array;
    private int size = 0;

    Dynamic_array(){

        array = ( T[] ) ( new Object[10] );
    }


    void push(T value){

        if(size == array.length){

            T[] arraycpy = ( T[] ) ( new Object[2* array.length] );

            for(int i = 0; i < array.length; i ++){

                arraycpy[i] = array[i];
            }

            array = arraycpy;
        }

        array[size ++] = value;

    }

    public T pop() {

        size --;

        if(size < 0){

            return null;
        }
        
        return array[size];
    }

    public T peek(){

        if(size - 1 < 0){

            return null;
        }

        return array[size-1];
    }

    public int getSize() {
        return size;
    }
    
}
