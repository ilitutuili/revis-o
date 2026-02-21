import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Editor editor = new Editor();
        String comando;

        while (true) {
            comando = sc.nextLine();

            if (comando.startsWith("INSERIR")) {
                editor.inserir(comando.substring(8));
            } else if (comando.startsWith("REMOVER")) {
                int n = Integer.parseInt(comando.split(" ")[1]);
                editor.remover(n);
            } else if (comando.equals("DESFAZER")) {
                editor.desfazer();
            } else if (comando.equals("REFAZER")) {
                editor.refazer();
            } else if (comando.equals("IMPRIMIR")) {
                editor.imprimir();
            }
        }
    }
}