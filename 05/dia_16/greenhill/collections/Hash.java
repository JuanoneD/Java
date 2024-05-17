package greenhill.collections;

public class Hash<T>  extends Sonic {
    
    private ArrayList<LinkedList<T>> array;
    private int capacity;

    Hash(int size){

        capacity = size;

        array = new ArrayList<>(capacity);
        
    }

    Hash(){

        capacity = 8;
        array = new ArrayList<>(capacity);

    }

    public void add(int index, T data){

        int numeroMagicoDaYas = 735;
        
        LinkedList<T> newList = new LinkedList<>();
        newList = array.get(index % capacity);

        newList.add(data);

        if ( newList == null){

            array.add(newList);
            
            array.set(index % capacity, newList);

            setSize(getSize() + 1);

            return;
        }

        

        if( newList.getSize() > numeroMagicoDaYas ){

            capacity *= 2;

            ArrayList<LinkedList<T>> copy = new ArrayList<>(capacity);

            for(int i = 0; i < array.getSize(); i ++){

                if ( array.get(i).get(0) != null){

                }
 
            }

        }

        

        


    }

    public T get(int index){


    }

    

}
