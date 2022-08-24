package com.generation.heranca.model;

public class Cachorro extends PrimeiroAnimal {
	
	private String correr;

	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
	
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public void visualizar(){
		super.visualizar();
		System.out.println("O cachorro está correndo ");
	}
	
}
