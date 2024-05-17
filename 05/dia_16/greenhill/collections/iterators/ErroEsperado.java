package greenhill.collections.iterators;

class ErroEsperado extends Exception {
    String title;

    ErroEsperado(String title) {
        this.title = title;
    }
}