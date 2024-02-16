package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livro> livro = new ArrayList<>();
	
	public Biblioteca() {
	}
	
	public Biblioteca (List<Livro> livro) {
		this.livro = livro;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void addLivro(Livro livros) {
		livro.add(livros);
	}
	public void removeLivro(Livro livros) {
		livro.remove(livros);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------- Livros Disponível ---------------\n");
		for(Livro l : livro) {
			sb.append(l.toString());
			sb.append("\n");
		}
		return sb.toString()
;		
	}
	
	

}
