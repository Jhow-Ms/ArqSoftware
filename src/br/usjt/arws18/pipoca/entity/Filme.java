package br.usjt.arws18.pipoca.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Filme {
	
	private int id;
	private String titulo;
	private String diretor;
	private String descricao;
	private Genero genero;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dataLancamento;
	private String posterPath;
	private double popularidade;
	
	public int getId() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String nome) {
		this.titulo = nome;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getPosterPath() {
		return posterPath;
	}
	
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	
	public double getPopularidade() {
		return popularidade;
	}
	
	public void setPopularidade(double popularidade) {
		this.popularidade = popularidade;
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", diretor=" + diretor + ", descricao=" + descricao + ", genero="
				+ genero + ", dataLancamento=" + dataLancamento + ", posterPath=" + posterPath + ", popularidade="
				+ popularidade + "]";
	}

	
	
	
	
	
}
