package aplicacao;

import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;
import modelo.Sexo;
import modelo.Telefone;

public class App {

	public static void main(String[] args) {
		
		
		List<Pessoa> listaPessoa = new ArrayList();
		Pessoa p = new Pessoa();

		
		
		
//		listaPessoa.add(new Pessoa("PP" , 20 , Sexo.MASCULINO , new Telefone("63" , "674688465")));
//		listaPessoa.add(new Pessoa("TT" , 21 , Sexo.FEMININO , new Telefone("63" , "5656846565")));
//		listaPessoa.add(new Pessoa("QQ" , 26 , Sexo.NAO_BINARIO , new Telefone("63" , "848465484451")));
//		listaPessoa.add(new Pessoa("XX" , 14 , Sexo.NAO_BINARIO , new Telefone("33" , "894684684")));
//		listaPessoa.add(new Pessoa("LL" , 50 , Sexo.MASCULINO , new Telefone("33" , "8888888888")));
		
		
		for (int i = 0; i < 5; i++) {
			listaPessoa.add(Pessoa.lerDados());
		}
		
		p.imprimirLista(listaPessoa , Sexo.MASCULINO);
		
		System.out.println("\n \n");
		
		Pessoa.imprimirLista(listaPessoa);
		
		System.out.println("\n \n");
		
		Pessoa.imprimirListaOrdenadaPorNome(listaPessoa);
		
		System.out.println("\n \n");
		
		Pessoa.imprimirListaOrdenadaPorIdade(listaPessoa);

		System.out.println("\n \n");
		
		Pessoa.imprimirListaOrdenadaPorSexo(listaPessoa);
		
		System.out.println("\n \n");
		
		Pessoa.imprimirLista(listaPessoa);
		
		
		
		
		
		
		

	}

}
