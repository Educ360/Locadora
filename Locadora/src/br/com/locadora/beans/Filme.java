package br.com.locadora.beans;

import java.util.Scanner;

public class Filme {
	private int idFilme;
	private String nome;
	private String genero;
	private int faixaEtaria;
	static int qntFilme=0;
	
	Scanner s = new Scanner(System.in);
	
	
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	// metodos
	public int somaId() {
		return this.idFilme= qntFilme++;
	}
	
	public void cadastraFilme() {
		setIdFilme(somaId());
		System.out.print("Insira o nome do filme: ");
		setNome(s.nextLine());
		System.out.print("Insira o gênero do filme: ");
		Genero g = new Genero();
		setGenero(g.selecionaGenero());
		System.out.print("Insira faixa etária: ");
		s.nextInt();
		System.out.println("Filme cadastrado com sucesso.");
		
	}
	
	public Filme[] filminho() {
		Filme[] f = new Filme[2];
		f[0] = new Filme(); 
		f[0].setNome("Lagoa Azul");
		f[0].setIdFilme(0);
		f[0].setGenero("Terror");
		f[0].setFaixaEtaria(16);
		
		f[1] = new Filme(); 
		f[1].setNome("Lagoa Azul 2");
		f[1].setIdFilme(1);
		f[1].setGenero("Terror");
		f[1].setFaixaEtaria(18);
		
		return f;
		
	}
	
	
	

}
