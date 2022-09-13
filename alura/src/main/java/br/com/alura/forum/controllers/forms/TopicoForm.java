package br.com.alura.forum.controllers.forms;

public class TopicoForm {

	
	private String titulo;
	private String mensagem;
	private String nomeCruso;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCruso() {
		return nomeCruso;
	}
	public void setNomeCruso(String nomeCruso) {
		this.nomeCruso = nomeCruso;
	}
	
	
}