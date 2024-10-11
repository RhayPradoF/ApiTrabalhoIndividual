package br.com.serratec.biblioteca.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Embeddable
public class Publicacao {
	
	
	
	@NotNull
	@NotBlank(message="Nome do autor e obrigatório, por favor preencha-o!")
	@Size(max=80, min=2, message = "Nome do autor deve ter no máximo {max} caracteres.")
	@Column(name = "autor", nullable = false, length =80)
	private String autor;
	
	@NotNull(message="Preencha a data de Publicação!!")
	@Column(name = "data_publicacao", nullable = false)
	private LocalDate dataPublicacao;
	
	@Column
	private String editora;
	
	public Publicacao() {}


	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
}

