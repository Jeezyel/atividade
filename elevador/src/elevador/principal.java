package elevador;

import java.util.Scanner;

public class principal {
	
	// FAZER A PARTE DE COLOCAR E TIRAR PESSOAS DO ELEVADOR 

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Elevador elevador = new Elevador(0 , 0 , 0 , 0f);
		
		int andar, andarDT , quantPessoa , entrada , saida ;
		float pesoTotal;
		
		//andar = 4 ;
		//andarAT = 1;
		//quantPessoa = 2;
		//pesoTotal = 99 ;
		
		
		
		System.out.println("em que andar estamas  \n 1  2  3 \n  \n 4  5  6 ");
		andar = leia.nextInt();
		
		System.out.println("quantidade de pessoas ");
		quantPessoa = leia.nextInt();
		
		System.out.println(" a soma do peso de todos ");
		pesoTotal = leia.nextFloat();
		
		System.out.println("a onde quer ir \n 1  2  3 \n  \n 4  5  6 ");
		andarDT = leia.nextInt();
		
		elevador = new Elevador(andar , andarDT , quantPessoa , pesoTotal);
		
		

		if(elevador.verificador()) {
			elevador.levandoEntrada();
			
			//ISSO E PARA SE REPETIR ATE TODOS SAIR
			
			while (elevador.getQuantPessoa() >= 0 ){
					
				System.out.println(" quantos vão sair  ");
				saida = leia.nextInt();
		
				elevador.levadorSaida(saida);
				
				System.out.println(" quantos vão entrar  ");
				entrada = leia.nextInt();
				
				if((entrada + elevador.getQuantPessoa()) <= elevador.getPessoaMax() && (entrada + elevador.getQuantPessoa())  <= 0 ) {
					elevador.entrada(entrada);
				}
				
				
				System.out.println(" procimo andra ");
				andar = leia.nextInt();
				
				if(andar > 0 && andar <= 6  ) {
					
					elevador.setAndar(andar);
						
					System.out.println(" quantos vão sair  ");
					saida = leia.nextInt();
					
					elevador.levadorSaida(saida);
				}	
			}
		}
	}

}
