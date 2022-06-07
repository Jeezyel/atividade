package modelo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pessoa implements Imprimir {
	
	private String nome ;
	private Integer idade ;
	private Sexo sexo ;
	private Telefone telefone ;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", telefone=" + telefone + "]";
	}

	public Pessoa(String nome, Integer idade, Sexo sexo, Telefone telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	public Pessoa () {
		
	}
	@Override
	public void imprimir() {
		System.out.println("nome: " + getNome());
		System.out.println("idade: " + getIdade());
		System.out.println("sexo: " + getSexo());
		System.out.println("telefone: " + getTelefone());
		
	}
	public static Pessoa lerDados() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("qual e o seu nome: ");
		String nome = leia.next();
		
		System.out.println("qual e a sua idade: ");
		Integer idade = leia.nextInt();
		
		System.out.println("qual e o seu sexo sendo \n 0 - feminino \n 1 - masculino \n 2 - Não binario ");
		int sex = leia.nextInt();
		
		Sexo sexo = Sexo.FEMININO ;
		
		switch (sex) {
		case 0:
			sexo = Sexo.FEMININO;
			break;
			
		case 1:
			sexo = Sexo.MASCULINO;
			break;

		case 2:
			sexo = Sexo.NAO_BINARIO;
			break;
			
		default:
			System.out.println("valor invalido");
			
			break;
		}
		
		System.out.println("qual e o seu telefone:\n DDD \n Numero ");
		String condegoArea = leia.next();
		String numero = leia.next();
		
		Telefone telefone = new Telefone(condegoArea , numero);
		
		Pessoa pessoa = new Pessoa(nome , idade , sexo , telefone);
		return pessoa ;
	}
	public static void imprimirLista(List<Pessoa> listaPessoa) {
		
		for (int i = 0; i < listaPessoa.size(); i++) {
			
			System.out.println( listaPessoa.get(i) );
			
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void imprimirLista(List<Pessoa> listaPessoa , Sexo sexo) {
		Pessoa pessoa = new Pessoa();
		
		for (Pessoa Plista : listaPessoa) {
			
			if(Plista.getSexo() == sexo) {
				Plista.imprimir();
			}
			
		}
		
	}
	
	
	public static void imprimirListaOrdenadaPorNome(List<Pessoa> lista) {
		lista.sort((p1 , p2) -> p1.getNome().compareTo(p2.getNome()));
		imprimirLista(lista);
	}
	
	public static void imprimirListaOrdenadaPorIdade(List<Pessoa> lista) {
		lista.sort((p1 , p2) -> p1.getIdade().compareTo(p2.getIdade()));
		imprimirLista(lista);
	}
	public static void imprimirListaOrdenadaPorSexo(List<Pessoa> lista) {
		lista.sort((p1 , p2) -> p1.getSexo().compareTo(p2.getSexo()));
		imprimirLista(lista);
	}
	
}
