public class Trabalho {
    int idAluno;
    String nomeArquivo;
    int numeroPaginas;

    public Trabalho(int idAluno, String nomeArquivo, int numeroPaginas) {
        this.idAluno = idAluno;
        this.nomeArquivo = nomeArquivo;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Aluno: " + idAluno +
               " | Arquivo: " + nomeArquivo +
               " | Páginas: " + numeroPaginas;
    }
}