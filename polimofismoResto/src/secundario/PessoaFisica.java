package secundario;

public class PessoaFisica extends Pessoa{
	
	private String cpf ;
	private String celular ;
	
	
	////// GET E SET //////
	
	protected String getCpf() {
		return cpf;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}
	protected String getCelular() {
		return celular;
	}
	protected void setCelular(String celular) {
		this.celular = celular;
	}
	
	///////METODOS //////
	
	//INPRIMIR DE DUAS FORMAS VOU DIXAR A FORMA QUE O PROFESSOR FAZ DESPOS TIRA A DUVIDA 
	
	/*
	@Override
	public void imprimir() {
		
		super.imprimir();
		System.out.println(" cpf: " + getCpf() +
						   "\n celular: " + getCelular());
	}
	*/
	
	@Override
	public void imprimir() {
		
		System.out.println(" nome: " + getNome()
		   + "\n Id: " + getId()
		   + "\n email: " + getEmail());
		
		System.out.println(" cpf: " + getCpf() +
						   "\n celular: " + getCelular());
	}
	public PessoaFisica(Integer id, String nome, String email, String cpf, String celular) {
		super(id, nome, email);
		this.cpf = cpf;
		this.celular = celular;
	}
	
	
	

}
