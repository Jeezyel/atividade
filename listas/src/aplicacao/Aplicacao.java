package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Pessoa;
import modelo.Sexo;

public class Aplicacao {

	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		Scanner leia = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		int i = 0;
		while( i < 2 ) {
			System.out.println("informe sou Primeiro nome: ");
			String nome = leia.next();
			
			System.out.println("informe sou CPF: ");
			String cpf = leia.next();
			
			System.out.println("informe sou Sexo \n0- Feminino \n1- Masculino \n2- Não Binario: ");
			int sexoo = leia.nextInt();
			
			
			Sexo sexo = p.testeSexo(sexoo);
			
			Pessoa pessoa = new Pessoa(nome , cpf , sexo);
			lista.add(pessoa);
			i++ ;
		}

		p.imprimirTudo(lista);
		
		
		
		for (int j = 0; j < lista.size(); j++) {
			if(p.getSexo().equals(Sexo.MASCULINO)) {
				lista.remove(i);
			}
		}
		
		
		
		
		p.imprimirTudo(lista);
	}

}
