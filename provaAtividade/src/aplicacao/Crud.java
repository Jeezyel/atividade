package aplicacao;

import modelo.Produto;

public interface Crud {
	public void inserir(Produto produto);
	public void excluir(int posicao);
	public void listaTodosProduto();
	public void listaTodosComidas();
	public void listaTodasBebidas();

}
