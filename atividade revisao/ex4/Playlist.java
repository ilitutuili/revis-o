class Playlist {
    Musica inicio = null;

    public void adicionar(String titulo, String artista) {
        Musica nova = new Musica(titulo, artista);
        if (inicio == null) {
            inicio = nova;
        } else {
            Musica atual = inicio;
            while (atual.proxima != null)
                atual = atual.proxima;
            atual.proxima = nova;
        }
    }

    public void remover(String titulo) {
        Musica atual = inicio, anterior = null;

        while (atual != null && !atual.titulo.equals(titulo)) {
            anterior = atual;
            atual = atual.proxima;
        }

        if (atual == null) {
            System.out.println("Música não encontrada.");
            return;
        }

        if (anterior == null)
            inicio = atual.proxima;
        else
            anterior.proxima = atual.proxima;

        System.out.println("Música removida!");
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        Musica atual = inicio;
        while (atual != null) {
            System.out.println(atual.titulo + " - " + atual.artista);
            atual = atual.proxima;
        }
    }
}