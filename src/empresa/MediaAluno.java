package empresa;
import java.util.Scanner;
public class MediaAluno {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o nome do aluno: ");
        String nome = sc.nextLine();
        
        System.out.println("insira a primeira nota do Aluno: ");
        double nota1 = sc.nextDouble();
        
        System.out.println("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        sc.close();
        
        double media = (nota1 + nota2) / 2.0;
        
        if (media >= 7) {
        	System.out.println(nome + " Está Aprovado!");
        } else if (media >= 5) {
        	System.out.println(nome + " Está em recuperação!");
        } else {
        	System.out.println(nome + " Está Reprovado!");
        }
	}

}
