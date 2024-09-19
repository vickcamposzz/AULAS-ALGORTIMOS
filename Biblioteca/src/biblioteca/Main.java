package biblioteca;
import java.util.List;
public class Main {
	 public static void main(String[] args) {
	        Biblioteca biblioteca = new Biblioteca();

	    
	        Livro livro1 = new Livro("1984", "George Orwell", 1949);
	        Livro livro2 = new Livro("Brave New World", "Aldous Huxley", 1932);
	        biblioteca.adicionarLivro(livro1);
	        biblioteca.adicionarLivro(livro2);

	       
	        boolean emprestimoRealizado = biblioteca.registrarEmprestimo("1984", "Maria", "2024-09-30");
	        if (emprestimoRealizado) {
	            System.out.println("Empréstimo realizado com sucesso.");
	        } else {
	            System.out.println("O livro já está emprestado.");
	        }

	      
	        boolean disponibilidade = biblioteca.verificarDisponibilidade("1984");
	        if (disponibilidade) {
	            System.out.println("O livro '1984' está disponível.");
	        } else {
	            System.out.println("O livro '1984' não está disponível.");
	        }

	       
	        List<String> emprestados = biblioteca.listarLivrosEmprestados();
	        System.out.println("Livros emprestados: " + emprestados);
	    }
}
