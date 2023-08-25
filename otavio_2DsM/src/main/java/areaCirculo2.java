
import java.util.Scanner;
//Scanner pede para importa uma biblioteca, para isso basta clicar na lupa e escolher o primeiro da lista
/*
 * Fazendo o calculo da area do circulo no modo q a professora fez
 * Usar o "Scanner" para dar certo
 */

/**
 *
 * @author Aluno Otávio
 */
public class areaCirculo2 {
    public static void main(String[] args) {
        System.out.println("Escreva o valor do raio");
        Scanner scan = new Scanner(System.in);
        //"System.in" é para escrever no terminal, "Scanner" é para pegar o que foi escrito.
        // "scan" é o nome onde fica armazenado a escrita do terminal.
        double raio = scan.nextFloat();
        double area = Math.PI * raio * raio;
        
        System.out.println("O valor da area é " + area);
    }
}