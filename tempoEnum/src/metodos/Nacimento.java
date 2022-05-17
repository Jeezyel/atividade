package metodos;

import java.time.LocalDate;

public class Nacimento {
	
	private Integer idade ;
	private Integer diaNacimento ;
	private Integer mexNacimento ;
	private Integer anoNacimento ;
	
	
	LocalDate agora = LocalDate.now();
	
	private Integer dia = agora.getDayOfMonth() ;
	private Integer ano = agora.getYear();
	private Integer mes = agora.getDayOfMonth();
	
	
	public Integer getIdade() {
		return idade;
	}
	protected void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getDiaNacimento() {
		return diaNacimento;
	}
	protected void setDiaNacimento(Integer diaNacimento) {
		this.diaNacimento = diaNacimento;
	}
	public Integer getMexNacimento() {
		return mexNacimento;
	}
	protected void setMexNacimento(Integer mexNacimento) {
		this.mexNacimento = mexNacimento;
	}
	public Integer getAnoNacimento() {
		return anoNacimento;
	}
	protected void setAnoNacimento(Integer anoNacimento) {
		this.anoNacimento = anoNacimento;
	}

	public Nacimento(Integer diaNacimento, Integer mexNacimento, Integer anoNacimento) {
		super();
		this.diaNacimento = diaNacimento;
		this.mexNacimento = mexNacimento;
		this.anoNacimento = anoNacimento;
		
		if(  mexNacimento < mes && diaNacimento < dia) {
			this.idade = (( ano - anoNacimento) - 1 );
		}
		else {
			this.idade = ano - anoNacimento ;
		}
	}
	@Override
	public String toString() {
		return "Nacimento [" + ", idade=" + idade + ", diaNacimento=" + diaNacimento
				+ ", mexNacimento=" + mexNacimento + ", anoNacimento=" + anoNacimento + "]";
	}
	
	
	

}
