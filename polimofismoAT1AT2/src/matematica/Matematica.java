package matematica;

public class Matematica {
	
	//////METODOS ///////
	
	public int mais (int num1 , int num2 ) {
		int num = 0;
		
		num = num1 + num2;

		return num ;
		
	}
	public int mais (double num1 , double num2 ) {
		int num = 0;
		
		num = (int) (num1 + num2);

		return num ;
		
	}
	public int mais (int num1 , double num2) {
		
		int num = 0 ;
		
		num = num1 + (int) num2;
		
		return num ;
		
	}
	//////////////////////////////////////////
	public int menos (int num1 , int num2 ) {
		int num = 0;
		
		num = num1 - num2;

		return num ;
		
	}
	public int menos (double num1 , double num2 ) {
		int num = 0;
		
		num = (int) (num1 - num2);

		return num ;
		
	}
	public int menos (int num1 , double num2) {
		
		int num = 0 ;
		
		num = num1 - (int) num2;
		
		return num ;
		
	}
	///////////////////////////////////////////
	public int dividi (int num1 , int num2 ) {
		int num = 0;
		
		num = num1 / num2;

		return num ;
		
	}
	public int dividi (double num1 , double num2 ) {
		int num = 0;
		
		num = (int) (num1 / num2);

		return num ;
		
	}
	public int dividi (int num1 , Double num2) {
		
		int num = 0 ;
		
		num = num1 / (int) ((double) num2);
		
		return num ;
		
	}
	////////////////////////////////////////////
	public int mutiplicar (int num1 , int num2 ) {
		int num = 0;
		
		num = num1 * num2;

		return num ;
		
	}
	public int mutiplicar (double num1 , double num2 ) {
		int num = 0;
		
		num = (int) (num1 * num2);

		return num ;
		
	}
	public int mutiplicar (int num1 , double num2) {
		
		int num = 0 ;
		
		num = num1 * (int) num2;
		
		return num ;
		
	}
	

}
