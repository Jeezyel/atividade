package AT2;

import java.util.Scanner;

public class Principal {
    
    static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
            
            Aluno discente[] = new Aluno[10];
            
            for (int i = 0; i < discente.length; i++) {
            	
            Aluno a = new Aluno();
            
            System.out.println("Sobre o aluno informe: ");
            
            System.out.println("O nome aluno: ");
            a.nome = leia.next();
            
            System.out.println("numero da matrícula: ");
            a.matricula = leia.nextInt(); 
            
            System.out.println("O turno (vespertino/matutino/noturno): ");            
            a.turno = leia.next();
            
            a.numero = new Telefone();
            
            System.out.println("O DDD Da sua região: ");            
            a.numero.ddd = leia.nextInt();
            
            System.out.println("O número do telefone: ");            
            a.numero.numero = leia.nextInt();
                        
            discente[i]= a;
            
            }
            
            for (int i = 0; i < discente.length; i++) {
                System.out.println(discente[i].nome);
                System.out.println(discente[i].matricula);
                System.out.println(discente[i].turno);
                System.out.println(discente[i].numero.ddd);
                System.out.println(discente[i].numero.numero);
                
            }
            
    }
}