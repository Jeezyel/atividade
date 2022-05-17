package metodos;

public enum Cor {
	
	BRANCO(1 , " Branco ", " 255.255.255 " ) , PRETO(2 , " Preto " ," 0.0.0 " ) , PRATA(3 , " Prata " , " 200,200,200 ") , AZUL(4 , " Azul " , " 0,0,255 ") ;
	
	private Integer id ;
	private String descricao;
	private String rgb ;
	
	Cor(Integer id , String descricao , String rgb ){
		this.descricao = descricao ;
		this.id = id ;
		this.rgb = rgb ;
		
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getRgb() {
		return rgb;
	}
	
	
	

}
