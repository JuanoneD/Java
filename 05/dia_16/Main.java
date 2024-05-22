
import greenhill.collections.*;
import greenhill.collections.iterators.HashIterator;

public class Main 
{
    
    public static void main(String[] args) 
    {
        Hash<Integer> hash =  new Hash<Integer>(4);

        hash.add(0, 23);
        hash.add(1, 1);
        hash.add(2, 2);
        hash.add(3, 3);
        hash.add(8, 4);

        HashIterator<Integer> it = new HashIterator<Integer>(hash);

        while (it.hasNext()) {

            System.out.println(it.next());
        }

        List<String> value = hash
            .stream()
            .map(i -> i.toString())
            .filter(s -> s.length() < 2)
            .collect();

        System.out.println("valor "+ value.get(0));


        // Arraylist<Integer> list = new Arraylist<>();
        // list.add(1);
        // list.add(2);
        // list.add(30);

        // List<String> values = list
        //     .stream()
        //     .map(i -> i.toString())
        //     .filter(s -> s.length() < 2)
        //     .collect();


        // System.out.println("VALOr "+values.get(1));
    }

    
}
