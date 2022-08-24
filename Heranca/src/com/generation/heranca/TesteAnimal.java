package com.generation.heranca;

import com.generation.heranca.model.Cachorro;
import com.generation.heranca.model.Cavalo;
import com.generation.heranca.model.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		/*Criando objeto cachorro*/
		Cachorro cao = new Cachorro("Frida",2,"late");
		cao.visualizar();
		
		/*Criando objeto cavalo*/
		Cavalo c1 = new Cavalo("Pocotó",10 ,"relincha");
		c1.visualizar();
		
		Preguica c2 = new Preguica("Sono",13,"boceja");
		c2.visualizar();
	}
	
}
