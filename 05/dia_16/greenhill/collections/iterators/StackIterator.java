package greenhill.collections.iterators;
import greenhill.collections.*;

public class StackIterator<E> implements Iterator<E> {

    private Stack<E> lista;

    StackIterator(Stack<E> lista) {
        this.lista = lista;
    }

    @Override
    public E next() throws ErroEsperado {

        if (lista.getSize() == 0) {
            throw new ErroEsperado("Nao tem proximo!");
        }

        return lista.pop();

    }

    @Override
    public boolean hasNext() {
        if (lista.getSize() == 0) {
            return false;
        } else {
            return true;
        }
    }

}
