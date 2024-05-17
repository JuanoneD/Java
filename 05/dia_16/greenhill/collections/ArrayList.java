package greenhill.collections;

public class ArrayList<T>  extends List<T>{

    private T [] array;

    ArrayList(int size){

        array = ( T[] ) ( new Object[size] );
        
        setSize(size);

    }

    ArrayList(){

        array = ( T[] ) ( new Object[10] );

    }


    @Override
    public void add(Object value) {
        if(getSize() == array.length ){

            T [] copy = ( T[] ) ( new Object[ array.length * 2] );

            for( int i = 0; i < array.length ; i ++){

                copy[i] = array[i];

            }

            array = copy;
        }

        array[getSize()] = ( T ) (value);

        setSize(getSize() + 1);

    }


    @Override
    public T get(int index) {

        if (index < 0 || index >= getSize())
            throw new ArrayIndexOutOfBoundsException();

        return array[index];

    }

    @Override
    public void set(int index, Object value) {
        
        if (index < 0 || index >= getSize())
            throw new ArrayIndexOutOfBoundsException(); 

        array[index] = ( T ) (value);

    }


}
