
public class Hash {

    int capacity;
    
    Dynamic_array<NodeHash> hash;

    Hash(int capacity){

        this.capacity = capacity;

        hash = new Dynamic_array<>(capacity);
    }
    
    public void add(int data){

        NodeHash new_node = new NodeHash(data, null);

        if( hash.getvalue( data % capacity ) == null ){

            hash.add(new_node, data % capacity );

            return;
        }

        NodeHash current = hash.getvalue( data % capacity );

        while( current.getNext() != null){

            current = current.getNext();

        }

        current.setNext(new_node);

    }


    public boolean contains(int value){

        if( hash.getvalue( value % capacity ) == null){

            return false;

        }

        NodeHash current = hash.getvalue( value % capacity );

        while (current != null) {

            if( current.getData() == value){

                return true;

            }

            current = current.getNext();

        }

        return false;

    }





}
