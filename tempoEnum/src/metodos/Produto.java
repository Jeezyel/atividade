package metodos;

public class Produto {
	
	private String nome ;
	private Cor cor ;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public Produto(String nome, Cor cor) {
		super();
		this.nome = nome;
		this.cor = cor;
	}
	
	public String Cores() {
		
		for (Cor cor : Cor.values() ) {
			
			System.out.println(  cor.getId() + cor.getDescricao() + cor.getRgb() );
		}
		
		return " Fim ";
		
		
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", cor=" + cor + "]";
	}
	public Produto() {
		super();
	}
	
	
	
	

}
