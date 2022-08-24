package com.generation.heranca.model;

public class Preguica extends PrimeiroAnimal {
	private String subir;

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
	
	}

	public String getSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}
	public void visualizar(){
		super.visualizar();
		System.out.println("O preguica está subindona árvore ");
	}

}
