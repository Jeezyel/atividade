package metodos;

public class Moto extends Veiculo {

	public Moto(String nome, Integer cilindrada, Float peso, Float aceleracao, Float velocidade) {
		super(nome, cilindrada, peso, aceleracao, velocidade);
		
	}

	@Override
	public void imprimir() {
		System.out.println("dados dos veiculo nome: " + getNome() + " , \n peso: " +  getPeso() + " , \n cilindrada: " + getCilindrada() + " , \n velocidade: " + getVelocidade());
		
	}

	@Override
	public void acelerar(Veiculo veiculo) {
		veiculo.setAceleracao(veiculo.getAceleracao() + 5);
		
	}

}
