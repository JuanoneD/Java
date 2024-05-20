package greenhill.collections.iterators;

class IteratorException extends RuntimeException 
{
    IteratorException() 
    {
        super("Função next() foi chamada por um iterador, porém, não existiam mais elementos no iterável.");
    }
}