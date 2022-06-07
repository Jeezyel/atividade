package elevador;

public class Elevador {
	
	private static int andarMin = 1;
	private static int andarMax = 6;
	private static int andar;
	private static int andarDestino;
	private static int quantPessoa;
	private static int pessoaMax = 7;
	private static float pesoMax = 500;
	private static float pesoAtual;
	private static boolean portaAbreta = false ;
	
	//////GET E SET //////
	public static int getAndarDestino() {
		return andarDestino;
	}
	
	public static void setAndarDestino(int andarAtual) {
		andarDestino = andarAtual;
	}
	
	public static int getAndar() {
		return andar;
	}

	public static void setAndar(int andar) {
		andar = andar;
	}

	public int getQuantPessoa() {
		return quantPessoa;
	}

	public static void setQuantPessoa(int quantPessoa) {
		quantPessoa = quantPessoa;
	}

	public boolean isPortaAbreta() {
		return portaAbreta;
	}

	public void setPortaAbreta(boolean portaAbreta) {
		this.portaAbreta = portaAbreta;
	}
	public static float getPesoMax() {
		
		return pesoMax;
		
	}
	public static int getPessoaMax() {
		
		return pessoaMax;
		
	}
	public static int getAndarMax() {
		
		return andarMax;
		
	}
	public static int getAndarMin() {
		
		return andarMin;
		
	}

	//////METODOS ///////
	
	public Elevador(int andar , int andarDT , int quantPessoa,float pesoAT) {
		super();
		this.andar = andar;
		if(quantPessoa >= pessoaMax && quantPessoa >= 0 ) {
			this.quantPessoa = quantPessoa;
		}
		
		this.pesoAtual = pesoAT;
		this.andarDestino = andarDT;
		
	}
	
	public static boolean verificador() {
		boolean teste = false ;
		
		
		
		if(andar <= andarMax && andar >= andarMin ) {
			if(pessoaMax >= quantPessoa && 1 <= quantPessoa ) {			
				if(pesoMax >= pesoAtual && 0 <= pesoAtual ) {
					if(andarDestino <= andarMax &&  andarDestino >= andarMin ) {
						teste = true ;
					}
					else {
						System.out.println("erro destino não encontrado");
					}
				}
				else {
					System.out.println("erro super lotação");
				}
			}
			else {
				System.out.println("erro peso maximo atingido");
			}
		}
		else {
			System.out.println("erro andar não encontrado ");
		}
		return teste ;
	}
	
	public static void levandoEntrada ( ) {
		
		portaAbreta = true ;
		
		System.out.println(" -----------------"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " ----------------- "
				);
		
		System.out.println(" quem vai entrar ");
		andar = andarDestino;
		System.out.println(" -----------------"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " ----------------- "
				);
		
		portaAbreta = false ;
				
			
	}
	public static void levadorSaida( int saida) {
		
		portaAbreta = true ;
		
		System.out.println(" -----------------"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " ----------------- "
				);
		
		System.out.println(" quem vai sair ");
		quantPessoa = saida ;
		
		System.out.println(" -----------------"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " ----------------- "
				);
		
		portaAbreta = false ;
		
		
	}
	public static void entrada(int pessoaEntrada) {
		
		portaAbreta = true ;
		
		System.out.println(" -----------------"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " |               |"
				+          " ----------------- "
				);
		
		System.out.println(" quem vai sair ");
		quantPessoa = pessoaEntrada;
		System.out.println(" -----------------"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " |       |       |"
				+          " ----------------- "
				);
		
		portaAbreta = false ;
		
		
		
	}

}
