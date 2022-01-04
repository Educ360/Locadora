package br.com.locadora.beans;

import java.util.Scanner;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private int idade;
	static int qntCli=0;
	
	Scanner s = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	//metodos
	public int somaId() {
		return this.idCliente= qntCli++;
	}
	
	public void cadastraCliente() {
		System.out.print("Insira seu nome: ");
		setNome(s.nextLine());
		System.out.print("Insira seu anos: ");
		setIdade(s.nextInt());
		System.out.print("Insira o cpf: ");
		setCpf(s.next());
	}
	
	public void alugarFilme() {
		
	}
	
	public void devolverFilme() {
		
	}
	
	

}
