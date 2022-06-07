package modelo;

public enum TipoBebida {
	
	ALCOOLICA(1 , "Carne"), NAO_ALCOOLICA (2 , "Fruta e Verdura") , LETAL(3 , "Letal");
	
	
	
	Integer id ;
	String descricao ;
	
	
	
	TipoBebida(Integer id, String descricao) {
		this.id = id ;
		this.descricao = descricao;
		
	}



	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
