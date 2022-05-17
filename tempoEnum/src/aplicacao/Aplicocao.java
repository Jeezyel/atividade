package aplicacao;

import java.util.Scanner;

import metodos.Cliente;
import metodos.Compra;
import metodos.Cor;
import metodos.Nacimento;
import metodos.Produto;

public class Aplicocao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Compra compra ;
		Produto aceso = new Produto() ;

		
		
		System.out.println("qual produto você quer \n carro \n moto");
		String nomeProduto = leia.next();
		
		System.out.println("qual cor do produto (informe o nomero)");
		System.out.println(aceso.Cores());
		
		Cor corProduto = null;
		
		switch (leia.nextInt()) {
		case 1:
			corProduto = Cor.BRANCO ;
			break;
		case 2:
			corProduto = Cor.PRETO ;
			break;
		case 3:
			corProduto = Cor.PRATA ;
			break;
		case 4:
			corProduto = Cor.AZUL ;
			break;
			

		default:
			System.out.println("valor invalido");
			
			break;
		}
		
		
		Produto produto = new Produto(nomeProduto , corProduto) ;
		
		System.out.println("informe data de nacimento");
		System.out.println("dia: ");
		int dia = leia.nextInt();
		System.out.println("mex: ");
		int mex = leia.nextInt();
		System.out.println("ano: ");
		int ano = leia.nextInt();
		
		Nacimento naci = new Nacimento(dia,mex,ano);
		
		System.out.println("informe seu nome e cpf");
		System.out.println("nome: ");
		String nome = leia.next();
		System.out.println("CPF: ");
		String cpf = leia.next();
		
		
		
		Cliente cli = new Cliente(nome , cpf, naci);
		
		compra = new Compra(cli , produto);
		
		System.out.println(compra.toString());
	}

}
