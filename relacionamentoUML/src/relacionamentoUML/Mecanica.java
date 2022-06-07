package relacionamentoUML;

public class Mecanica {
	private String nomeCliente;
	private float horarioChegada ;
	private int qtdCarro;
	private String modeloCarro ;
	private Carro carro ;

	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public float getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(float horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
	public int getQtdCarro() {
		return qtdCarro;
	}
	public void setQtdCarro(int qtdCarro) {
		this.qtdCarro = qtdCarro;
	}
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
