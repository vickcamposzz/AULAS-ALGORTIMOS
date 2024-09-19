package biblioteca;

public class Livro {
	private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;
    private String nomeEmprestado;
    private String dataDeDevolucao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public boolean emprestar(String nome, String dataDevolucao) {
        if (!this.emprestado) {
            this.emprestado = true;
            this.nomeEmprestado = nome;
            this.dataDeDevolucao = dataDevolucao;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (this.emprestado) {
            this.emprestado = false;
            this.nomeEmprestado = null;
            this.dataDeDevolucao = null;
            return true;
        }
        return false;
    }

    public boolean disponivel() {
        return !this.emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}
