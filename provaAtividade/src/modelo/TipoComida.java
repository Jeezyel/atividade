package modelo;

public enum TipoComida {
	
	CARNE(1 , "Carne"), FRUTAVERDURA (2 , "Fruta e Verdura") , MISTO(3 , "Misto");
	
	
	
	Integer id ;
	String descricao ;
	
	
	
	TipoComida(Integer id, String descricao) {
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
