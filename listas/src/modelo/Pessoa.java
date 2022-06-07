package modelo;

import java.util.List;
import java.util.Objects;

public class Pessoa {
	
	// PRESIZA INPLEMENTA A CLASE BASICO 
	
	private String nome ;
	private String cpf ;
	private Sexo sexo ;
	
	
	public String getNome() {
		return nome;
	}


	protected void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Sexo getSexo() {
		return sexo;
	}


	protected void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}


	@SuppressWarnings("unlikely-arg-type")
	public void removerSexo(List<Pessoa> lista ) {
		Pessoa p = new Pessoa();
	//	List<Pessoa> lista = new ArrayList<Pessoa>();
		// SUSPEITO QUE NESSE METODO NOS ESTAMOS MECHENDO COM OUTRA LISTA

		

		for (int i = 0; i < lista.size(); i++) {
			
			
			
			
		}
		
		
		
		
	}
	
	public static void imprimirTudo(List<Pessoa> lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(" Pessoa:"+(i + 1) + " de " + lista.size() + lista.get(i) );
			
		}
	}


	public Pessoa(String nome, String cpf, Sexo sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public Sexo testeSexo(int sexo) {
		
		Sexo sexoo ;
		
		switch (sexo) {
		case 0: {
			sexoo = Sexo.FEMININO;
			
			
			return sexoo ;
		}
		case 1: {
			sexoo = Sexo.MASCULINO;
			
			
			return sexoo ;
		}
		case 2: {
			sexoo = Sexo.NAO_BINARIO;
			
			
			return sexoo ;
		}
		default:
			System.out.println("valor invalido");
			return null ;
		}
		
		
		
	}


	
	public Pessoa() {
		super();
	}



	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}





	
	
	
	
	

}
