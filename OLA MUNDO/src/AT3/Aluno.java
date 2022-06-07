package AT3;

import java.util.Scanner;

public class Aluno {

	public String nome;
	public int matricula;
	public String turno;
	public Telefone numero;
	
    public Aluno(String nome, int matricula, String turno) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.turno = turno;            
    }        
    
    public Aluno() {
    	
    }
    
            
    public Aluno lerAluno() {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Sobre o aluno informe: ");
        System.out.println("Nome: ");
        String nome = leia.nextLine();
        System.out.println("Matrícula: ");
        int matricula = leia.nextInt();
        System.out.println("Turno: ");
        String turno = leia.next();
        
        return new Aluno(nome,matricula,turno);            
    }
    
    
    @Override
    public String toString() {
        
        return "Aluno [Nome=" + nome + ", Matricula=" + matricula + ", Turno=" + turno +  "]";
        
    }
    
    
    public void imprimir(Aluno[] discente) {
        
        for (Aluno aluno : discente) {
            
            
        }
        
    }
    

}
