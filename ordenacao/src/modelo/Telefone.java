package modelo;

public class Telefone implements Imprimir{
	
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
	public Telefone(String codegoArea, String numero) {
		super();
		this.codegoArea = codegoArea;
		this.numero = numero;
	}
	@Override
	public void imprimir() {
		System.out.println("codego de area: " + getCodegoArea());
		System.out.println("numero: " + getNumero());
		
	}
	
	

}
