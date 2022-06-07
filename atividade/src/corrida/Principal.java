package corrida;

import java.util.Scanner;

public class Principal {
	
	//Pze, faz uma classe abstrata pras velocidades,
	//arrancada, turbo(se tiver) velocidade constante,
	//e cria as classes carro, moto, bicicleta sla e
	//seta os valores e chama na main quem ganha

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//CADASTRO DAS EQUIPE
		
		//for (int i = 0; i < 4; i++) {
			
			System.out.println(" qual e o nome da equipe ");
		//	Carro1.carro1.nome = leia.next(); 
			
			System.out.println(" qual tipo do veiculo ex: moto, carro, caminhão ");
			Carro1.carro1.tipo = leia.next();
			
			System.out.println(" qual e o poso do veiculo ");
			Carro1.carro1.peso = leia.nextFloat();
			
			System.out.println(" qual e o de 0 a 100 ");
			Carro1.carro1.aceleração = leia.nextFloat();
			
			System.out.println(" qual a cilidrada o veiculo ");
			Carro1.carro1.cilindrada  = leia.nextFloat();
			
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			
			System.out.println(Carro1.carro1.dados());
			
			
	//	}
		
			
		
		
		

	}

}
