package metodos;

public class Cliente {

	private String nome ;
	private String cpf ;
	private Nacimento nacimento;
	
	//ACHO MELHOR CRIAR UMA CLASS NACIMENTO E COLOCAR LA IDADE DIA , MES , ANO NACIMENTO ETC
	
	
	
	
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
	public Cliente(String nome, String cpf, Nacimento nacimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nacimento = nacimento;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", nacimento=" + nacimento + "]";
	}
	
	
	
	
	

}
