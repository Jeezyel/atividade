package metodos;

import java.time.LocalDate;

public class Compra {
	
	LocalDate agora = LocalDate.now();
	
	
	
	private Cliente cliete;
	private LocalDate diaCompra = agora;
	private Produto produto ;
	
	
	
	public Cliente getCliete() {
		return cliete;
	}
	protected void setCliete(Cliente cliete) {
		this.cliete = cliete;
	}
	public LocalDate getDiaCompra() {
		return diaCompra;
	}
	public Produto getProduto() {
		return produto;
	}
	protected void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "Compra [cliete=" + cliete + ", produto=" + produto + "]";
	}
	public Compra(Cliente cliete, Produto produto) {
		super();
		this.cliete = cliete;
		this.produto = produto;
	}
	
	
		

}
