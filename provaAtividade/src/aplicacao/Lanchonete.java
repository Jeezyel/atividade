package aplicacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelo.Bebida;
import modelo.Comida;
import modelo.Produto;

public class Lanchonete implements Crud{
	private Produto comida = new Comida();
	List<Produto>lista = new ArrayList<Produto>();
	
	public static void main(String[] args) {
		
		
		
		
	
	
	}

	@Override
	public void inserir(Produto produto) {
		lista.add(produto);
		
	}

	@Override
	public void excluir(int posicao) {
		lista.remove(posicao);
		
	}

	@Override
	public void listaTodosProduto() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
	}

	@Override
	public void listaTodosComidas() {
		for (Produto produto : lista) {
			if(produto instanceof Comida) {
				System.out.println(produto.toString());
			}
			
		}
		
	}

	@Override
	public void listaTodasBebidas() {
		for (Produto produto : lista) {
			if(produto instanceof Bebida) {
				System.out.println(produto.toString());
			}
			
		}
		
	}
	
}
