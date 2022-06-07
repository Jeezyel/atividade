package corrid;

public class Veiculo {

	public double peso ;
	public double aceleração = 0 ;
	//public static float  ;
	public double cilindrada ;
	
	public Veiculo(double peso , double cilindrada ) {
		
		this.peso = peso ;
		this.cilindrada = cilindrada; 
		
	}
	
	public Veiculo() {
		
	}
	
		public static Veiculo aceleração (Veiculo veiculo ) {
			
		veiculo.aceleração = veiculo.aceleração + 5;

		return veiculo ;
		
	}
		
	public static Veiculo frear(Veiculo veiculo ) {
		
			
		veiculo.aceleração += ((25 * veiculo.aceleração) / 100);
			
		return veiculo ;
			
	}

	public static void toString(Veiculo veiculo) {
		
		System.out.println( "Veiculo [peso=" + veiculo.peso + ", cilindrada=" + veiculo.cilindrada + " aceleração: " + veiculo.aceleração + "]");
	}
	
	

}
