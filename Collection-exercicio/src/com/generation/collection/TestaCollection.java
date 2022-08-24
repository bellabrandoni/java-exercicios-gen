package com.generation.collection;

import java.util.ArrayList;

public class TestaCollection {

	public static void main(String[] args) {
		ArrayList<String>Estoque = new ArrayList <String>();
		/*Adicionando itens no array */
		Estoque.add("Calça");
		Estoque.add("Vestido");
		Estoque.add("Blusa");
		Estoque.add("Boné");
		Estoque.add("Tênis");
		System.out.println(Estoque);
		
		/*Removendo itens do array*/
		Estoque.remove(0);
		System.out.println(Estoque);
		
		/*Adicionando +1 item*/
		Estoque.add("Sandália");
		System.out.println(Estoque);
	}
	
}
