package principal;

import matematica.Matematica;

public class Principal {

	public static void main(String[] args) {
		Matematica mate = new Matematica();
		
		System.out.println("mais");
		
		System.out.println(mate.mais(10 , 10));
		System.out.println(mate.mais(10.5 , 10.5 ));
		System.out.println(mate.mais(10 , 10.5 ));
		
		System.out.println("menos");
		
		System.out.println(mate.menos(10 , 10));
		System.out.println(mate.menos(10.5 , 10.5 ));
		System.out.println(mate.menos(10 , 10.5 ));
		
		System.out.println("dividi");
		
		System.out.println(mate. dividi(10 , 10));
		System.out.println(mate. dividi(10.5 , 10.5 ));
		System.out.println(mate. dividi(10 , 10.5 ));
		
		System.out.println("mutiplicar");
		
		System.out.println(mate.mutiplicar(10 , 10));
		System.out.println(mate.mutiplicar(10.5 , 10.5 ));
		System.out.println(mate.mutiplicar(10 , 10.5 ));

	}

}
