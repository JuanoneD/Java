package greenhill.collections;

public class Hash<T>  extends Sonic {
    
    private ArrayList<LinkedList<DataHash<T>>> array;
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
        int j;
        
        LinkedList<T> newList = new LinkedList<>();
        LinkedList<T> list;
        
        newList.add(data);

        if ( array.get( index % capacity ) == null){

            array.add(newList);
            
            array.set(index % capacity, newList);

            setSize(getSize() + 1);

            return;
        }

        newList = array.get(index % capacity);

        // if( newList.getSize() > numeroMagicoDaYas ){ ///// Não da pra duplicar depois de feito pq a chave vai ser perdida

        //     capacity *= 2;

        //     ArrayList<LinkedList<T>> copy = new ArrayList<>(capacity);

        //     for(int i = 0; i < array.getSize(); i ++){

        //         list = array.get(i);

        //         if ( list.get(0) != null){
        //             j = 0;

        //             while ( list.get(j) != null) {
                        
        //                 copy.set(i, list.get(j));

        //             }

        //         }
 
        //     }

        // }

        newList.add(data);

        setSize( getSize() + 1);

    }

    public T get(int index){



    }

    

}
