package greenhill.collections;

public class Hash<T>  extends Sonic {
    
    private Arraylist<LinkedList<DataHash<T>>> array;
    private int capacity;

    Hash(int size){

        capacity = size;

        array = new Arraylist<>(capacity);
        
    }

    Hash(){

        capacity = 8;
        array = new Arraylist<>(capacity);

    }

    public void add(int index, T data){

        int numeroMagicoDaYas = 735;
        int j;
        
        DataHash<T> dataHash = new DataHash<T>(index, data);
        LinkedList<DataHash<T>> list;
        

        if ( array.get( index % capacity ) == null){
            
            list = array.get( index % capacity);

            list = new LinkedList<>();
            
            list.add(dataHash);

            setSize(getSize() + 1);

            return;
        }

        list = array.get(index % capacity);

        if( list.getSize() > numeroMagicoDaYas ){ 

            capacity *= 2;

            Hash<T> copy = new Hash<>(capacity);

            for(int i = 0; i < capacity; i ++){

                list = array.get(i);

                if ( list.get(i) != null){
                    j = 0;

                    while ( list.get(j) != null) {

                        copy.add(list.get(j).getIndex(), list.get(j).getData());

                        j++;

                    }

                }
 
            }

            array = copy.getArray();

            list = array.get(index % capacity);

        }

        list.add(data);

        setSize( getSize() + 1);

    }

    public T get(int index){

        LinkedList<DataHash<T>> list;

        int j;

        for(int i = 0; i < capacity; i ++){

            list = array.get(i);

            if ( list.get(i) != null){

                j = 0;

                while ( list.get(j) != null) {

                    if ( index == list.get(j).getIndex() ){

                        return list.get(j).getData();

                    }

                    j++;

                }

            }

        }

        return null;

    }

    private Arraylist<LinkedList<DataHash<T>>> getArray() {

        return array;

    }
    public LinkedList<DataHash<T>> getList(int index){

        return array.get(index);

    }

    
    public int getCapacity() {
        return capacity;
    }


 

    

    

}
