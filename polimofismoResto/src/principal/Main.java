package principal;

import secundario.Pessoa;
import secundario.PessoaFisica;
import secundario.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pp = new Pessoa(12 , "paulo" , "paulo@gmail.com");
		PessoaFisica pf = new PessoaFisica (24 , "gabriel" , "gabriel@gmail.com" , "516813651" , " (63)99888-4545 ");
		PessoaJuridica pj = new PessoaJuridica(21 , "nicolau" , "nicolau@gmail.com" , "6816816816/8168" , "868-66848" , "(63)8444-5464");
		
		System.out.println("-------------------------pessoa-----------------------");
		
		pp.imprimir();
		
		System.out.println("-------------------------pessoa fisica-----------------------");
		
		pf.imprimir();
		
		System.out.println("-------------------------pessoa juridica-----------------------");

		pj.imprimir();
		
		System.out.println("-------------------------metodos 1-----------------------");
		
		imprimir(pp);
		
		System.out.println("-------------------------metodos 2-----------------------");
		
		imprimir(pf);
		
		System.out.println("-------------------------metodos 3-----------------------");
		
		imprimir(pj);

	}
	private static void imprimir(Pessoa pessoa) {
		pessoa.imprimir();	
	}
/*	private static void imprimir(PessoaFisica pessoa) {
		pessoa.imprimir();	
	}
	private static void imprimir(PessoaJuridica pessoa) {
		pessoa.imprimir();	
	}
*/	
	/*
	 * 
	 * NÃO SEI O QUE O PROFESSOR QUERIA MAIS FOI ISSO QUE ENTENDI MAIS N FAZ SENTIDO ENTÃO VOU DEIXAR DESSA FORMA 
	 * 
	 * PROFESSOR SE VC TIVER VENDO ISSO ME RESPONDE O QUE QUERIA OU N JA QUE O SENHO VAI RESPONDER ESSA ATIVIDADE NA AULA
	 * 
	public static void imprimir(Pessoa pp ,PessoaFisica pf , PessoaJuridica pj ) {
		
		if(pp instanceof Pessoa) {
			pp.imprimir();	
		}
		
		else if( pf instanceof PessoaFisica ){
			System.out.println("CPF: " + ((PessoaFisica)pf).getCpf());
		}
		
		else {
			System.out.println("CPF: " +((PessoaJuridica)pj).getCnpj());
		}
	}*/

}
