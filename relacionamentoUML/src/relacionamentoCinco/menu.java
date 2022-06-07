package relacionamentoCinco;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Scanner leia = new Scanner(System.in);
		
		
		
		
		System.out.println("menu: \n 1- addCliente \n 2- procurar cliente por ddd \n 3- imprimir lita de clientes ");
		int menu = leia.nextInt();
		
		switch (menu) {
		case 1: {
			AddCliente();
			
			break;
		}
		case 2: {
			ClientePorDdd();
			
			break;
		}
		case 3: {
			imprimir();
			
			break;
		}
		default:
			System.out.println("opção invalida");
			break;
		}

		
		
	}
	private static void imprimir () {

		
		
	}
	private static void AddCliente() {
		
	}
	private static void ClientePorDdd() {
		
		
		
	}
	

}
