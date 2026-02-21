import java.util.LinkedList;
import java.util.Queue;

public class FilaImpressao {
    Queue<Trabalho> fila = new LinkedList<>();

    public void adicionarTrabalho(Trabalho t) {
        fila.add(t);
        System.out.println("Trabalho adicionado!");
    }

    public void imprimirProximo() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("Imprimindo: " + fila.poll());
        }
    }

    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            for (Trabalho t : fila) {
                System.out.println(t);
            }
        }
    }
}