package entities;

import java.time.Year;

public class Livro {
	
	private String titulo;
	private Year anoPublicado;
	private Autor autor;
	
	public Livro() {
	}

	public Livro(String titulo, Year anoPublicado, Autor autor) {
		this.titulo = titulo;
		this.anoPublicado = anoPublicado;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Year getAnoPublicado() {
		return anoPublicado;
	}

	public void setAnoPublicado(Year anoPublicado) {
		this.anoPublicado = anoPublicado;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo: " + titulo + " | Ano publicado: " + anoPublicado + " | Autor: " + autor.getName() );
		return sb.toString();
		
	}


	

	

}
