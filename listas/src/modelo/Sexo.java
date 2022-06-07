package modelo;

public enum Sexo {
	
	FEMININO(0 , "Feminino") , MASCULINO(1 , "Masculino") , NAO_BINARIO(2 , "Não_Binario");
	
	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	private Integer id ;
	private String descricao ;
	
	
	
	private Sexo(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	
	

}
