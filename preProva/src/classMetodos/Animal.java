package classMetodos;

public class Animal {
	private Float tamanho ;
	private Float peso ;
	private String habitate ;
	
	
	protected Float getTamanho() {
		return tamanho;
	}
	protected void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}
	protected Float getPeso() {
		return peso;
	}
	protected void setPeso(Float peso) {
		this.peso = peso;
	}
	protected String getHabitate() {
		return habitate;
	}
	protected void setHabitate(String habitate) {
		this.habitate = habitate;
	}
	
	///////////////////////////////////////////////////////////////
	
	protected Animal(Float tamanho, Float peso, String habitate) {
		this.tamanho = tamanho;
		this.peso = peso;
		this.habitate = habitate;
	}
	@Override
	public String toString() {
		return "Animal [tamanho=" + tamanho + ", peso=" + peso + ", habitate=" + habitate + "]";
	}
	
	
	

}
