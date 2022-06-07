package relacionemento;

public class Funcionario {
	private String nome ;
	private Funcionario chefeImediato;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the chefeImediato
	 */
	public Funcionario getChefeImediato() {
		return chefeImediato;
	}
	/**
	 * @param chefeImediato the chefeImediato to set
	 */
	public void setChefeImediato(Funcionario chefeImediato) {
		this.chefeImediato = chefeImediato;
	}
	
	public void imprimir() {
		
		System.out.println("nome: " + getNome() );
		if(this.getChefeImediato() == null)
			System.out.println("Não tem chefe");
		else
			System.out.println("chefe: " + getChefeImediato().getNome() );
		System.out.println("-----------------------------------");
		
	}

}
