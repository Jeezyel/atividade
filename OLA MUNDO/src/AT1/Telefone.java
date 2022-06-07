package AT1;

public class Telefone {
	
	private String codegoArea ;
	private String numero ;
	
	
	public String getCodegoArea() {
		return codegoArea;
	}
	public void setCodegoArea(String codegoArea) {
		this.codegoArea = codegoArea;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone [codegoArea=" + codegoArea + ", numero=" + numero + "]";
	}
	
}
