import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaImpressao fila = new FilaImpressao();
        int opcao;

        do {
            System.out.println("\n1 - Adicionar");
            System.out.println("2 - Imprimir próximo");
            System.out.println("3 - Exibir fila");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID Aluno: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome arquivo: ");
                    String nome = sc.nextLine();
                    System.out.print("Número páginas: ");
                    int paginas = sc.nextInt();
                    fila.adicionarTrabalho(new Trabalho(id, nome, paginas));
                    break;
                case 2:
                    fila.imprimirProximo();
                    break;
                case 3:
                    fila.exibirFila();
                    break;
            }
        } while (opcao != 0);
    }
}