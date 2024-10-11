package br.com.serratec.biblioteca.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Livro {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(nullable = false, length =60)
	@NotBlank(message="Preencha o título!!")
	@Size(max = 60, min =1)
	private String titulo;
	
	@NotNull
	@Column(nullable = false)
	@NotBlank(message="Preencha a quantidade de Páginas!")
	private String qtdPaginas;
	
	@Embedded
	private Publicacao publicacao;
	
	public Livro() {}

	
	public Livro(Long id, String titulo, String qtdPaginas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(String qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	
	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
