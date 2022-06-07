package metodos;

public abstract class Veiculo implements Imprimir{
	
	private String nome ;
	private Integer cilindrada ;
	private Float peso ;
	private Float aceleracao ;
	private Float velocidade ;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(Float aceleracao) {
		this.aceleracao = aceleracao;
	}
	public Float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Float velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	public void frear (Veiculo veiculo) {
		
		veiculo.aceleracao += ((25 * veiculo.aceleracao) / 100);
		
		
	}
	public abstract void acelerar(Veiculo veiculo);
	public Veiculo(String nome, Integer cilindrada, Float peso, Float aceleracao, Float velocidade) {
		super();
		this.nome = nome;
		this.cilindrada = cilindrada;
		this.peso = peso;
		this.aceleracao = aceleracao;
		this.velocidade = velocidade;
	} 
	
	

}
