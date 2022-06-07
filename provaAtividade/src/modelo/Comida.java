package modelo;

import java.time.LocalDate;

public class Comida extends Produto {
	private Integer peso ;
	private TipoComida tipoComida;
	
	
	public Comida(String nome, Double valor, LocalDate data, Integer peso, TipoComida tipoComida) {
		super(nome, valor, data);
		this.peso = peso;
		this.tipoComida = tipoComida;
	}
	public Comida() {
		
	}
	
	@Override
	public String toString() {
		return "Comida [peso=" + peso + ", tipoComida=" + tipoComida + "]";
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public TipoComida getTipoComida() {
		return tipoComida;
	}
	public void setTipoComida(TipoComida tipoComida) {
		this.tipoComida = tipoComida;
	}

}
