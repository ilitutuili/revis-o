public class Main {
    public static void main(String[] args) {
        Playlist pl = new Playlist();
        pl.adicionar("Imagine", "John Lennon");
        pl.adicionar("Bohemian Rhapsody", "Queen");
        pl.adicionar("Billie Jean", "Michael Jackson");

        System.out.println("Lista:");
        pl.listar();

        System.out.println("\nRemovendo 'Bohemian Rhapsody'...");
        pl.remover("Bohemian Rhapsody");

        System.out.println("\nLista após remoção:");
        pl.listar();
    }
}
