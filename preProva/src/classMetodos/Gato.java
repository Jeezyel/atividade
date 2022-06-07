package classMetodos;

public class Gato extends Animal{
	
	private String nome ;
	private String spese ;
	private Integer idade ;
	
	
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getSpese() {
		return spese;
	}
	protected void setSpese(String spese) {
		this.spese = spese;
	}
	protected Integer getIdade() {
		return idade;
	}
	protected void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	public Gato(Float tamanho, Float peso, String habitate, String nome, String spese, Integer idade) {
		super(tamanho, peso, habitate);
		this.nome = nome;
		this.spese = spese;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", spese=" + spese + ", idade=" + idade +  ", Habitate=" + getHabitate() +
				", Peso=" + getPeso() +", Tamanho=" + getTamanho();
	}
	
	
	
	
	

	
	

}
