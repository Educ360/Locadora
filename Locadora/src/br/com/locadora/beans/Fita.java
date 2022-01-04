package br.com.locadora.beans;

public class Fita {
	private int idFita;
	private Filme filme;
	static int qntdFita = 0;
	
	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public int getIdFita() {
		return idFita;
	}

	public void setIdFita(int idFita) {
		this.idFita = idFita;
	}
	
	public int somaId() {
		return this.idFita= qntdFita++;
	}
	
	public void criaFita(Filme filme) {
		setIdFita(somaId());
		this.filme = filme;
		
	}
	
	

}
