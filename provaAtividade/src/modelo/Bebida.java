package modelo;

import java.time.LocalDate;

public class Bebida extends Produto {
	private Integer ml;
	private TipoBebida tipoBebida ;
	
	
	
	public Bebida(String nome, Double valor, LocalDate data, Integer ml, TipoBebida tipoBebida) {
		super(nome, valor, data);
		this.ml = ml;
		this.tipoBebida = tipoBebida;
	}
	
	public Bebida() {
		super();
	}

	@Override
	public String toString() {
		return "Bebida [ml=" + ml + ", tipoBebida=" + tipoBebida + "]";
	}

	public Integer getMl() {
		return ml;
	}
	public void setMl(Integer ml) {
		this.ml = ml;
	}
	public TipoBebida getTipoBebida() {
		return tipoBebida;
	}
	public void setTipoBebida(TipoBebida tipoBebida) {
		this.tipoBebida = tipoBebida;
	}
	
	

}
