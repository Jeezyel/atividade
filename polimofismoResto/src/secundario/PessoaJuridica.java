package secundario;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj ;
	private String inscricaoEstadual ;
	private String telefoneFixo ;
	
	//////GET E SET ////////
	
	protected String getCnpj() {
		return cnpj;
	}

	protected void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	protected String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	protected void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	protected String getTelefoneFixo() {
		return telefoneFixo;
	}

	protected void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	
	////// METODOS ///////
	
	//INPRIMIR DE DUAS FORMAS VOU DIXAR A FORMA QUE O PROFESSOR FAZ DESPOS TIRA A DUVIDA 
	
	/*
	@Override
	public void imprimir() {
		
		super.imprimir();
		System.out.println(" cnpj: " + getCnpj() + 
						   "\n inscricaoEstadual: " + getInscricaoEstadual() +
						   "\n telefone fixo: " + getTelefoneFixo());
	}
	*/
	
	@Override
	public void imprimir() {
		
		System.out.println(" nome: " + getNome()
		   + "\n Id: " + getId()
		   + "\n email: " + getEmail());
		
		System.out.println(" cnpj: " + getCnpj() + 
						   "\n inscricaoEstadual: " + getInscricaoEstadual() +
						   "\n telefone fixo: " + getTelefoneFixo());
	}

	public PessoaJuridica(Integer id, String nome, String email, String cnpj, String inscricaoEstadual,
			String telefoneFixo) {
		super(id, nome, email);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.telefoneFixo = telefoneFixo;
	}
	
	 

}
