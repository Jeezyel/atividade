package corrid;

public class Veiculo {

	public double peso ;
	public double acelera��o = 0 ;
	//public static float  ;
	public double cilindrada ;
	
	public Veiculo(double peso , double cilindrada ) {
		
		this.peso = peso ;
		this.cilindrada = cilindrada; 
		
	}
	
	public Veiculo() {
		
	}
	
		public static Veiculo acelera��o (Veiculo veiculo ) {
			
		veiculo.acelera��o = veiculo.acelera��o + 5;

		return veiculo ;
		
	}
		
	public static Veiculo frear(Veiculo veiculo ) {
		
			
		veiculo.acelera��o += ((25 * veiculo.acelera��o) / 100);
			
		return veiculo ;
			
	}

	public static void toString(Veiculo veiculo) {
		
		System.out.println( "Veiculo [peso=" + veiculo.peso + ", cilindrada=" + veiculo.cilindrada + " acelera��o: " + veiculo.acelera��o + "]");
	}
	
	

}
