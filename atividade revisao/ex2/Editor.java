import java.util.Stack;

class Editor {
    String texto = "";
    Stack<String> desfazer = new Stack<>();
    Stack<String> refazer = new Stack<>();

    public void inserir(String t) {
        desfazer.push(texto);
        texto += t;
        refazer.clear();
    }

    public void remover(int n) {
        desfazer.push(texto);
        texto = texto.substring(0, texto.length() - n);
        refazer.clear();
    }

    public void desfazer() {
        if (!desfazer.isEmpty()) {
            refazer.push(texto);
            texto = desfazer.pop();
        }
    }

    public void refazer() {
        if (!refazer.isEmpty()) {
            desfazer.push(texto);
            texto = refazer.pop();
        }
    }

    public void imprimir() {
        System.out.println(">> " + texto);
    }
}
