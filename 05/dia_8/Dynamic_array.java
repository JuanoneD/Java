
public class Dynamic_array<T> {
    private T[] array;
    private int size = 0;

    Dynamic_array(){

        array = ( T[] ) ( new Object[10] );
    }


    public void add(T value){

        if(size == array.length){

            T[] arraycpy = ( T[] ) ( new Object[2* array.length] );

            for(int i = 0; i < array.length; i ++){

                arraycpy[i] = array[i];
            }

            array = arraycpy;
        }

        array[size ++] = value;

    }

    public T getValue(int index){

        return array[index];

    }


    public void remove(int index){

        array[index] = array[--size];

    }


    public int getSize() {
        return size;
    }
    
}
