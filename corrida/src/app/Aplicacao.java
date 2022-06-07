package app;

import metodos.Carro;
import metodos.Moto;

public class Aplicacao {

	public static void main(String[] args) {
		
		Moto moto = new Moto("TT" , 150 ,(float)1.2 , (float)0.5 , (float)0.0);
		Moto moto1 = new Moto("PP" , 200 ,(float)1.5 , (float)0.6 , (float)0.0);
		
		Carro carro = new Carro("F1" , 1000 ,(float)2.2 , (float)0.4 , (float)0.0);
		Carro carro1 = new Carro("FE" , 1500 ,(float)3.2 , (float)0.3 , (float)0.0);
		
		Aplicacao apli = new Aplicacao();
		
		apli.corrida(moto);
		apli.corrida(moto1);
		apli.corrida(carro);
		apli.corrida(carro1);
		
		moto.imprimir();
		moto1.imprimir();
		carro.imprimir();
		carro1.imprimir();
		
		

		
	}
	public /* Veiculo */void corrida (Moto veiculo ) {
		
		for (int i = 0; i < 20; i++) {
		
			if( (i == 6  ||  i == 11  ||  i == 15) ) {
				veiculo.frear(veiculo);
			}
			else {
				veiculo.acelerar(veiculo);
			}		
		}	
//		return veiculo ;	
	}
	
	public /* Veiculo */void corrida (Carro veiculo ) {
		
		for (int i = 0; i < 20; i++) {
		
			if( (i == 6  ||  i == 11  ||  i == 15) ) {
				veiculo.frear(veiculo);
			}
			else {
				veiculo.acelerar(veiculo);
			}		
		}	
//		return veiculo ;	
	}

}
