package greenhill.collections.iterators;
import greenhill.collections.*;

public class QueueIteratorr<E> implements Iterator<E> {

    private Queue<E> lista;

    QueueIteratorr(Queue<E> lista) {
        this.lista = lista;

    }

    @Override
    public E next() throws ErroEsperado {

        if (lista.getSize() == 0) {
            throw new ErroEsperado("Nao tem proximo!");
        }

        return (E) lista.dequeue();

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
