package secundario;

public class Pessoa {
	
	//PREENCHA ESSA INFORMAÇÃO NAS CLASS FILHAS MAS VAI TER QUE CRIA DOIS 
	//METODOS DE CADATRO OU JA USA O CONTRUTOR 
	
	private Integer id ;
	private String nome ;
	private String email ;

	
	///////////GET E SET//////////
	
	protected Integer getId() {
		return id;
	}
	protected void setId(Integer id) {
		this.id = id;
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	
	///////// METODOS ////////
	
	public void imprimir () {
		System.out.println(" nome: " + getNome()
						   + "\n Id: " + getId()
						   + "\n email: " + getEmail());
	}
	public Pessoa(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	
	
}
