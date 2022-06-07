package corrid;

public class Corrida {

	public static void main(String[] args) {
		
		
		
		Veiculo carro1 = new Veiculo (1000 , 2.0);
		Veiculo carro2 = new Veiculo (2000 , 2.0);
		Veiculo carro3 = new Veiculo (1500 , 1.5);
		Veiculo carro4 = new Veiculo (1600 , 1.6);
		
		Veiculo moto1 = new Veiculo (150 , 0.15);
		Veiculo moto2 = new Veiculo (400 , 0.4);
		Veiculo moto3 = new Veiculo (100 , 0.1);
		Veiculo moto4 = new Veiculo (600 , 0.6);
		
		
		corrida(carro1);
		corrida(carro2);
		corrida(carro3);
		corrida(carro4);
		
		corrida(moto1);
		corrida(moto2);
		corrida(moto3);
		corrida(moto4);
		
		
		
		Veiculo.toString(carro1);
		Veiculo.toString(carro2);
		Veiculo.toString(carro3);
		Veiculo.toString(carro4);
		
		System.out.println("-------------------------------------------");

		Veiculo.toString(moto1);
		Veiculo.toString(moto2);
		Veiculo.toString(moto3);
		Veiculo.toString(moto4);
		
		
		
		
		

	}
	public static Veiculo corrida (Veiculo veiculo ) {
		
		for (int i = 0; i < 20; i++) {
		
			if( (i == 6  ||  i == 11  ||  i == 15) ) {
				Veiculo.frear(veiculo);
			}
			else {
				Veiculo.aceleração(veiculo);
			}		
		}	
		return veiculo ;	
	}

}
