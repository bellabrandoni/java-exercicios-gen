/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package com.generation.cliente.model;

public class Cliente {
	//apresentando atributos
	private String nome;
	private String email;
	private int telefone;
	private int registro;
	
	// métodos referentes a esta classe
	
	public Cliente(String nome, String email, int telefone, int registro) {
		this.nome = nome;//criação do objeto nome e recebimento do nome
		this.email = email;
		this.telefone = telefone;
		this.registro = registro;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	//criando metodo visualizar
	
}
