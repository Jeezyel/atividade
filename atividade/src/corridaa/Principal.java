package corridaa;

import java.util.Random;

public class Principal {
	
	//Pze, faz uma classe abstrata pras velocidades,
	//arrancada, turbo(se tiver) velocidade constante,
	//e cria as classes carro, moto, bicicleta sla e
	//seta os valores e chama na main quem ganha


	public static void main(String[] args) {
		Random ra = new Random();
		
		Moto[] moto = new Moto[4];
		
		for (int i = 0; i < moto.length; i++) {
			
			Moto mmoto = new Moto();
			int x = 0;
			x++;
			moto[x].peso = ra.nextInt(22); 
			
			mmoto.peso = moto[x].peso;
			
			
		}
		
		for (int i = 0; i < moto.length; i++) {
			System.out.println(moto[i].peso);
			
		}
		



	}

}
