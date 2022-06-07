package aplicacao;

import java.util.Scanner;

import classMetodos.Cachorro;
import classMetodos.Gato;

/*
 * BORA FAZER UMA CALCULADORA COMUN SO PARA PASSA O TEMPO
 */

public class Aplicacao {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Gato gato = new Gato((float)0.90 , (float)2.5 , "domestico" , "chanel" , "rua" , 2 );
		Cachorro dog = new Cachorro ((float)0.90 , (float)2.5 , "domestico" , "brutus" , "pator alemão" , 2 );
		
		
		System.out.println(dog.toString());
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println(gato.toString());
		

		
		
		
		
		
		leia.close();
	}

}
