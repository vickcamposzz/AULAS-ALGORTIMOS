package biblioteca;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
	
	 private List<Livro> livros;

	    public Biblioteca() {
	        this.livros = new ArrayList<>();
	    }

	    public void adicionarLivro(Livro livro) {
	        livros.add(livro);
	    }

	    public boolean registrarEmprestimo(String titulo, String nome, String dataDevolucao) {
	        for (Livro livro : livros) {
	            if (livro.getTitulo().equals(titulo)) {
	                return livro.emprestar(nome, dataDevolucao);
	            }
	        }
	        return false;
	    }

	    public boolean verificarDisponibilidade(String titulo) {
	        for (Livro livro : livros) {
	            if (livro.getTitulo().equals(titulo)) {
	                return livro.disponivel();
	            }
	        }
	        return false;
	    }

	    public List<String> listarLivrosEmprestados() {
	        List<String> emprestados = new ArrayList<>();
	        for (Livro livro : livros) {
	            if (livro.isEmprestado()) {
	                emprestados.add(livro.getTitulo());
	            }
	        }
	        return emprestados;
	    }
}
