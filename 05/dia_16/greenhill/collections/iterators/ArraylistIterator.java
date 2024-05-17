package greenhill.collections.iterators;

import java.util.ArrayList;

public class ArraylistIterator <E> implements Iterator<E> {

    private ArrayList <E> lista;
    private int a = -1;

    ArraylistIterator(ArrayList<E> lista) {
        this.lista = lista;
    }

    @Override
    public E next() throws ErroEsperado {
        a++;
        if (lista.get(a) == null) {
            throw new ErroEsperado("Nao tem proximo!");
        }

        return (E)lista.get(a);

    }

    @Override
    public boolean hasNext() {
        
        if (lista.get(a + 1) == null) {
            return false;
        } else {
            return true;
        }
    }

}
