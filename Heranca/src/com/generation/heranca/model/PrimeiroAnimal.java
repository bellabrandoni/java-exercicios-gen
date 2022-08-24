package com.generation.heranca.model;

public class PrimeiroAnimal {
	private	String nome;
	private int idade;
	private String som;
	
	public PrimeiroAnimal(String nome, int idade, String som) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public void visualizar() {
		System.out.println("O nome do animal é: " + nome);
		System.out.println("A idade é: " + idade);
		System.out.println("O som emitido é: " +som);
	}
}
