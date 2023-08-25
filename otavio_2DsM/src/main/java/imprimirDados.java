
import java.util.Scanner;

/*
 * Vamos capturar dados e imprimir no terminal
 * Os dados são: Nome e Sobrenome, Idade, Faculdade, Se você gosta do curso?
 */

/**
 *
 * @author Aluno Otávio
 */
public class imprimirDados {
    public static void main(String[] args) {
        System.out.println("Escreva o seu nome e sobrenome");
        Scanner nomePessoa = new Scanner(System.in);
        String nP = nomePessoa.nextLine();
        
        System.out.println("Escreva a sua Idade");
        Scanner Idade = new Scanner(System.in);
        int dade = Idade.nextInt();
        
        System.out.println("Escreva a faculdade que quer fazer");
        Scanner Faculdade = new Scanner(System.in);
        String Facul = Faculdade.nextLine();
        
        System.out.println("Você gosta do curso?");
        Scanner Curso = new Scanner(System.in);
        String Gostar = Curso.nextLine();
        
        System.out.println("Seu nome é " + nP);
        System.out.println("A sua idade é " + dade);
        System.out.println("A faculdade que quer é " + Facul);
        System.out.println("se você gosta do curso " + Gostar);
    }
}
