package projetoLoja;

public class Produto {

String nome;
Integer preco;

public Produto(String nome, double preco) {
	
	this.nome = nome;
	this.preco = (int) preco;
	
}

@Override

public String toString() {
    return nome + " - R$ " + preco;
}

	
}


	
	
	
	

