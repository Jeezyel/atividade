package corrida;

public class Corrida {
	
	public static float aceleração (float velocidadeAtula , float cilindrada , float peso ) {
		float VA = velocidadeAtula; 
		float cl = cilindrada ;
		float ps = peso;
		
		VA = VA + 5 ;
		VA += VA * ((15 * cl ) / 100) - (ps / 300) ;
		
		return VA ;
		
	}
	
	public static float frear(float velocidadeAtula ) {
		float va = velocidadeAtula;
		
		va = (25 * va) / 100;
		
		return va ;
		
	}

}
